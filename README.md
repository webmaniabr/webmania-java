<p align="center"><img src=".github/assets/webmania-logo.png" alt="Webmania" width="320"></p>

# Webmania SDK para Java

Através do emissor fiscal da Webmania®, você conta com a emissão e o arquivamento dos seus documentos fiscais, cálculo automático de impostos, geração do DANFE para impressão e envio automático de e-mails para os clientes. Com este SDK, o seu sistema em Java se integra à nossa REST API para emitir, consultar e cancelar NF-e, NFC-e, NFS-e, CT-e, MDF-e, NFCom e DC-e, baixar XML e PDF dos documentos e usar o Monitor Fiscal.

- Emissor de Nota Fiscal Webmania®: [Saiba mais](https://webmania.com.br/nota-fiscal-eletronica/)
- Documentação da REST API: [Visualizar](https://webmania.com.br/docs/)
- Índice da documentação para assistentes de IA: [llms.txt](https://webmania.com.br/docs/llms.txt)

## Requisitos

- Contrate um dos planos de Nota Fiscal Eletrônica da Webmania®: [Assine agora mesmo](https://webmania.com.br/nota-fiscal-eletronica/#plans-section).
- JDK 17 ou superior e Maven 3.9.
- Credenciais de acesso da sua empresa, disponíveis no [Painel de Controle](https://webmania.com.br/painel/).

## Instalação

O SDK é distribuído pelo repositório [github.com/webmaniabr/webmania-java](https://github.com/webmaniabr/webmania-java) e ainda não está publicado no Maven Central. Clone o repositório e instale o SDK em um repositório Maven local:

```sh
git clone https://github.com/webmaniabr/webmania-java.git
mvn -B -ntp -f webmania-java/pom.xml -Dmaven.repo.local=/caminho/feed-maven install
```

Declare a dependência no `pom.xml` da sua aplicação:

```xml
<dependency>
  <groupId>com.webmania</groupId>
  <artifactId>webmania-sdk</artifactId>
  <version>0.1.0-preview.9</version>
</dependency>
```

Compile a aplicação com o mesmo repositório local (`mvn -Dmaven.repo.local=/caminho/feed-maven compile`), que recebeu o SDK e as suas dependências no `install`.

## Credenciais

Cada serviço usa a sua própria credencial. Guarde-as em variáveis de ambiente (ou em um cofre de segredos) no servidor e nunca as escreva no código-fonte:

| Variável de ambiente | Uso |
|---|---|
| `WEBMANIA_CONSUMER_KEY`, `WEBMANIA_CONSUMER_SECRET`, `WEBMANIA_ACCESS_TOKEN`, `WEBMANIA_ACCESS_TOKEN_SECRET` | NF-e, NFC-e e arquivos da NF-e (`Credentials.company`) |
| `WEBMANIA_ISSUER_TOKEN` | NFS-e, CT-e, MDF-e, NFCom e DC-e (`Credentials.issuer`) e seus arquivos (`Credentials.fileCompany`) |
| `WEBMANIA_MONITOR_TOKEN` | Monitor Fiscal (`Credentials.monitor`) |

```java
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.webmania.sdk.*;
import com.webmania.sdk.model.api1files.*;
import com.webmania.sdk.model.api1fiscal.*;
import com.webmania.sdk.model.api2emitterreads.*;
import com.webmania.sdk.model.api2nfseissuance.*;
import java.nio.file.Files;
import java.nio.file.Path;

var config = ClientConfig.defaults();
var nfe = new WebmaniaClient(config, Credentials.company(               // NF-e, NFC-e e arquivos da NF-e
    System.getenv("WEBMANIA_CONSUMER_KEY"), System.getenv("WEBMANIA_CONSUMER_SECRET"),
    System.getenv("WEBMANIA_ACCESS_TOKEN"), System.getenv("WEBMANIA_ACCESS_TOKEN_SECRET")));
var emissor = new WebmaniaClient(config,                                  // NFS-e, CT-e, MDF-e, NFCom e DC-e
    Credentials.issuer(System.getenv("WEBMANIA_ISSUER_TOKEN")));
var json = new ObjectMapper();
```

Cada `WebmaniaClient` atende o serviço da credencial que recebeu; reutilize a instância e feche-a com `close()` (ou `try`-with-resources) ao terminar. Cada operação devolve um `ApiResult`: `status()` traz o status HTTP e `data().toJson()` o JSON da resposta.

## Utilização

Os exemplos abaixo usam o ambiente de **homologação** (`ambiente` 2), em que os documentos não têm validade fiscal. Para emitir em produção, envie `ambiente` 1. Os pedidos são montados a partir de JSON; informe valores decimais como texto (`"44.90"`) para manter a precisão.

### Status do SEFAZ e certificado A1

```java
var sefaz = nfe.nfeGetSefazStatus(new NfeGetSefazStatusRequest()).data().toJson();
System.out.println(sefaz.path("status").asText());        // online ou offline

var certificado = nfe.nfeGetCertificateValidity(new NfeGetCertificateValidityRequest()).data().toJson();
System.out.println(certificado.path("expiration").asInt()); // dias até o vencimento do certificado A1
```

### Emitir NF-e

Para emitir uma NF-e, use o método `nfeIssueDocument` com o JSON da nota no campo `body`. O mesmo método emite NFC-e com `"modelo": 2`.

```java
JsonNode dados = json.readTree("""
    {
      "operacao": 1,
      "natureza_operacao": "Venda de produção do estabelecimento",
      "modelo": 1,
      "finalidade": 1,
      "ambiente": 2,
      "cliente": {
        "cpf": "000.000.000-00", "nome_completo": "Nome do Cliente",
        "endereco": "Av. Brg. Faria Lima", "numero": "1000", "bairro": "Itaim Bibi",
        "cidade": "São Paulo", "uf": "SP", "cep": "00000-000", "email": "nome@email.com"
      },
      "produtos": [{
        "nome": "Nome do produto", "codigo": "nome-do-produto", "ncm": "6109.10.00",
        "quantidade": "1", "unidade": "UN", "origem": 0,
        "subtotal": "44.90", "total": "44.90", "classe_imposto": "REF1000"
      }],
      "pedido": {"presenca": 2, "modalidade_frete": 9, "pagamento": 0, "forma_pagamento": "01", "total": "44.90"}
    }
    """);

JsonNode nota = nfe.nfeIssueDocument(new NfeIssueDocumentRequest(json.createObjectNode().set("body", dados))).data().toJson();
String uuid = nota.path("uuid").asText();                // identificador único da nota fiscal
System.out.println(nota.path("status").asText());        // aprovado, reprovado, processamento...
System.out.println(nota.path("nfe").asText());           // número da NF-e
System.out.println(nota.path("serie").asText());         // série
System.out.println(nota.path("chave").asText());         // chave de acesso
System.out.println(nota.path("xml").asText());           // URL do XML
System.out.println(nota.path("danfe").asText());         // URL do DANFE (PDF)
System.out.println(nota.path("motivo").asText());        // retorno do SEFAZ
```

Somente o status `aprovado` indica uma nota autorizada. Quando o retorno for `processamento`, consulte a nota alguns segundos depois.

### Consultar NF-e

```java
JsonNode consulta = nfe.nfeGetDocument(new NfeGetDocumentRequest(json.createObjectNode().put("uuid", uuid))).data().toJson();
System.out.println(consulta.path("status").asText());
```

A consulta também aceita a chave de acesso (`chave`).

### Cancelar NF-e

```java
var cancelamento = json.createObjectNode()
    .put("uuid", uuid)
    .put("motivo", "Cancelamento por erro no pedido.");    // mínimo de 15 caracteres
JsonNode cancelada = nfe.nfeCancelDocument(new NfeCancelDocumentRequest(json.createObjectNode().set("body", cancelamento))).data().toJson();
System.out.println(cancelada.path("status").asText());
```

### Baixar o DANFE e o XML

```java
Download danfe = nfe.nfeDownloadDanfe(new NfeDownloadDanfeRequest(json.createObjectNode().put("identifier", uuid))).data();
Files.write(Path.of("danfe.pdf"), danfe.bytes());

Download xml = nfe.nfeDownloadXml(new NfeDownloadXmlRequest(json.createObjectNode().put("identifier", uuid))).data();
Files.write(Path.of("nfe.xml"), xml.bytes());
```

### Emitir, consultar e cancelar NFS-e

A NFS-e é emitida a partir de um ou mais RPS com o método `emitterIssueNfse`:

```java
JsonNode rps = json.readTree("""
    {
      "ambiente": 2,
      "rps": [{
        "servico": {
          "valor_servicos": "15.00",
          "discriminacao": "Prestação de serviço referente ao mês 10/2026",
          "classe_imposto": "REF000000"
        },
        "tomador": {"cpf": "000.000.000-00", "nome_completo": "Nome do tomador"}
      }]
    }
    """);
JsonNode nfse = emissor.emitterIssueNfse(new EmitterIssueNfseRequest(json.createObjectNode().set("body", rps))).data().toJson();
String uuidNfse = nfse.path("uuid").asText();
System.out.println(nfse.path("status").asText());

JsonNode consultaNfse = emissor.emitterGetNfse(new EmitterGetNfseRequest(json.createObjectNode().put("identifier", uuidNfse))).data().toJson();
System.out.println(consultaNfse.path("status").asText() + " " + consultaNfse.path("numero").asText());

var cancela = json.createObjectNode()
    .put("uuid", uuidNfse)
    .put("motivo", "1")                                    // código do motivo (veja a documentação da NFS-e)
    .put("justificativa", "Serviço cancelado a pedido do tomador.");  // mínimo de 15 caracteres
JsonNode canceladaNfse = emissor.emitterCancelNfse(new EmitterCancelNfseRequest(json.createObjectNode().set("body", cancela))).data().toJson();
System.out.println(canceladaNfse.path("status").asText());
```

### Tratamento de erros

Toda falha lança `ApiException`:

```java
try {
    nfe.nfeIssueDocument(new NfeIssueDocumentRequest(json.createObjectNode().set("body", dados)));
} catch (ApiException erro) {
    System.err.println(erro.kind());       // VALIDATION (dados recusados antes do envio), API (recusa da API ou do SEFAZ), HTTP, TIMEOUT...
    System.err.println(erro.status());     // status HTTP, quando houver
    System.err.println(erro.getMessage()); // mensagem, com dados sensíveis mascarados
    if (erro.outcomeUncertain()) {
        // A requisição pode ter sido processada: consulte a nota antes de emitir de novo.
    }
}
```

O SDK não repete requisições automaticamente. Se uma emissão ou um cancelamento terminar com resultado desconhecido (`outcomeUncertain()` verdadeiro), consulte o documento antes de tentar novamente, para não emitir em duplicidade.

## Métodos disponíveis

**NF-e e NFC-e** — `WebmaniaClient` com `Credentials.company`

- **nfeIssueDocument**: Emissão de NF-e ou NFC-e junto ao SEFAZ.
- **nfeGetDocument**: Consulta da nota fiscal pelo UUID, pela chave de acesso ou pelo ID do pedido.
- **nfeCancelDocument**: Cancelamento de NF-e ou NFC-e.
- **nfeCreateCorrection**: Carta de correção.
- **nfeVoidNumbering**: Inutilização de sequência de numeração.
- **nfeIssueReturn**: Emissão de NF-e de devolução.
- **nfeIssueComplement**: Emissão de NF-e complementar.
- **nfeIssueAdjustment**: Emissão de NF-e de ajuste.
- **nfeCreateManifestation**: Manifestação do destinatário.
- **nfeCreatePaymentEvent** / **nfeCancelPaymentEvent**: Evento de conciliação financeira (ECONF) e o seu cancelamento.
- **nfeCreateIbsCbsEvent** / **nfeCancelIbsCbsEvent**: Eventos de IBS/CBS e o seu cancelamento.
- **nfeListTaxClasses** / **nfeSaveTaxClasses** / **nfeDeleteTaxClasses**: Classes de imposto.
- **fiscalCreateOrPollReport**: Relatórios fiscais.
- **fiscalUpdateCompany**: Atualização dos dados da empresa emissora.
- **nfeGetSefazStatus**: Verifica se o SEFAZ está online ou offline.
- **nfeGetCertificateValidity**: Verifica quantos dias faltam para o certificado A1 expirar.

**NFS-e** — `WebmaniaClient` com `Credentials.issuer`

- **emitterIssueNfse**: Emissão de NFS-e a partir de RPS.
- **emitterGetNfse**: Consulta da NFS-e.
- **emitterCancelNfse**: Cancelamento da NFS-e.
- **emitterReplaceNfse**: Substituição de NFS-e.
- **emitterManifestNfse**: Manifestação sobre NFS-e nacional.
- **emitterGetNfseProviderStatus**: Recursos do provedor de NFS-e do município da empresa.

**CT-e e CT-e OS** — `WebmaniaClient` com `Credentials.issuer`

- **emitterIssueCte** / **emitterIssueSimplifiedCte**: Emissão de CT-e, CT-e OS e CT-e simplificado.
- **emitterGetCte**: Consulta do CT-e.
- **emitterCancelCte**: Cancelamento do CT-e.
- **emitterCorrectCte**: Carta de correção do CT-e.
- **emitterConfirmCteDelivery** / **emitterCancelCteDelivery**: Comprovante de entrega e o seu cancelamento.
- **emitterLinkCtePayment** / **emitterCancelCtePaymentLink** / **emitterGetCtePaymentEvents**: Eventos de pagamento do CT-e.

**MDF-e** — `WebmaniaClient` com `Credentials.issuer`

- **emitterIssueMdfe**: Emissão do MDF-e.
- **emitterGetMdfe**: Consulta do MDF-e pela chave de acesso.
- **emitterCloseMdfe**: Encerramento do MDF-e.
- **emitterCancelMdfe**: Cancelamento do MDF-e.
- **emitterAddMdfeConductor**: Inclusão de condutor.

**NFCom e DC-e** — `WebmaniaClient` com `Credentials.issuer`

- **emitterIssueNfcom** / **emitterGetNfcom** / **emitterCancelNfcom**: Emissão, consulta e cancelamento da NFCom.
- **emitterGetNfcomPaymentEvents**: Eventos de pagamento da NFCom.
- **emitterGetNfcomServiceStatus**: Disponibilidade do serviço da NFCom no SEFAZ.
- **emitterIssueDce** / **emitterGetDce** / **emitterCancelDce**: Emissão, consulta e cancelamento da DC-e.

**Arquivos (XML e PDF)** — `WebmaniaClient` com `Credentials.company` (NF-e) ou `Credentials.fileCompany` (demais documentos)

- **nfeDownloadDanfe** / **nfeDownloadSimpleDanfe** / **nfeDownloadLabelDanfe**: DANFE completo, simplificado e etiqueta.
- **nfeDownloadXml** / **nfeDownloadCancellationXml**: XML da NF-e e do cancelamento.
- **nfeDownloadCorrectionPdf** / **nfeDownloadCorrectionXml**: PDF e XML da carta de correção.
- **fileGetNfseXml** / **fileGetNfsePdf** / **fileGetNfseRpsPdf**: XML e PDF da NFS-e e PDF do RPS.
- **fileGetCteXml** / **fileGetCtePdf** / **fileGetMdfeXml** / **fileGetMdfePdf** / **fileGetNfcomXml** / **fileGetNfcomPdf** / **fileGetDceXml** / **fileGetDcePdf**: XML e PDF de CT-e, MDF-e, NFCom e DC-e.

**Monitor Fiscal** — `WebmaniaClient` com `Credentials.monitor`

- **monitorSearchDocuments** / **monitorGetDocument** / **monitorListDocumentEvents**: Busca e consulta de documentos recebidos e do histórico de eventos.
- **monitorManifestDocument**: Manifestação do destinatário.
- **monitorImportDocument** / **monitorGetImportStatus**: Importação por chave de acesso, XML ou ZIP.
- **monitorListCompanies** / **monitorCreateCompany** / **monitorUpdateCompany**: Empresas monitoradas.

**Gerencial B2B** — `WebmaniaClient` com `Credentials.reseller`

- **b2bV1CreateCompanies** / **b2bV1ListCompanies** / **b2bV1GetProcessedRequests**: Cadastro de empresas, listagem e contagem de notas processadas por empresa.

A lista completa, com todos os métodos do Monitor Fiscal e dos arquivos, está em [docs/OPERATIONS.md](docs/OPERATIONS.md).

## Exemplo completo em homologação

A pasta [examples/homologacao](examples/homologacao) traz um programa que emite, consulta, baixa os arquivos e cancela uma NF-e e uma NFS-e em homologação, usando as credenciais das variáveis de ambiente. Por segurança, ele só envia requisições quando `WEBMANIA_LIVE=1` está definido e `WEBMANIA_LIVE_ALLOWED_HOSTS` lista os hosts da API. Para rodar só as consultas (status do SEFAZ, certificado e provedor de NFS-e):

```sh
WEBMANIA_LIVE=1 WEBMANIA_LIVE_SCOPE=readonly WEBMANIA_LIVE_ALLOWED_HOSTS=webmania.com.br,nfe.webmania.com.br,api.webmania.com.br sh examples/homologacao/run.sh
```

As variáveis aceitas e o formato da saída estão em [examples/homologacao/README.md](examples/homologacao/README.md).

## Documentação

- Documentação da REST API: [NF-e / NFC-e](https://webmania.com.br/docs/rest-api-nfe/) · [NFS-e](https://webmania.com.br/docs/rest-api-nfse/) · [CT-e](https://webmania.com.br/docs/rest-api-cte/) · [MDF-e](https://webmania.com.br/docs/rest-api-mdfe/) · [NFCom](https://webmania.com.br/docs/rest-api-nfcom/) · [DC-e](https://webmania.com.br/docs/rest-api-dce/) · [Monitor Fiscal](https://webmania.com.br/docs/rest-api-monitor-fiscal/) · [Gerencial B2B](https://webmania.com.br/docs/rest-api-gerencial-b2b/)
- Contratos OpenAPI: [API 2.0](https://api.webmania.com.br/docs/openapi) e [NF-e](https://webmania.com.br/docs/rest-api-nfe/?format=openapi)
- Detalhes técnicos do SDK (URL base, arquivos, relatórios, limites): [docs/INTEGRATION.md](docs/INTEGRATION.md)
- Lista completa de métodos: [docs/OPERATIONS.md](docs/OPERATIONS.md)
- Desenvolvimento e testes do SDK: [docs/TESTING.md](docs/TESTING.md)
- Histórico de versões: [CHANGELOG.md](CHANGELOG.md)

## Suporte

Qualquer dúvida entre em contato na nossa [Central de Ajuda](https://ajuda.webmania.com.br) ou acesse o [Painel de Controle](https://webmania.com.br/painel/) para conversar em tempo real no Chat ou Abrir um chamado.

## Licença

Licença proprietária Webmania®: veja [LICENSE](LICENSE) e os [Termos de Uso](https://webmania.com.br/termos-de-uso/). As dependências de terceiros mantêm as suas próprias licenças.
