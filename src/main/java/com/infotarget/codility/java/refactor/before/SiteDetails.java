package com.infotarget.codility.java.refactor.before;

import com.google.common.collect.ImmutableList;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
class SiteDetails {

  @Builder.Default
  List<AddOnGroup> addOnGroups = ImmutableList.of();
}
