package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CheckoutSteps extends BaseSteps{
    @Step
    public void completeCheckoutFields(){
        checkoutPage.completeCheckoutFieldsPreset();
    }
    @Step
    public void clickPlaceOrder(){
        checkoutPage.clickPlaceOrderButton();
    }
    @Step
    public void checkOrderConfirmation(){
        Assert.assertEquals("Thank you. Your order has been received.",checkoutPage.getConfirmationText());
    }
}
