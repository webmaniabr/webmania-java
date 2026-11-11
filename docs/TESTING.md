# Development tests

Run Maven, Java and the Python verification helpers inside a local Docker development container with Maven 3.9 and JDK 17 or newer. Tests use synthetic loopback HTTP/TLS servers and require no real API credentials.

Inside the container, build and test with `mvn -B -ntp -Dmaven.repo.local=.maven-local install`, then verify the installed JAR with `python3 scripts/run_candidate_tests.py --repository .maven-local --evidence target/check-installed` and `python3 scripts/verify_consumer.py --repository .maven-local --evidence target/check-consumer`.

The test resources are public synthetic fixtures. `scripts/check_snapshot.py` checks the contract hashes and deterministic generated sources. `scripts/qualify_docker.py` can verify an installed JAR across its pinned local Docker images; its image and dependency caches must be prepared in advance.

Keep generated logs, receipts and Maven caches out of version control. Rebuild packages after source or documentation changes; previously built JARs do not attest to the changed source tree.

## Testes a partir da fonte

```sh
mvn -B -ntp -Dmaven.repo.local=.maven-local install
python3 scripts/run_candidate_tests.py --repository .maven-local --evidence target/check-installed
python3 scripts/verify_consumer.py --repository .maven-local --evidence target/check-consumer
```

Os testes usam servidores HTTP/TLS loopback sintéticos e não exigem credenciais reais. Detalhes em [docs/TESTING.md](TESTING.md).
