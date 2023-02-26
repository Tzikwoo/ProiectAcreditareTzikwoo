package org.fasttrackit.features.search;

import org.junit.Test;

public class CheckoutTests extends BaseTest{
    @Test
    public void oneItemSearchCheckout(){
        searchSteps.searchAndClick("Beanie");
        searchSteps.selectProductFromList("Beanie with Logo");
        addToCartSteps.clickAddToCart();
        addToCartSteps.clickViewCartButton();
        addToCartSteps.clickProceedToCheckoutButton();
        checkoutSteps.completeCheckoutFields();
        checkoutSteps.clickPlaceOrder();
        checkoutSteps.checkOrderConfirmation();
    }
}
