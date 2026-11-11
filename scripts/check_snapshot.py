#!/usr/bin/env python3
"""Verify the pinned contracts, generated operation coverage and deterministic generated files."""
import hashlib,json,pathlib,subprocess
root=pathlib.Path(__file__).resolve().parents[1];resources=root/'src/main/resources'
provenance=json.loads((root/'contract-provenance.json').read_text())
if (resources/'META-INF/contract-provenance.json').read_bytes()!=(root/'contract-provenance.json').read_bytes():raise SystemExit('Bundled provenance differs from contract-provenance.json')
for name,digest in provenance['sha256'].items():
 if hashlib.sha256((resources/name).read_bytes()).hexdigest()!=digest:raise SystemExit('Pinned hash mismatch: '+name)
modules=json.loads((resources/'contracts/manifest.json').read_text())['contracts']
if sorted(modules)!=sorted(k for k in provenance['sha256'] if k!='contracts/manifest.json'):raise SystemExit('Provenance does not list exactly the manifest modules')
# contract_digest = SHA-256 of the canonical JSON of the sorted module path -> SHA-256 mapping.
mapping={m:provenance['sha256'][m] for m in sorted(modules)}
if hashlib.sha256(json.dumps(mapping,sort_keys=True,separators=(',',':')).encode()).hexdigest()!=provenance['contract_digest']:raise SystemExit('contract_digest does not match the module hashes')
declared=[op for m in modules for path in json.loads((resources/m).read_text())['paths'].values() for method,op in path.items() if method in ('get','post','put','delete','patch')]
operations=json.loads((resources/'contracts/operations.json').read_text())
if len(operations)!=len(declared) or sum(x['enabled'] for x in operations)!=sum(op.get('x-sdk-generation-enabled',True) for op in declared):raise SystemExit('Generated operations differ from the manifest')
catalog=json.loads((root/'model-catalog.json').read_text())
paths=list((root/'src/main/java/com/webmania/sdk/model').rglob('*.java'))+[root/'src/main/java/com/webmania/sdk/WebmaniaClient.java',root/'model-catalog.json',resources/'contracts/operations.json']
if catalog['generated_types']!=len(paths)-3:raise SystemExit('Model catalog count differs from the generated files')
before={str(p.relative_to(root)):hashlib.sha256(p.read_bytes()).hexdigest() for p in paths};subprocess.run(['python3','scripts/generate.py'],cwd=root,check=True)
after={str(p.relative_to(root)):hashlib.sha256(p.read_bytes()).hexdigest() for p in list((root/'src/main/java/com/webmania/sdk/model').rglob('*.java'))+[root/'src/main/java/com/webmania/sdk/WebmaniaClient.java',root/'model-catalog.json',resources/'contracts/operations.json']}
if before!=after:raise SystemExit('Generation is not deterministic')
print(f"Pinned hashes and deterministic generation verified: {len(modules)} modules, {len(operations)} operations, {sum(x['enabled'] for x in operations)} enabled, {catalog['generated_types']} types")
