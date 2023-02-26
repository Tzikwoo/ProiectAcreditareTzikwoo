package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageObject {
    @FindBy(css = "#post-5 > div > div > form > table > tbody > tr.woocommerce-cart-form__cart-item.cart_item > td.product-price > span")
    private WebElementFacade individualPriceText;
    @FindBy (css = ".wc-proceed-to-checkout a")
    private WebElementFacade proceedToCheckoutButton;
    @FindBy (css = "#post-5 > div > div > form > table > tbody > tr.woocommerce-cart-form__cart-item.cart_item > td.product-subtotal > span")
    private WebElementFacade totalPriceText;
    @FindBy (css = "#post-5 > div > div > form > table > tbody > tr.woocommerce-cart-form__cart-item.cart_item > td.product-quantity > div > label")
    private WebElementFacade quantityField;
    @FindBy (css = "[value=\"Update cart\"]")
    private WebElementFacade updateCartButton;
    @FindBy (css = "#post-5 > div > div > form > table > tbody > tr.woocommerce-cart-form__cart-item.cart_item > td.product-remove > a")
    private WebElementFacade removeItemButton;
    @FindBy (css = ".woocommerce .cart-empty")
    private WebElementFacade cartEmptyMessage;
    @FindBy (css = ".woocommerce-message .restore-item")
    private WebElementFacade undoLink;
    @FindBy (css = ".coupon .button")
    private WebElementFacade applyCouponButton;
    @FindBy (css = ".woocommerce-error li")
    private WebElementFacade enterCouponMessage;



    public void clickProceedToCheckoutButton(){
        clickOn(proceedToCheckoutButton);
    }

    public boolean checkPricesAreEqual(){
        String individualPrice = individualPriceText.getText();
        String totalPrice = totalPriceText.getText();
        int x = Integer.parseInt(individualPrice.replaceAll(",","").replaceAll(" lei",""));
        int y = Integer.parseInt(totalPrice.replaceAll(",","").replaceAll(" lei",""));
        return x==y;
    }
    public void typeQuantity(String n){
        quantityField.clear();
        quantityField.select();
    }
    public boolean checkForNPricesAreEqual(int n) {
        String individualPrice = individualPriceText.getText();
        String totalPrice = totalPriceText.getText();
        int x = Integer.parseInt(individualPrice.replaceAll(",", "").replaceAll(" lei", ""));
        int y = Integer.parseInt(totalPrice.replaceAll(",", "").replaceAll(" lei", ""));
        return x*n == y;
    }
    public void clickUpdateCartButton(){
        clickOn(updateCartButton);
    }
    public void clickRemoveItemButton(){
        clickOn(removeItemButton);
    }
    public String getEmptyCartMessageText(){
        return cartEmptyMessage.getText();
    }
    public boolean checkIfUndoLinkIsVisibleAndClickable(){
        if (undoLink.isVisible()&&undoLink.isClickable())
            return true;
        else
            return false;
    }
    public void clickUndoLink(){
        clickOn(undoLink);
    }
    public void clickApplyCouponButton(){
        clickOn(applyCouponButton);
    }
    public String getEnterCouponMessageText(){
        return enterCouponMessage.getText();
    }
}
