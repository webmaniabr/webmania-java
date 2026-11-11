#!/usr/bin/env python3
"""Run the socket/schema suite with the SDK loaded from the exact installed JAR, excluding project classes."""
import argparse,hashlib,json,os,pathlib,subprocess
p=argparse.ArgumentParser();p.add_argument('--repository',required=True);p.add_argument('--evidence',required=True);a=p.parse_args()
root=pathlib.Path(__file__).resolve().parents[1];repo=pathlib.Path(a.repository).resolve();evidence=pathlib.Path(a.evidence).resolve();evidence.mkdir(parents=True,exist_ok=True)
jar=repo/'com/webmania/webmania-sdk/0.1.0-preview.9/webmania-sdk-0.1.0-preview.9.jar';sha=hashlib.sha256(jar.read_bytes()).hexdigest();classpath=root/'target/candidate-test-classpath.txt'
cmd=['mvn','-o','-B','-ntp','-Dmaven.repo.local='+str(repo),'dependency:build-classpath','-DincludeScope=test','-Dmdep.outputFile='+str(classpath)]
build=subprocess.run(cmd,cwd=root,stdout=subprocess.PIPE,stderr=subprocess.STDOUT,text=True);(evidence/'test-classpath.log').write_text(build.stdout)
if build.returncode:raise SystemExit('Cannot resolve test dependencies')
cp=str(root/'target/test-classes')+os.pathsep+str(jar)+os.pathsep+classpath.read_text().strip();java=str(pathlib.Path(os.environ['JAVA_HOME'])/'bin/java')if os.environ.get('JAVA_HOME')else 'java'
run=subprocess.run([java,'-Dwebmania.expectedArtifactSha='+sha,'-cp',cp,'org.junit.platform.console.ConsoleLauncher','execute','--scan-classpath','--include-package=com.webmania.sdk','--fail-if-no-tests','--details=summary','--reports-dir='+str(evidence/'junit')],cwd=root,stdout=subprocess.PIPE,stderr=subprocess.STDOUT,text=True,timeout=120);(evidence/'candidate-tests.log').write_text(run.stdout)
version=subprocess.run([java,'-version'],stdout=subprocess.PIPE,stderr=subprocess.STDOUT,text=True,check=True).stdout
manifest={'status':'pass'if run.returncode==0 else'fail','classification':'controlled installed JAR socket/schema tests, not Webmania live evidence','artifact_sha256':sha,'runtime':version.strip(),'junit_exit_code':run.returncode}
(evidence/'candidate-result.json').write_text(json.dumps(manifest,indent=2)+'\n');print(run.stdout);print(json.dumps(manifest,indent=2));raise SystemExit(run.returncode)
