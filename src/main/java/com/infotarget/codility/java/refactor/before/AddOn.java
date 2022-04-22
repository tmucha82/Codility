package com.infotarget.codility.java.refactor.before;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
class AddOn {
  String id;
  Integer maxAllowedQuantity;
}
