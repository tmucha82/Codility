package com.infotarget.codility.java.refactor.after;

import com.google.common.collect.ImmutableList;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
class Product {
  @Builder.Default
  List<Characteristic> productCharacteristics = ImmutableList.of();
}
