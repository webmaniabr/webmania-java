#!/usr/bin/env python3
"""Resolve the installed candidate by Maven coordinates and execute it through a real loopback socket."""
import argparse,hashlib,json,os,pathlib,shutil,socket,subprocess,tempfile,threading
parser=argparse.ArgumentParser();parser.add_argument('--repository',required=True);parser.add_argument('--evidence',required=True);args=parser.parse_args()
root=pathlib.Path(__file__).resolve().parents[1];repo=pathlib.Path(args.repository).resolve();evidence=pathlib.Path(args.evidence).resolve();evidence.mkdir(parents=True,exist_ok=True)
artifact=repo/'com/webmania/webmania-sdk/0.1.0-preview.9/webmania-sdk-0.1.0-preview.9.jar'
expected=hashlib.sha256(artifact.read_bytes()).hexdigest()
with tempfile.TemporaryDirectory(prefix='webmania-java-consumer-')as folder:
 consumer=pathlib.Path(folder)/'consumer';shutil.copytree(root/'examples/consumer',consumer,ignore=shutil.ignore_patterns('target'))
 command=['mvn','-o','-B','-ntp','-Dmaven.repo.local='+str(repo),'package','dependency:build-classpath','-Dmdep.outputFile=classpath.txt']
 build=subprocess.run(command,cwd=consumer,stdout=subprocess.PIPE,stderr=subprocess.STDOUT,text=True);(evidence/'consumer-build.log').write_text(build.stdout)
 if build.returncode:raise SystemExit('Consumer Maven resolution/build failed')
 classpath=(consumer/'classpath.txt').read_text().strip();resolved=[pathlib.Path(p)for p in classpath.split(os.pathsep)if 'webmania-sdk' in p]
 if len(resolved)!=1 or resolved[0].resolve()!=artifact or hashlib.sha256(resolved[0].read_bytes()).hexdigest()!=expected:raise SystemExit('Consumer resolved a different candidate')
 fixture=next(x for x in json.loads((root/'src/test/resources/operation-fixtures.json').read_text())if x['id']=='monitorListCompanies')
 payload=json.dumps(fixture['response'],separators=(',',':')).encode();listener=socket.socket();listener.bind(('127.0.0.1',0));listener.listen();listener.settimeout(15);received=[]
 def serve():
  try:
   conn,_=listener.accept()
   with conn:
    conn.settimeout(10);raw=b''
    while b'\r\n\r\n'not in raw:
     chunk=conn.recv(4096)
     if not chunk:break
     raw+=chunk
    received.append(raw)
    conn.sendall(b'HTTP/1.1 200 OK\r\nContent-Type: application/json\r\nConnection: close\r\nContent-Length: '+str(len(payload)).encode()+b'\r\n\r\n'+payload)
  finally:listener.close()
 thread=threading.Thread(target=serve,daemon=True);thread.start();env=os.environ.copy();env['WEBMANIA_MONITOR_TOKEN']='synthetic-monitor'
 java=str(pathlib.Path(env['JAVA_HOME'])/'bin/java')if env.get('JAVA_HOME')else 'java'
 run=subprocess.run([java,'-cp',str(consumer/'target/classes')+os.pathsep+classpath,'Quickstart','http://127.0.0.1:'+str(listener.getsockname()[1])],cwd=consumer,env=env,stdout=subprocess.PIPE,stderr=subprocess.STDOUT,text=True,timeout=20);thread.join(timeout=15)
 (evidence/'consumer-run.log').write_text(run.stdout)
 if run.returncode or run.stdout.strip()!='HTTP 200' or len(received)!=1:raise SystemExit('Installed candidate consumer execution failed')
 request=received[0];assert request.startswith(b'GET /2/monitor/empresas?page=1&per_page=10 HTTP/1.1\r\n');assert b'Authorization: Bearer synthetic-monitor\r\n'in request;assert b'X-Consumer-'not in request
 version=subprocess.run([java,'-version'],stdout=subprocess.PIPE,stderr=subprocess.STDOUT,text=True,check=True).stdout
 manifest={'status':'pass','classification':'controlled installed Maven consumer, not Webmania live evidence','artifact_sha256':expected,'runtime':version.strip(),'request_method':'GET','request_path':'/2/monitor/empresas','http_status':200,'resolved_coordinate':'com.webmania:webmania-sdk:0.1.0-preview.9'}
 (evidence/'consumer-result.json').write_text(json.dumps(manifest,indent=2)+'\n');print(json.dumps(manifest,indent=2))
