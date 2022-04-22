package com.infotarget.codility.java.refactor.after;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
class CartItem {
  Product product;
  Integer quantity;
}
