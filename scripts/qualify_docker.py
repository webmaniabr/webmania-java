#!/usr/bin/env python3
"""Qualify the same locally installed JAR on pinned Linux JDK images; no registry publication."""
import argparse,hashlib,json,os,pathlib,subprocess
p=argparse.ArgumentParser();p.add_argument('--repository',required=True);p.add_argument('--evidence',required=True);a=p.parse_args();root=pathlib.Path(__file__).resolve().parents[1];repository=pathlib.Path(a.repository).resolve();evidence=pathlib.Path(a.evidence).resolve();evidence.mkdir(parents=True,exist_ok=True)
images={
 '17':'maven@sha256:e4a7ace3dc0d645ed97f8d9ad0b0d3f0b14fa8d150138f27f116d7105a639b82',
 '21':'maven@sha256:6fdc855a6ed81d288ca7ca37ac6ff5e9308b612485c0801d70b25a858c83d237',
 '25':'maven@sha256:407c4423cec0cf2981055bc2c6c0dc211d9605b6669279b95997f2d1c7e91e2c'}
jar=repository/'com/webmania/webmania-sdk/0.1.0-preview.9/webmania-sdk-0.1.0-preview.9.jar';sha=hashlib.sha256(jar.read_bytes()).hexdigest();cp=str(root/'target/test-classes')+os.pathsep+str(jar)+os.pathsep+(root/'target/candidate-test-classpath.txt').read_text().strip();rows=[]
for version,image in images.items():
 row=evidence/('linux-'+version);row.mkdir(exist_ok=True)
 inspect=subprocess.run(['docker','image','inspect',image],stdout=subprocess.PIPE,stderr=subprocess.STDOUT,text=True,check=True);metadata=json.loads(inspect.stdout)[0]
 runtime=subprocess.run(['docker','run','--rm','--network=none','--cpus=1','--memory=1536m',image,'java','-version'],stdout=subprocess.PIPE,stderr=subprocess.STDOUT,text=True,check=True).stdout.strip();(row/'runtime.log').write_text(runtime+'\n')
 command=['docker','run','--rm','--network=none','--cpus=1','--memory=1536m','--name','webmania-java-'+version+'-qualification-'+str(os.getpid()),'-v',str(root)+':'+str(root)+':ro','-v',str(repository)+':'+str(repository),'-v',str(evidence)+':'+str(evidence),'-w',str(root),image,'java','-Dwebmania.expectedArtifactSha='+sha,'-cp',cp,'org.junit.platform.console.ConsoleLauncher','execute','--scan-classpath','--include-package=com.webmania.sdk','--fail-if-no-tests','--details=summary','--reports-dir='+str(row/'junit')]
 print('Qualifying Linux Java '+version+' with '+image,flush=True)
 name=command[command.index('--name')+1]
 try:run=subprocess.run(command,stdout=subprocess.PIPE,stderr=subprocess.STDOUT,text=True,timeout=180);output,code=run.stdout,run.returncode
 except subprocess.TimeoutExpired as expired:
  # The timeout only kills the local docker client: remove the named container and record the failure.
  subprocess.run(['docker','rm','-f',name],stdout=subprocess.DEVNULL,stderr=subprocess.DEVNULL,check=False)
  output=(expired.stdout.decode('utf-8','replace') if isinstance(expired.stdout,bytes) else expired.stdout or '')+'\nTimed out after 180 seconds\n';code=124
 (row/'candidate-tests.log').write_text(output)
 result={'status':'pass'if code==0 else'fail','classification':'controlled installed JAR and clean Maven consumer, not Webmania live evidence','artifact_sha256':sha,'runtime':runtime,'image':image,'image_id':metadata['Id'],'platform':metadata['Os']+'/'+metadata['Architecture'],'junit_exit_code':code};(row/'candidate-result.json').write_text(json.dumps(result,indent=2)+'\n');rows.append(result)
 print(output[-1700:],flush=True)
 if code:raise SystemExit(code)
(evidence/'linux-matrix.json').write_text(json.dumps(rows,indent=2)+'\n')
