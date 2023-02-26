package org.fasttrackit.features.search;

import org.fasttrackit.Utils.Constants;
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
    @Test
    public void happyFlowTest(){
        loginSteps.navigateToAccountPage();
        String USER = Constants.USER_RANDOM_EMAIL;
        registerSteps.typeRegisterEmail(USER);
        registerSteps.typeRegisterPassword(Constants.USER_RANDOM_PASSWORD);
        registerSteps.clickRegisterButton(); searchSteps.searchAndClick("Beanie");
        searchSteps.selectProductFromList("Beanie with Logo");
        addToCartSteps.clickAddToCart();
        addToCartSteps.clickViewCartButton();
        addToCartSteps.clickProceedToCheckoutButton();
        checkoutSteps.completeCheckoutFieldsRegisteredUser();
        checkoutSteps.typeEmail(USER);
        checkoutSteps.clickPlaceOrder();
        checkoutSteps.checkOrderConfirmation();
    }
    @Test
    public void checkPriceCorrectAfterCoupon(){
        String itemName = "Beanie with Logo";
        searchSteps.searchAndClick("Beanie");
        searchSteps.selectProductFromList(itemName);
        productSteps.changeQuantity(3);
        addToCartSteps.clickAddToCart();
        addToCartSteps.clickViewCartButton();
        addToCartSteps.typeCoupon("promo30");
        addToCartSteps.clickApplyCouponButton();
        addToCartSteps.clickProceedToCheckoutButton();
        checkoutSteps.checkIfPromo30Works();
    }
    @Test
    public void checkIfReturningCustomerIsVisibleTest(){
        searchSteps.searchAndClick("Beanie");
        searchSteps.selectProductFromList("Beanie with Logo");
        addToCartSteps.clickAddToCart();
        addToCartSteps.clickViewCartButton();
        addToCartSteps.clickProceedToCheckoutButton();
        checkoutSteps.checkIfReturningCustomerLinkIsVisibleAndClickable();
    }
}
