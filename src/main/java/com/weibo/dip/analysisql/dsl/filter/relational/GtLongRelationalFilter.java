package com.weibo.dip.analysisql.dsl.filter.relational;

import com.weibo.dip.analysisql.dsl.filter.Filter;

/** GtLongRelationalFilter. */
public class GtLongRelationalFilter extends LongRelationalFilter {
  public GtLongRelationalFilter() {}

  public GtLongRelationalFilter(String name, long value) {
    super(Filter.GT, name, value);
  }
}