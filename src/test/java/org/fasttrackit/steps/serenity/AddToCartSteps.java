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
    public void changeQuantity(String n){
        cartPage.typeQuantity(n);
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
}
