package com.infotarget.codility.java.refactor.after;

import lombok.Builder;
import lombok.val;

import java.util.List;
import java.util.function.IntSupplier;

class Review {

  @Builder
  public static class ProductContext {
    List<CartItem> cartItems;
    SiteDetails siteDetails;
    String productId;
  }


  public void checkConnectivityRestrictions(List<CartItem> cartItems, Integer amount, String productId, SiteDetails siteDetails) {
    val difference = amount - sumQuantityByProductId(cartItems, productId);
    val addOnMaxRemainingQuantity = siteDetails.findByProductId(productId)
      .map(AddOn::getMaxAllowedQuantity)
      .orElse(Integer.MAX_VALUE);

    if (difference > addOnMaxRemainingQuantity) {
      //TO DO - result not exception
      throw new ApolloExploreServiceException("403", "Selected quantity is above the restriction limit.", HttpStatus.FORBIDDEN);
    }
  }

  private Integer sumQuantityByProductId(List<CartItem> cartItems, String productId) {
    return cartItems.stream()
      .filter(item -> productId.equals(item.findExternalProductId()))
      .map(CartItem::getQuantity)
      .reduce(0, Integer::sum);
  }
}
