package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorCursorPagination extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("per_page", "next_cursor", "prev_cursor");
 public MonitorCursorPagination() { super(FIELDS); }
 public MonitorCursorPagination(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getPerPage() { return integerValue(field("per_page")); }
 public MonitorCursorPagination setPerPage(java.math.BigInteger value) { put("per_page", Json.scalar(value)); return this; }
 public MonitorCursorPaginationNextCursor getNextCursor() { return (field("next_cursor")).isNull() || (field("next_cursor")).isMissingNode() ? null : new MonitorCursorPaginationNextCursor(field("next_cursor")); }
 public MonitorCursorPagination setNextCursor(MonitorCursorPaginationNextCursor value) { put("next_cursor", value == null ? null : value.toJson()); return this; }
 public MonitorCursorPaginationPrevCursor getPrevCursor() { return (field("prev_cursor")).isNull() || (field("prev_cursor")).isMissingNode() ? null : new MonitorCursorPaginationPrevCursor(field("prev_cursor")); }
 public MonitorCursorPagination setPrevCursor(MonitorCursorPaginationPrevCursor value) { put("prev_cursor", value == null ? null : value.toJson()); return this; }
}
