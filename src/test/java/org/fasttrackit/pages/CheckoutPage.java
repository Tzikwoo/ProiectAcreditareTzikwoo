package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageObject {
    @FindBy (id = "billing_first_name")
    private WebElementFacade firstNameField;
    @FindBy (id = "billing_last_name")
    private WebElementFacade lastNameField;
    @FindBy (id = "billing_country")
    private WebElementFacade countryDropdown;
    @FindBy (id = "billing_address_1")
    private WebElementFacade streetAndNumberField;
    @FindBy (id = "billing_city")
    private WebElementFacade cityField;
    @FindBy (id = "billing_state")
    private WebElementFacade countyDropdown;
    @FindBy (id = "billing_postcode")
    private WebElementFacade postcodeField;
    @FindBy (id = "billing_phone")
    private WebElementFacade phoneField;
    @FindBy (id = "billing_email")
    private WebElementFacade emailField;
    @FindBy (id = "place_order")
    private WebElementFacade placeOrderButton;
    @FindBy (css = "#post-6 > div > div > div > p.woocommerce-notice.woocommerce-notice--success.woocommerce-thankyou-order-received")
    private WebElementFacade orderConfirmationMessage;
    @FindBy (css = ".cart-subtotal .amount")
    private WebElementFacade subTotalPrice;
    @FindBy(css = ".order-total .amount")
    private WebElementFacade totalPrice;
    @FindBy (css = ".showlogin")
    private WebElementFacade returningCustomerLink;

    public void typeFirstName(String firstName){
        typeInto(firstNameField,firstName);
    }
    public void typeLastName(String lastName){
        typeInto(lastNameField,lastName);
    }
    public void selectCountry(String country){
        selectFromDropdown(countryDropdown,country);
    }
    public void typeAddress(String address){
        typeInto(streetAndNumberField,address);
    }
    public void typeCity(String city){
        typeInto(cityField,city);
    }
    public void selectCounty(String county){
        selectFromDropdown(countyDropdown,county);
    }
    public void typePostcode(String postcode){
        typeInto(postcodeField,postcode);
    }
    public void typePhone(String phone){
        typeInto(phoneField,phone);
    }
    public void typeEmail(String email){
        typeInto(emailField,email);
    }
    public void clickPlaceOrderButton(){
        clickOn(placeOrderButton);
    }
    public void completeCheckoutFieldsPreset(){
        firstNameField.type("Bogdan");
        lastNameField.type("Perte");
        countryDropdown.selectByValue("RO");
        streetAndNumberField.type("25 Grigore Alexandrescu Street");
        cityField.type("Cluj-Napoca");
        countyDropdown.selectByValue("CJ");
        postcodeField.type("400529");
        phoneField.type("0743942953");
        emailField.type("bogdanlaurentiu@yahoo.com");
    }
    public void completeCheckoutFieldsRegisteredUser(){
        firstNameField.type("Bogdan");
        lastNameField.type("Perte");
        countryDropdown.selectByValue("RO");
        streetAndNumberField.type("25 Grigore Alexandrescu Street");
        cityField.type("Cluj-Napoca");
        countyDropdown.selectByValue("CJ");
        postcodeField.type("400529");
        phoneField.type("0743942953");
    }
    public String getConfirmationText(){
        waitFor(orderConfirmationMessage);
        return orderConfirmationMessage.getText();
    }
    public boolean checkIfPromo30Works(){
        String subTotal = subTotalPrice.getText();
        String total = totalPrice.getText();
        int subTotalPrice = Integer.parseInt(subTotal.replaceAll(",","").replaceAll(" lei",""));
        int totalPrice = Integer.parseInt(total.replaceAll(",","").replaceAll(" lei",""));
        return subTotalPrice - subTotalPrice*0.3 == totalPrice;
    }
    public boolean checkIfReturningCustomerLinkIsVisibleAndClickable(){
        if (returningCustomerLink.isVisible()&&returningCustomerLink.isClickable())
            return true;
        else
            return false;
    }
}
