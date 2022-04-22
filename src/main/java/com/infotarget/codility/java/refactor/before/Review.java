package com.infotarget.codility.java.refactor.before;

import java.util.List;

class Review {

  private static final String EXTERNAL_ID = "externalId";

  public void checkConnectivityRestrictions(List<CartItem> cartItems, Integer amount, String productId, SiteDetails siteDetails) {
    Integer difference = amount;
    for (CartItem cartItem : cartItems) {
      if (productId.equals(cartItem.getProduct()
        .getProductCharacteristics().stream()
        .filter(characteristic -> EXTERNAL_ID.equals(characteristic.getName()))
        .findFirst()
        .orElseThrow(IllegalArgumentException::new)
        .getValue())) {
        difference = difference - cartItem.getQuantity();
        if (difference <= 0) {
          return;
        }
        break;
      }
    }

    Integer addOnMaxRemainingQuantity = null;
    for (AddOnGroup addOnGroup : siteDetails.getAddOnGroups()) {
      for (AddOn addOn : addOnGroup.getAddOns()) {
        if (productId.equals(addOn.getId()) && addOn.getMaxAllowedQuantity() != null) {
          addOnMaxRemainingQuantity = addOn.getMaxAllowedQuantity();
          break;
        }
      }
    }

    if (addOnMaxRemainingQuantity != null && difference > addOnMaxRemainingQuantity) {
      throw new ApolloExploreServiceException("403", "Selected quantity is above the restriction limit.", HttpStatus.FORBIDDEN);
    }

  }
}
