package com.infotarget.codility.java.refactor.after;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
class Characteristic {
  private static final String EXTERNAL_ID = "externalId";

  public static Characteristic of(String name, String value) {
    return Characteristic.builder()
      .name(name)
      .value(value)
      .build();
  }

  String name;
  String value;
}
