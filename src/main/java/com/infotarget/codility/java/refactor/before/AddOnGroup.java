package com.infotarget.codility.java.refactor.before;

import com.google.common.collect.ImmutableList;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
class AddOnGroup {
  @Builder.Default
  List<AddOn> addOns = ImmutableList.of();
}
