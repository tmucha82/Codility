package com.infotarget.codility.java.refactor.before;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
class CartItem {
  Product product;
  Integer quantity;
}
