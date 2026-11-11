# Operações

Todas as operações do contrato público que o SDK para Java expõe, com o cliente e o método correspondentes. As condições fiscais de cada operação estão na documentação da REST API em https://webmania.com.br/docs/.

Cada método recebe a classe `<Operação>Request` do pacote `com.webmania.sdk.model` e tem uma variante `Async`.

| Operação | Cliente | Método | HTTP | Estado |
|---|---|---|---|---|
| `nfeGetCertificateValidity` | `WebmaniaClient` com `Credentials.company` | `nfeGetCertificateValidity` | `GET /1/nfe/certificado/` | habilitada |
| `nfeGetSefazStatus` | `WebmaniaClient` com `Credentials.company` | `nfeGetSefazStatus` | `GET /1/nfe/sefaz/` | habilitada |
| `nfeGetDocument` | `WebmaniaClient` com `Credentials.company` | `nfeGetDocument` | `GET /1/nfe/consulta/` | habilitada |
| `nfeQueryDocument` | `WebmaniaClient` com `Credentials.company` | `nfeQueryDocument` | `POST /1/nfe/consulta/` | habilitada |
| `nfeCreateCorrection` | `WebmaniaClient` com `Credentials.company` | `nfeCreateCorrection` | `POST /1/nfe/cartacorrecao/` | habilitada |
| `nfeCreateManifestation` | `WebmaniaClient` com `Credentials.company` | `nfeCreateManifestation` | `POST /1/nfe/manifesta/` | habilitada |
| `nfeCancelDocument` | `WebmaniaClient` com `Credentials.company` | `nfeCancelDocument` | `PUT /1/nfe/cancelar/` | habilitada |
| `nfeVoidNumbering` | `WebmaniaClient` com `Credentials.company` | `nfeVoidNumbering` | `PUT /1/nfe/inutilizar/` | habilitada |
| `nfeCreatePaymentEvent` | `WebmaniaClient` com `Credentials.company` | `nfeCreatePaymentEvent` | `POST /1/nfe/conciliacao/` | habilitada |
| `nfeCancelPaymentEvent` | `WebmaniaClient` com `Credentials.company` | `nfeCancelPaymentEvent` | `PUT /1/nfe/conciliacao/cancelar/` | habilitada |
| `nfeCancelIbsCbsEvent` | `WebmaniaClient` com `Credentials.company` | `nfeCancelIbsCbsEvent` | `PUT /1/nfe/evento-ibs-cbs/cancelar/` | habilitada |
| `nfeListTaxClasses` | `WebmaniaClient` com `Credentials.company` | `nfeListTaxClasses` | `GET /1/nfe/classe-imposto/` | habilitada |
| `nfeDeleteTaxClasses` | `WebmaniaClient` com `Credentials.company` | `nfeDeleteTaxClasses` | `DELETE /1/nfe/classe-imposto/` | habilitada |
| `nfeSaveTaxClasses` | `WebmaniaClient` com `Credentials.company` | `nfeSaveTaxClasses` | `POST /1/nfe/classe-imposto/` | habilitada |
| `nfeIssueDocument` | `WebmaniaClient` com `Credentials.company` | `nfeIssueDocument` | `POST /1/nfe/emissao/` | habilitada |
| `nfeIssueReturn` | `WebmaniaClient` com `Credentials.company` | `nfeIssueReturn` | `POST /1/nfe/devolucao/` | habilitada |
| `nfeIssueAdjustment` | `WebmaniaClient` com `Credentials.company` | `nfeIssueAdjustment` | `POST /1/nfe/ajuste/` | habilitada |
| `nfeIssueComplement` | `WebmaniaClient` com `Credentials.company` | `nfeIssueComplement` | `POST /1/nfe/complementar/` | habilitada |
| `fiscalUpdateCompany` | `WebmaniaClient` com `Credentials.company` | `fiscalUpdateCompany` | `POST /1/nfe/empresa/` | habilitada |
| `fiscalCreateOrPollReport` | `WebmaniaClient` com `Credentials.company` | `fiscalCreateOrPollReport` | `POST /1/nfe/relatorios/` | habilitada |
| `nfeCreateIbsCbsEvent` | `WebmaniaClient` com `Credentials.company` | `nfeCreateIbsCbsEvent` | `POST /1/nfe/evento-ibs-cbs/` | habilitada |
| `nfeDownloadDanfe` | `WebmaniaClient` (`Credentials.company`) | `nfeDownloadDanfe` | `GET /danfe/{identifier}/` | habilitada |
| `nfeDownloadSimpleDanfe` | `WebmaniaClient` (`Credentials.company`) | `nfeDownloadSimpleDanfe` | `GET /danfe/simples/{identifier}/` | habilitada |
| `nfeDownloadLabelDanfe` | `WebmaniaClient` (`Credentials.company`) | `nfeDownloadLabelDanfe` | `GET /danfe/etiqueta/{identifier}/` | habilitada |
| `nfeDownloadCorrectionPdf` | `WebmaniaClient` (`Credentials.company`) | `nfeDownloadCorrectionPdf` | `GET /dacce/{identifier}/` | habilitada |
| `nfeDownloadCorrectionPdfSequence` | `WebmaniaClient` (`Credentials.company`) | `nfeDownloadCorrectionPdfSequence` | `GET /dacce/{identifier}/{event}/` | habilitada |
| `nfeDownloadXml` | `WebmaniaClient` (`Credentials.company`) | `nfeDownloadXml` | `GET /xmlnfe/{identifier}/` | habilitada |
| `nfeDownloadCancellationXml` | `WebmaniaClient` (`Credentials.company`) | `nfeDownloadCancellationXml` | `GET /xmlnfe/{identifier}/cancelamento` | habilitada |
| `nfeDownloadCorrectionXml` | `WebmaniaClient` (`Credentials.company`) | `nfeDownloadCorrectionXml` | `GET /xmlcce/{identifier}/` | habilitada |
| `nfeDownloadCorrectionXmlSequence` | `WebmaniaClient` (`Credentials.company`) | `nfeDownloadCorrectionXmlSequence` | `GET /xmlcce/{identifier}/{event}/` | habilitada |
| `nfeDownloadManifestationXml` | `WebmaniaClient` (`Credentials.company`) | `nfeDownloadManifestationXml` | `GET /xmlmde/{uuid}/` | habilitada |
| `nfeDownloadPaymentEventXml` | `WebmaniaClient` (`Credentials.company`) | `nfeDownloadPaymentEventXml` | `GET /xmleconf/{identifier}/` | habilitada |
| `nfeDownloadPaymentEventXmlSequence` | `WebmaniaClient` (`Credentials.company`) | `nfeDownloadPaymentEventXmlSequence` | `GET /xmleconf/{identifier}/{event}/` | habilitada |
| `nfeDownloadIbsCbsEventXml` | `WebmaniaClient` (`Credentials.company`) | `nfeDownloadIbsCbsEventXml` | `GET /xmlevento/{uuid}/` | indisponível nesta versão (falha antes de enviar a requisição) |
| `fiscalDownloadReport` | `WebmaniaClient` (`Credentials.company`) | `fiscalDownloadReport` | `GET /relatorio/{uuid}/` | habilitada |
| `b2bV1CreateCompanies` | `WebmaniaClient` com `Credentials.reseller` | `b2bV1CreateCompanies` | `POST /api/1/b2b/empresas/` | habilitada |
| `b2bV1ListCompanies` | `WebmaniaClient` com `Credentials.reseller` | `b2bV1ListCompanies` | `GET /api/1/b2b/empresas/` | habilitada |
| `b2bV1GetProcessedRequests` | `WebmaniaClient` com `Credentials.reseller` | `b2bV1GetProcessedRequests` | `GET /api/1/b2b/requests/` | habilitada |
| `emitterIssueCte` | `WebmaniaClient` com `Credentials.issuer` | `emitterIssueCte` | `POST /2/cte/emissao` | habilitada |
| `emitterIssueSimplifiedCte` | `WebmaniaClient` com `Credentials.issuer` | `emitterIssueSimplifiedCte` | `POST /2/cte/emissao/simplificada` | habilitada |
| `emitterCancelCte` | `WebmaniaClient` com `Credentials.issuer` | `emitterCancelCte` | `PUT /2/cte/cancelar` | habilitada |
| `emitterCorrectCte` | `WebmaniaClient` com `Credentials.issuer` | `emitterCorrectCte` | `POST /2/cte/correcao` | habilitada |
| `emitterConfirmCteDelivery` | `WebmaniaClient` com `Credentials.issuer` | `emitterConfirmCteDelivery` | `POST /2/cte/entrega` | habilitada |
| `emitterCancelCteDelivery` | `WebmaniaClient` com `Credentials.issuer` | `emitterCancelCteDelivery` | `PUT /2/cte/entrega/cancelar` | habilitada |
| `emitterLinkCtePayment` | `WebmaniaClient` com `Credentials.issuer` | `emitterLinkCtePayment` | `POST /2/cte/evento` | habilitada |
| `emitterCancelCtePaymentLink` | `WebmaniaClient` com `Credentials.issuer` | `emitterCancelCtePaymentLink` | `PUT /2/cte/evento/cancelar` | habilitada |
| `emitterGetCte` | `WebmaniaClient` com `Credentials.issuer` | `emitterGetCte` | `GET /2/cte/consulta/{identifier}` | habilitada |
| `emitterGetCtePaymentEvents` | `WebmaniaClient` com `Credentials.issuer` | `emitterGetCtePaymentEvents` | `GET /2/cte/consulta/evento/{identifier}` | habilitada |
| `emitterIssueDce` | `WebmaniaClient` com `Credentials.issuer` | `emitterIssueDce` | `POST /2/dce/emissao` | habilitada |
| `emitterCancelDce` | `WebmaniaClient` com `Credentials.issuer` | `emitterCancelDce` | `PUT /2/dce/cancelar` | habilitada |
| `emitterGetDce` | `WebmaniaClient` com `Credentials.issuer` | `emitterGetDce` | `GET /2/dce/consulta/{identifier}` | habilitada |
| `fileGetNfseXml` | `WebmaniaClient` (`Credentials.fileCompany`) | `fileGetNfseXml` | `GET /xmlnfse/{identifier}` | habilitada |
| `fileGetNfsePdf` | `WebmaniaClient` (`Credentials.fileCompany`) | `fileGetNfsePdf` | `GET /nfse/{identifier}` | habilitada |
| `fileGetNfseRpsPdf` | `WebmaniaClient` (`Credentials.fileCompany`) | `fileGetNfseRpsPdf` | `GET /darps/{identifier}` | habilitada |
| `fileGetCteXml` | `WebmaniaClient` (`Credentials.fileCompany`) | `fileGetCteXml` | `GET /xmlcte/{identifier}` | habilitada |
| `fileGetCteCancelXml` | `WebmaniaClient` (`Credentials.fileCompany`) | `fileGetCteCancelXml` | `GET /xmlcte/{identifier}/cancelamento` | habilitada |
| `fileGetCtePdf` | `WebmaniaClient` (`Credentials.fileCompany`) | `fileGetCtePdf` | `GET /dacte/{identifier}` | habilitada |
| `fileGetCteCorrectionXml` | `WebmaniaClient` (`Credentials.fileCompany`) | `fileGetCteCorrectionXml` | `GET /xmlcce/{identifier}` | habilitada |
| `fileGetCteCorrectionPdf` | `WebmaniaClient` (`Credentials.fileCompany`) | `fileGetCteCorrectionPdf` | `GET /dacce/{identifier}` | habilitada |
| `fileGetMdfeXml` | `WebmaniaClient` (`Credentials.fileCompany`) | `fileGetMdfeXml` | `GET /xmlmdfe/{identifier}` | habilitada |
| `fileGetMdfePdf` | `WebmaniaClient` (`Credentials.fileCompany`) | `fileGetMdfePdf` | `GET /damdfe/{identifier}` | habilitada |
| `fileGetNfcomXml` | `WebmaniaClient` (`Credentials.fileCompany`) | `fileGetNfcomXml` | `GET /xmlnfcom/{identifier}` | habilitada |
| `fileGetNfcomCancelXml` | `WebmaniaClient` (`Credentials.fileCompany`) | `fileGetNfcomCancelXml` | `GET /xmlnfcom/{identifier}/cancelamento` | habilitada |
| `fileGetNfcomPdf` | `WebmaniaClient` (`Credentials.fileCompany`) | `fileGetNfcomPdf` | `GET /danfecom/{identifier}` | habilitada |
| `fileGetDceXml` | `WebmaniaClient` (`Credentials.fileCompany`) | `fileGetDceXml` | `GET /xmldce/{identifier}` | habilitada |
| `fileGetDceCancelXml` | `WebmaniaClient` (`Credentials.fileCompany`) | `fileGetDceCancelXml` | `GET /xmldce/{identifier}/cancelamento` | habilitada |
| `fileGetDcePdf` | `WebmaniaClient` (`Credentials.fileCompany`) | `fileGetDcePdf` | `GET /dace/{identifier}` | habilitada |
| `emitterGetNfseProviderStatus` | `WebmaniaClient` com `Credentials.issuer` | `emitterGetNfseProviderStatus` | `GET /2/nfse/status` | habilitada |
| `emitterGetNfcomServiceStatus` | `WebmaniaClient` com `Credentials.issuer` | `emitterGetNfcomServiceStatus` | `GET /2/nfcom/status` | habilitada |
| `emitterGetNfse` | `WebmaniaClient` com `Credentials.issuer` | `emitterGetNfse` | `GET /2/nfse/consulta/{identifier}` | habilitada |
| `emitterGetNfcom` | `WebmaniaClient` com `Credentials.issuer` | `emitterGetNfcom` | `GET /2/nfcom/consulta/{identifier}` | habilitada |
| `emitterGetNfcomPaymentEvents` | `WebmaniaClient` com `Credentials.issuer` | `emitterGetNfcomPaymentEvents` | `GET /2/nfcom/consulta/evento/{identifier}` | habilitada |
| `emitterManifestNfse` | `WebmaniaClient` com `Credentials.issuer` | `emitterManifestNfse` | `PUT /2/nfse/manifestar` | habilitada |
| `emitterIssueMdfe` | `WebmaniaClient` com `Credentials.issuer` | `emitterIssueMdfe` | `POST /2/mdfe/emissao` | habilitada |
| `emitterCloseMdfe` | `WebmaniaClient` com `Credentials.issuer` | `emitterCloseMdfe` | `PUT /2/mdfe/encerrar` | habilitada |
| `emitterCancelMdfe` | `WebmaniaClient` com `Credentials.issuer` | `emitterCancelMdfe` | `PUT /2/mdfe/cancelar` | habilitada |
| `emitterAddMdfeConductor` | `WebmaniaClient` com `Credentials.issuer` | `emitterAddMdfeConductor` | `PUT /2/mdfe/condutor` | habilitada |
| `emitterGetMdfe` | `WebmaniaClient` com `Credentials.issuer` | `emitterGetMdfe` | `GET /2/mdfe/consulta/{key}` | habilitada |
| `monitorSearchDocuments` | `WebmaniaClient` com `Credentials.monitor` | `monitorSearchDocuments` | `POST /2/monitor/documentos` | habilitada |
| `monitorGetDocument` | `WebmaniaClient` com `Credentials.monitor` | `monitorGetDocument` | `GET /2/monitor/documentos/{fd}` | habilitada |
| `monitorListDocumentEvents` | `WebmaniaClient` com `Credentials.monitor` | `monitorListDocumentEvents` | `GET /2/monitor/documentos/{fd}/eventos` | habilitada |
| `monitorManifestDocument` | `WebmaniaClient` com `Credentials.monitor` | `monitorManifestDocument` | `POST /2/monitor/documentos/{fd}/eventos` | habilitada |
| `monitorListReports` | `WebmaniaClient` com `Credentials.monitor` | `monitorListReports` | `GET /2/monitor/documentos/relatorios` | habilitada |
| `monitorDownloadReport` | `WebmaniaClient` com `Credentials.monitor` | `monitorDownloadReport` | `GET /2/monitor/documentos/relatorios/{report}` | habilitada |
| `monitorImportDocument` | `WebmaniaClient` com `Credentials.monitor` | `monitorImportDocument` | `POST /2/monitor/documentos/importacoes` | habilitada |
| `monitorGetImportStatus` | `WebmaniaClient` com `Credentials.monitor` | `monitorGetImportStatus` | `GET /2/monitor/documentos/importacoes/{uuid}` | habilitada |
| `monitorCreateCompany` | `WebmaniaClient` com `Credentials.monitor` | `monitorCreateCompany` | `POST /2/monitor/empresas` | habilitada |
| `monitorUpdateCompany` | `WebmaniaClient` com `Credentials.monitor` | `monitorUpdateCompany` | `PUT /2/monitor/empresas/{company}` | habilitada |
| `monitorCreateCompanyMunicipality` | `WebmaniaClient` com `Credentials.monitor` | `monitorCreateCompanyMunicipality` | `POST /2/monitor/empresas/{company}/municipios-nfse` | habilitada |
| `monitorUpdateCompanyMunicipality` | `WebmaniaClient` com `Credentials.monitor` | `monitorUpdateCompanyMunicipality` | `PUT /2/monitor/empresas/{company}/municipios-nfse/{download}` | habilitada |
| `monitorDeleteCompanyMunicipality` | `WebmaniaClient` com `Credentials.monitor` | `monitorDeleteCompanyMunicipality` | `DELETE /2/monitor/empresas/{company}/municipios-nfse/{download}` | habilitada |
| `monitorListCompanies` | `WebmaniaClient` com `Credentials.monitor` | `monitorListCompanies` | `GET /2/monitor/empresas` | habilitada |
| `monitorGetCompany` | `WebmaniaClient` com `Credentials.monitor` | `monitorGetCompany` | `GET /2/monitor/empresas/{company}` | habilitada |
| `monitorListCompanyMunicipalities` | `WebmaniaClient` com `Credentials.monitor` | `monitorListCompanyMunicipalities` | `GET /2/monitor/empresas/{company}/municipios-nfse` | habilitada |
| `monitorGetCompanyMunicipality` | `WebmaniaClient` com `Credentials.monitor` | `monitorGetCompanyMunicipality` | `GET /2/monitor/empresas/{company}/municipios-nfse/{download}` | habilitada |
| `monitorListAvailableMunicipalities` | `WebmaniaClient` com `Credentials.monitor` | `monitorListAvailableMunicipalities` | `GET /2/monitor/municipios-nfse` | habilitada |
| `monitorGetDownloadStatistics` | `WebmaniaClient` com `Credentials.monitor` | `monitorGetDownloadStatistics` | `GET /2/monitor/estatisticas/downloads` | habilitada |
| `emitterIssueNfcom` | `WebmaniaClient` com `Credentials.issuer` | `emitterIssueNfcom` | `POST /2/nfcom/emissao` | habilitada |
| `emitterCancelNfcom` | `WebmaniaClient` com `Credentials.issuer` | `emitterCancelNfcom` | `PUT /2/nfcom/cancelar` | habilitada |
| `emitterIssueNfse` | `WebmaniaClient` com `Credentials.issuer` | `emitterIssueNfse` | `POST /2/nfse/emissao` | habilitada |
| `emitterCancelNfse` | `WebmaniaClient` com `Credentials.issuer` | `emitterCancelNfse` | `PUT /2/nfse/cancelar` | habilitada |
| `emitterReplaceNfse` | `WebmaniaClient` com `Credentials.issuer` | `emitterReplaceNfse` | `POST /2/nfse/substituir` | habilitada |
| `fiscalDownloadReportV2` | `WebmaniaClient` | `fiscalDownloadReportV2` | `GET /relatorios/{uuid}` | habilitada |
