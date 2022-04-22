package com.infotarget.codility.java.refactor.after;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
class CartItem {
  Product product;
  Integer quantity;

  public String findExternalProductId() {
    return product.findExternalProductId()
      .orElseThrow(IllegalArgumentException::new);
  }
}
