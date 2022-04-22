package com.infotarget.codility.java.refactor.before;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class ReviewFixtures {
  private static final String EXTERNAL_ID = "externalId";

  public static String anyProduct() {
    return RandomStringUtils.randomAlphabetic(10);
  }

  public static SiteDetails withAddOneGroupOf(AddOn... addOnes) {
    return SiteDetails.builder()
      .addOnGroups(ImmutableList.of(AddOnGroup.builder()
        .addOns(ImmutableList.copyOf(addOnes))
        .build()))
      .build();
  }

  public static CartItem withQuantityOfExternal(Integer quantity, String ... characteristics) {
    Preconditions.checkArgument(Objects.nonNull(quantity) && quantity >= 0);
    return CartItem.builder()
      .product(Product.builder()
        .productCharacteristics(Arrays.stream(characteristics)
          .map(element -> Characteristic.of(EXTERNAL_ID, element))
          .collect(Collectors.toList()))
        .build())
      .quantity(quantity)
      .build();
  }

  public static CartItem withQuantityOfInternal(Integer quantity, String ... characteristics) {
    Preconditions.checkArgument(Objects.nonNull(quantity) && quantity >= 0);
    return CartItem.builder()
      .product(Product.builder()
        .productCharacteristics(Arrays.stream(characteristics)
          .map(element -> Characteristic.of("_INTERNAL_", element))
          .collect(Collectors.toList()))
        .build())
      .quantity(quantity)
      .build();
  }


  public static SiteDetails noAddOns() {
    return withAddOneGroupOf();
  }

  public static AddOn addOneForProduct(String productId, Integer maxAllowedQuantity) {
    Preconditions.checkArgument(Objects.isNull(maxAllowedQuantity) || maxAllowedQuantity >= 0);
    Preconditions.checkNotNull(productId);

    return AddOn.builder()
      .id(productId)
      .maxAllowedQuantity(maxAllowedQuantity)
      .build();
  }
}
