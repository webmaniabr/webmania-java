# Detalhes técnicos de integração

Este documento reúne os detalhes técnicos do SDK para Java que complementam o [README](../README.md): autenticação, URL base, limites de transporte, arquivos, relatórios e o tratamento do resultado fiscal. O texto é o mesmo que estava no README até esta versão.

## Escopo e disponibilidade

Integração de **Emissor Fiscal e Monitor Fiscal** em aplicações de servidor. O Emissor abrange NF-e/NFC-e na API1 e NFS-e, CT-e/CT-e OS, MDF-e, NFCom e DC-e na API2, com arquivos, eventos e as três operações gerenciais B2B públicas da API1. O Monitor mantém apenas as famílias de documentos e capacidades do seu contrato documentado.

Disponível no repositório público [github.com/webmaniabr/webmania-java](https://github.com/webmaniabr/webmania-java), com instalação a partir do clone (veja a seção Instalação). Ainda não há publicação em registro de pacotes; os nomes e versões abaixo identificam os pacotes gerados a partir desta fonte. Regras do provedor, aceitação fiscal real e plataformas adicionais permanecem com limitações explícitas.

## Visão geral para desenvolvedores

| Item | Detalhe |
|---|---|
| Status | Disponível no GitHub: versão `0.1.0-preview.9` (`com.webmania:webmania-sdk`), instalada a partir do clone do repositório em um repositório Maven local; ainda sem publicação no Maven Central ou em outro registro de pacotes |
| Runtime | JDK 17+; Maven 3.9 para consumidores Maven |
| Cliente | `com.webmania.sdk.WebmaniaClient(ClientConfig, Credentials)` — o escopo da credencial define o serviço (NF-e/NFC-e API 1.0, gerencial B2B, emissor API 2.0, Monitor Fiscal e arquivos) |
| Cobertura | Modelos tipados por módulo em `com.webmania.sdk.model.*`; catálogo em [model-catalog.json](../model-catalog.json) |
| Erros | `ApiException` (`RuntimeException`), com `kind()` (`ApiException.Kind`), `status()` e `outcomeUncertain()`; cancelamento em `ApiCancellationException` |
| Contrato | OpenAPI fixado em [contract-provenance.json](../contract-provenance.json) por `contract_digest` (`371a499f74012bb6b41f23642869dee4954e8394dcba7642edc701aedb3dd59e`) e SHA-256 de cada módulo |

### Autenticação

Crie a credencial do serviço com a fábrica `Credentials`:

- `Credentials.company(key, secret, token, tokenSecret)` e `Credentials.reseller(...)` — API 1.0, enviadas nos cabeçalhos `X-Consumer-Key`, `X-Consumer-Secret`, `X-Access-Token` e `X-Access-Token-Secret`.
- `Credentials.issuer(token)`, `Credentials.monitor(token)` e `Credentials.fileCompany(token)` — API 2.0, enviadas como `Authorization: Bearer <token>`. O download de relatório atual aceita o Bearer da empresa (`issuer` ou `fileCompany`), as quatro credenciais da empresa API 1.0 ou nenhuma credencial.
- `Credentials.documentToken(token)` e `Credentials.anonymousFile()` — modos explícitos de acesso a arquivos.

O exemplo abaixo lê o token com `System.getenv("WEBMANIA_MONITOR_TOKEN")`. Um consumidor Maven completo está em [examples/consumer](../examples/consumer).

## Requisitos

JDK 17+; Maven 3.9 para consumidores Maven. Consulte [docs/TESTING.md](TESTING.md) para os testes de desenvolvimento. Android e Windows não têm execução qualificada nesta versão.

## Instalação

Clone o repositório público e instale o SDK em um repositório Maven local a partir do clone:

```sh
git clone https://github.com/webmaniabr/webmania-java.git
mvn -B -ntp -f webmania-java/pom.xml -Dmaven.repo.local=/caminho/feed-maven install
```

Declare no consumidor:

```xml
<dependency>
  <groupId>com.webmania</groupId>
  <artifactId>webmania-sdk</artifactId>
  <version>0.1.0-preview.9</version>
</dependency>
```

Use mvn -Dmaven.repo.local=/caminho/feed-maven compile no consumidor; esse repositório local recebe o SDK e suas dependências no `install`. As coordenadas ainda não estão publicadas no Maven Central. Não é necessário executar o gerador.

## Primeira consulta

Configure somente a credencial do serviço escolhido, por instância, a partir de ambiente privado ou cofre de segredos. O exemplo não emite nem cancela documentos. Execute consultas apenas com conta e ambiente autorizados; uma origem de fixture controlada deve ser configurada explicitamente pela API do cliente.

```java
import com.webmania.sdk.*;
import com.webmania.sdk.model.api2monitorreads.MonitorListCompaniesRequest;
import java.math.BigInteger;

try (var client = new WebmaniaClient(
        ClientConfig.defaults(),
        Credentials.monitor(System.getenv("WEBMANIA_MONITOR_TOKEN")))) {
    var request = new MonitorListCompaniesRequest()
        .setPage(BigInteger.ONE)
        .setPerPage(BigInteger.TEN);
    var result = client.monitorListCompanies(request);
    System.out.println(result.status());
    // result.data() contém a página tipada. Evite registrar dados fiscais.
}
```

A construção do cliente não comprova habilitação da conta. Respostas de sucesso e conversões explícitas para JSON podem conter dados fiscais, credenciais novas ou URLs privadas. Exponha apenas os campos necessários à aplicação.

## Integração e limites

`WebmaniaClient` oferece operações síncronas e `Async`, com parâmetros próprios e corpo DTO separado. `CompletableFuture.cancel(true)` interrompe o transporte e o DNS da chamada; `ApiCancellationException.context()` dá acesso deliberado à operação, incerteza e referência protegida. `close()` encerra chamadas pendentes e executores da instância.

Modelos usam getters/setters tipados; unions oferecem `ofVariantN` e `asVariantN`. Use BigDecimal/BigInteger para precisão, `has`, `explicitNull` e `omit` para presença, e `extension` para campos adicionais sem substituir nomes declarados. `toJson()` e `toJsonBytes()` são acesso deliberado aos dados. Não serialize unions por mapeamento bean Jackson arbitrário.

`ApiException` informa kind, operation, status e outcomeUncertain. `reference()` pode estar ausente; verifique antes de acessar seu value. Diagnósticos retêm projeção limitada e redigida, sem corpo bruto ou causa de baixo nível. Timeout após possível envio pode exigir conciliação, inclusive em GET com efeito declarado.

`Download.kind()` distingue PDF, PDF criptografado, XML, ZIP, ZIP criptografado, XLSX, CSV e HTML. `encrypted()` descreve a representação; `protection()` descreve a autenticação. Pendência e redirect não têm kind inspecionado; o destino protegido só é acessado explicitamente. Arquivos ficam em memória: padrão de resposta 16 MiB e corpo 8 MiB, configuráveis até 64 MiB. ZIP comum recebe inspeção estrutural e de metadados; não promete CRC/descompressão de todos os membros. Não há streaming público.

Helpers de paginação usam PaginationOptions com limites de páginas, itens e prazo, preservam per_page e retornam posição de continuação. `processing().monitorImportAsync` consulta importação existente; `fiscalReportAsync` repete somente o mesmo relatório congelado. PollingOptions exige intervalo de pelo menos cinco segundos. Estado desconhecido interrompe a espera sem virar conclusão.

## Credenciais e resultado fiscal

Credenciais da empresa API1, revenda API1, Bearer do emissor API2 e Bearer Monitor pertencem a escopos diferentes. Arquivos exigem a modalidade de acesso documentada. Uma falha não autoriza trocar automaticamente o modo ou a credencial. Mantenha segredos no servidor.

O catálogo contém 102 operações habilitadas. `nfeDownloadIbsCbsEventXml` não está disponível nesta versão do SDK: a chamada falha com `CAPABILITY_DISABLED` e nenhuma requisição é enviada. Condições fiscais, municipais, de cadastro, provedor e implantação ainda pendentes continuam sujeitas ao contrato e ao serviço. Validação local, cálculo ou prévia não comprovam autorização fiscal.

Não há retry automático de operação nem seguimento automático de redirects. Depois de possível envio de uma operação com efeito, uma falha pode indicar resultado desconhecido. Preserve o seletor original com segurança, consulte a tentativa anterior e decida explicitamente como prosseguir. Uma referência protegida exige acesso deliberado e pode estar ausente; não é uma chave de idempotência.

## Arquivos e processamento

Verifique tipo de resultado, status e representação antes de consumir bytes. JSON pendente, HTML e redirect não comprovam PDF pronto. Proteção de PDF/ZIP é distinta da autorização de download; não há descriptografia automática nem confirmação de autenticidade fiscal. O reconhecimento de formatos cobre somente o perfil documentado desta implementação. Uma Location revelada continua privada e exige decisão explícita de origem e autenticação para outra transferência.

Paginação e espera são optativas e limitadas quando disponíveis. Um estado futuro ou desconhecido não significa conclusão. Não repita emissão, cancelamento ou importação inicial como se fossem consultas de processamento.

Para migrar uma integração anterior, remapeie métodos, modelos e escopos de credencial pela referência desta versão. Não há promessa de substituição automática de outro SDK; compare também o changelog quando disponível.

O download público de relatório usa uma capacidade sensível e consome a quota prevista no contrato. Depois de um possível envio, perda de resposta conserva `outcomeUncertain()`. Rejeição HTTP4xx completa do relatório permanece conhecida; não há retry automático nem exposição da capacidade como referência de recuperação.

Relatórios do armazenamento anterior (`fiscalDownloadReport`) chegam como CSV ou XLSX rotulados `text/xml`: o formato é identificado pelos bytes (assinatura ZIP = XLSX, caso contrário CSV preservado byte a byte); XML, HTML ou JSON nunca são aceitos como relatório, e nenhuma outra operação de arquivo ganha essa tolerância. Relatórios atuais retornam uma `url` na origem da API 2.0: use `client.fiscalReportDownload(url)` (ou `fiscalDownloadReportV2` com o UUID). Só uma URL da origem configurada do módulo `api2/reports.openapi.json` com o caminho `/relatorios/<uuid>` é aceita; outro host, informação de usuário, troca de esquema, query ou caminho fora do prefixo falha com `VALIDATION` antes de qualquer credencial ser usada, e redirects nunca são seguidos.

## Ambiente e URL base

Cada módulo do contrato tem a origem pública padrão do OpenAPI (`https://webmania.com.br/api` para NF-e/NFC-e, `https://nfe.webmania.com.br` para arquivos da API 1.0 e `https://api.webmania.com.br` para a API 2.0). Para outro ambiente, configure explicitamente a origem HTTPS de cada módulo, com prefixo de caminho quando necessário:

```java
var config = ClientConfig.builder()
    .origin("api1/fiscal.openapi.json", URI.create(System.getenv("WEBMANIA_API1_BASE_URL")))
    .origin("api1/files.openapi.json", URI.create(System.getenv("WEBMANIA_FILES_BASE_URL")))
    .origin("api2/nfse-issuance.openapi.json", URI.create(System.getenv("WEBMANIA_API2_BASE_URL")))
    .build();
```

A origem precisa ser HTTPS (HTTP só em loopback explícito), sem informação de usuário, query, fragmento, segmentos de ponto ou porta inválida; uma origem inválida falha na configuração, antes de DNS ou socket. Um módulo sem origem configurada usa a origem pública padrão.

## Documentação para assistentes e contratos

Índices em Markdown para assistentes: [documentação Webmania](https://webmania.com.br/docs/llms.txt) e [API 2.0](https://api.webmania.com.br/llms.txt). Contratos OpenAPI: [API 2.0](https://api.webmania.com.br/docs/openapi) e [NF-e](https://webmania.com.br/docs/rest-api-nfe/?format=openapi).

No catálogo de SDKs, `java` aparece como disponível no repositório público, com instalação pelo clone; plataforma Java 17+. Estar listado nesses índices não amplia a cobertura documentada deste SDK.
