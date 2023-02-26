package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageObject {
    @FindBy (css = "p strong:first-child")
    private WebElementFacade welcomeTextElement;
    @FindBy(id = "user_login")
    private WebElementFacade lostPasswordEmailField;
    @FindBy(css = "[value=\"Reset password\"]")
    private WebElementFacade resetPasswordButton;
    @FindBy (css = "#post-7 > div > div > div")
    private WebElementFacade passwordResetNotification;
    @FindBy (css = "#post-7 > div > div > div > p:nth-child(1) > a")
    private WebElementFacade logOutLink;
    @FindBy(css = "#post-7 > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--edit-account > a")
    private WebElementFacade accountDetailsLink;
    @FindBy (id = "password_current")
    private WebElementFacade currentPasswordField;
    @FindBy (id = "password_1")
    private WebElementFacade newPasswordField;
    @FindBy (id = "password_2")
    private WebElementFacade confirmNewPasswordField;
    @FindBy (css = "[value=\"Save changes\"]")
    private WebElementFacade saveChangesButton;
    @FindBy (css = "#post-7 > div > div > div.woocommerce-message")
    private WebElementFacade passwordChangedMessage;
    @FindBy (css = "#post-7 > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--orders > a")
    private WebElementFacade ordersLink;
    @FindBy (css = "#post-7 > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--downloads > a")
    private WebElementFacade downloadsLink;
    @FindBy (css = "#post-7 > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--edit-address > a")
    private WebElementFacade addressesLink;
    @FindBy (css = "#post-7 > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--customer-logout > a")
    private WebElementFacade logoutLink2;



    public void verifyWelcomeText(String welcomeText){welcomeTextElement.shouldContainOnlyText(welcomeText);
    }
    public void typeLostEmail(String email){
        typeInto(lostPasswordEmailField,email);
    }
    public void clickResetPasswordButton(){
        clickOn(resetPasswordButton);
    }
    public String getPasswordResetNotificationText(){
       return passwordResetNotification.getText();
    }
    public void clickLogOutLink(){
        clickOn(logOutLink);
    }
    public void clickAccountDetailsLink(){
        clickOn(accountDetailsLink);
    }
    public void typeCurrentPassword(String currentPassword){
        typeInto(currentPasswordField,currentPassword);
    }
    public void typeNewPassword(String newPassword){
        typeInto(newPasswordField,newPassword);
    }
    public void confirmNewPassword(String confirmPassword){
        typeInto(confirmNewPasswordField,confirmPassword);
    }
    public void clickSaveChangesButton(){
        clickOn(saveChangesButton);
    }
    public String getPasswordChangedMessageText(){
        return passwordChangedMessage.getText();
    }
    public boolean checkAccountLinksAreInteractible() {
        if (ordersLink.isClickable() && ordersLink.isCurrentlyVisible()
                && downloadsLink.isClickable() && downloadsLink.isCurrentlyVisible()
                && addressesLink.isClickable() && addressesLink.isCurrentlyVisible()
                && accountDetailsLink.isClickable() && accountDetailsLink.isCurrentlyVisible()
                && logoutLink2.isClickable() && logoutLink2.isCurrentlyVisible())
            return true;
        else {
            return false;
        }
    }
}
