package com.infotarget.codility.java.refactor.after;

import com.google.common.collect.ImmutableList;
import lombok.Builder;
import lombok.Value;

import java.util.List;
import java.util.Optional;

@Value
@Builder
class Product {
  @Builder.Default
  List<Characteristic> productCharacteristics = ImmutableList.of();

  public Optional<String> findExternalProductId() {
    return productCharacteristics.stream()
      .filter(Characteristic::isExternal)
      .findFirst()
      .map(Characteristic::getValue);
  }
}
