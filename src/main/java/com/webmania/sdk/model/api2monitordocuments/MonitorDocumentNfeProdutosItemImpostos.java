package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeProdutosItemImpostos extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("imposto_importacao", "ipi", "cofins", "ibs_cbs", "icms", "pis", "issqn", "ipi_devolvido");
 public MonitorDocumentNfeProdutosItemImpostos() { super(FIELDS); }
 public MonitorDocumentNfeProdutosItemImpostos(JsonNode node) { super(node, FIELDS); }
 public MonitorDocumentNfeProdutosItemImpostosImpostoImportacao getImpostoImportacao() { return (field("imposto_importacao")).isNull() || (field("imposto_importacao")).isMissingNode() ? null : new MonitorDocumentNfeProdutosItemImpostosImpostoImportacao(field("imposto_importacao")); }
 public MonitorDocumentNfeProdutosItemImpostos setImpostoImportacao(MonitorDocumentNfeProdutosItemImpostosImpostoImportacao value) { put("imposto_importacao", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeProdutosItemImpostosIpi getIpi() { return (field("ipi")).isNull() || (field("ipi")).isMissingNode() ? null : new MonitorDocumentNfeProdutosItemImpostosIpi(field("ipi")); }
 public MonitorDocumentNfeProdutosItemImpostos setIpi(MonitorDocumentNfeProdutosItemImpostosIpi value) { put("ipi", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeProdutosItemImpostosCofins getCofins() { return (field("cofins")).isNull() || (field("cofins")).isMissingNode() ? null : new MonitorDocumentNfeProdutosItemImpostosCofins(field("cofins")); }
 public MonitorDocumentNfeProdutosItemImpostos setCofins(MonitorDocumentNfeProdutosItemImpostosCofins value) { put("cofins", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbs getIbsCbs() { return (field("ibs_cbs")).isNull() || (field("ibs_cbs")).isMissingNode() ? null : new MonitorDocumentNfeProdutosItemImpostosIbsCbs(field("ibs_cbs")); }
 public MonitorDocumentNfeProdutosItemImpostos setIbsCbs(MonitorDocumentNfeProdutosItemImpostosIbsCbs value) { put("ibs_cbs", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeProdutosItemImpostosIcms getIcms() { return (field("icms")).isNull() || (field("icms")).isMissingNode() ? null : new MonitorDocumentNfeProdutosItemImpostosIcms(field("icms")); }
 public MonitorDocumentNfeProdutosItemImpostos setIcms(MonitorDocumentNfeProdutosItemImpostosIcms value) { put("icms", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeProdutosItemImpostosPis getPis() { return (field("pis")).isNull() || (field("pis")).isMissingNode() ? null : new MonitorDocumentNfeProdutosItemImpostosPis(field("pis")); }
 public MonitorDocumentNfeProdutosItemImpostos setPis(MonitorDocumentNfeProdutosItemImpostosPis value) { put("pis", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeProdutosItemImpostosIssqn getIssqn() { return (field("issqn")).isNull() || (field("issqn")).isMissingNode() ? null : new MonitorDocumentNfeProdutosItemImpostosIssqn(field("issqn")); }
 public MonitorDocumentNfeProdutosItemImpostos setIssqn(MonitorDocumentNfeProdutosItemImpostosIssqn value) { put("issqn", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeProdutosItemImpostosIpiDevolvido getIpiDevolvido() { return (field("ipi_devolvido")).isNull() || (field("ipi_devolvido")).isMissingNode() ? null : new MonitorDocumentNfeProdutosItemImpostosIpiDevolvido(field("ipi_devolvido")); }
 public MonitorDocumentNfeProdutosItemImpostos setIpiDevolvido(MonitorDocumentNfeProdutosItemImpostosIpiDevolvido value) { put("ipi_devolvido", value == null ? null : value.toJson()); return this; }
}
