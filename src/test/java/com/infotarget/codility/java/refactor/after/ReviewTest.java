package com.infotarget.codility.java.refactor.after;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import static com.infotarget.codility.java.refactor.after.ReviewFixtures.addOneForProduct;
import static com.infotarget.codility.java.refactor.after.ReviewFixtures.anyProduct;
import static com.infotarget.codility.java.refactor.after.ReviewFixtures.noAddOns;
import static com.infotarget.codility.java.refactor.after.ReviewFixtures.withAddOneGroupOf;
import static com.infotarget.codility.java.refactor.after.ReviewFixtures.withQuantityOfExternal;
import static com.infotarget.codility.java.refactor.after.ReviewFixtures.withQuantityOfInternal;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class ReviewTest {
  private final Review review = new Review();

  @Test
  void shouldBeValidForEmptyItemsAndAddOns() {
    //given
    String productId = anyProduct();
    SiteDetails siteDetails = noAddOns();

    //expect
    assertThatCode(() -> review.checkConnectivityRestrictions(ImmutableList.of(), 0, productId, siteDetails))
      .doesNotThrowAnyException();

  }

  @Test
  void shouldBeValidWhenInternalProductWithAtLeastOnAddOn() {
    //given
    String productId = anyProduct();
    SiteDetails siteDetails = withAddOneGroupOf(addOneForProduct(productId, 0));

    //expect
    assertThatCode(() -> review.checkConnectivityRestrictions(ImmutableList.of(), 0, productId, siteDetails))
      .doesNotThrowAnyException();
  }

  @Test
  void shouldBeValidWhenQuantityIsGreaterThanAmount() {
    //given
    String productId = anyProduct();
    CartItem cartItem = withQuantityOfExternal(100, productId);
    Integer amount = 2;

    //expect
    assertThatCode(() -> review.checkConnectivityRestrictions(ImmutableList.of(cartItem), amount, productId, noAddOns()))
      .doesNotThrowAnyException();
  }


  @Test
  void shouldThrowApolloExploreServiceExceptionWhenNoExternalProductIsPresent() {
    //given
    String productId = anyProduct();
    CartItem cartItem = withQuantityOfExternal(1, productId);
    SiteDetails siteDetails = withAddOneGroupOf(addOneForProduct(productId, 100));
    Integer amount = 1000;

    //expect
    ImmutableList<CartItem> cartItems = ImmutableList.of(cartItem);
    assertThatExceptionOfType(ApolloExploreServiceException.class)
      .isThrownBy(() -> review.checkConnectivityRestrictions(cartItems, amount, productId, siteDetails))
      .withMessageContaining("Selected quantity is above the restriction limit.");
  }

  @Test
  void shouldBeValidWhenLimitIsValid() {
    //given
    String productId = anyProduct();
    CartItem cartItem = withQuantityOfExternal(1, productId);
    SiteDetails siteDetails = withAddOneGroupOf(addOneForProduct(productId, 1000));
    Integer amount = 100;

    //expect
    ImmutableList<CartItem> cartItems = ImmutableList.of(cartItem);
    assertThatCode(() -> review.checkConnectivityRestrictions(cartItems, amount, productId, siteDetails))
      .doesNotThrowAnyException();
  }

  @Test
  void shouldThrowExceptionWhenProductDoesNotExist() {
    //given
    CartItem cartItem = withQuantityOfInternal(1, "notExistingProduct");

    //expect
    ImmutableList<CartItem> cartItems = ImmutableList.of(cartItem);
    assertThatIllegalArgumentException()
      .isThrownBy(() -> review.checkConnectivityRestrictions(cartItems, 0, anyProduct(), noAddOns()));
  }

}
