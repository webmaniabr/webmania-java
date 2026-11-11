package com.webmania.sdk;

import java.math.BigInteger;
import java.util.List;

/** Bounded typed items plus explicit continuation position. Contents are never rendered implicitly. */
public final class PageCollection<T> {
    public enum Stop { COMPLETE, PAGE_LIMIT, ITEM_LIMIT }
    private final List<T> items;
    private final int pages;
    private final Stop stop;
    private final BigInteger nextPage;
    private final int nextIndex;
    PageCollection(List<T> items,int pages,Stop stop,BigInteger nextPage,int nextIndex) { this.items=List.copyOf(items);this.pages=pages;this.stop=stop;this.nextPage=nextPage;this.nextIndex=nextIndex; }
    public List<T> items() { return items; }
    public int pagesFetched() { return pages; }
    public Stop stop() { return stop; }
    public BigInteger nextPage() { return nextPage; }
    /** Zero-based index within nextPage when an item bound stopped within that page. */
    public int nextIndex() { return nextIndex; }
    @com.fasterxml.jackson.annotation.JsonValue public String redactedJson() { return toString(); }
    @Override public String toString() { return "PageCollection["+items.size()+" items, "+stop+", redacted]"; }
}
