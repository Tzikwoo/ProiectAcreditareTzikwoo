package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class AddToCartSteps extends BaseSteps{
    @Step
    public void clickAddToCart (){
        productPage.clickAddToCartButton();
    }
    @Step
    public void checkAddedToCartMessage(){
        Assert.assertEquals("View cart",productPage.getAddedToCartMessageText());
    }
    @Step
    public void clickViewCartButton(){
        productPage.clickViewCartButton();
    }
    @Step
    public void clickProceedToCheckoutButton(){
        cartPage.clickProceedToCheckoutButton();
    }
    @Step
    public void checkPricesAreEqual(){
        Assert.assertTrue(cartPage.checkPricesAreEqual());
    }
    @Step
    public void changeQuantity(int n){
        cartPage.setSpinnerValue(n);
    }
    @Step
    public void checkForNPricesAreEqual(int n){
        Assert.assertTrue(cartPage.checkForNPricesAreEqual(n));
    }
    @Step
    public void updateCart(){
        cartPage.clickUpdateCartButton();
    }
    @Step
    public void removeItem(){
        cartPage.clickRemoveItemButton();
    }
    @Step
    public void checkIfEmptyCartMessageIsDisplayed(){
        Assert.assertEquals("Your cart is currently empty.",cartPage.getEmptyCartMessageText());
    }
    @Step
    public void checkIfUndoLinkIsVisibleAndClickable(){
        Assert.assertTrue(cartPage.checkIfUndoLinkIsVisibleAndClickable());
    }
    @Step
    public void clickUndoLink(){
        cartPage.clickUndoLink();
    }
    @Step
    public void clickApplyCouponButton(){
        cartPage.clickApplyCouponButton();
    }
    @Step
    public void checkIfEnterCouponMessageIsDisplayed(){
        Assert.assertEquals("Please enter a coupon code.",cartPage.getEnterCouponMessageText());
    }
    @Step
    public void typeCoupon(String coupon){
        cartPage.typeCoupon(coupon);
    }
    @Step
    public void checkCouponDoesntExistMessage(){
        Assert.assertEquals("Coupon \"ghhhs\" does not exist!",cartPage.getCouponDoesntExistMessageText());
    }
    @Step
    public void checkSumUnder50Message(){
        Assert.assertEquals("The minimum spend for this coupon is 50,00 lei.", cartPage.getSumUnder50MessageText());

    }
    @Step
    public void checkSumUnder50(){
        Assert.assertTrue(cartPage.checkPriceUnder50());
    }
    @Step
    public void checkUnder50Complete(){
        Assert.assertEquals("The minimum spend for this coupon is 50,00 lei.", cartPage.getSumUnder50MessageText());
        Assert.assertTrue(cartPage.checkPriceUnder50());
    }
    @Step
    public void checkPromoCodeApplied(){
        Assert.assertEquals("Coupon code applied successfully.", cartPage.getCouponAppliedMessageText());
    }
    @Step
    public void checkIfPromo30Works(){
        Assert.assertTrue(cartPage.checkIfPromo30Works());
    }
}
