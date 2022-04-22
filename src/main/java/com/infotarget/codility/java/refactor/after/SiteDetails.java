package com.infotarget.codility.java.refactor.after;

import com.google.common.collect.ImmutableList;
import lombok.Builder;
import lombok.Value;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Value
@Builder
class SiteDetails {

  @Builder.Default
  List<AddOnGroup> addOnGroups = ImmutableList.of();

  public Optional<AddOn> findByProductId(String productId) {
    return addOnGroups.stream()
      .map(AddOnGroup::getAddOns)
      .flatMap(Collection::stream)
      .filter(addOn -> productId.equals(addOn.getId()))
      .filter(addOn -> Objects.nonNull(addOn.getMaxAllowedQuantity()))
      .findFirst();
  }
}
