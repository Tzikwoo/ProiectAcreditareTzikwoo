package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jruby.common.IRubyWarnings;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends PageObject {
    @FindBy (id = "reg_email")
    private WebElementFacade emailField;
    @FindBy (id = "reg_password")
    private WebElementFacade passwordField;
    @FindBy (id = "username")
    private WebElementFacade loginEmailField;
    @FindBy (id = "password")
    private WebElementFacade loginPasswordField;
    @FindBy (css = ".form-row [value=\"Login\"]")
    private WebElementFacade loginButton;

    public void typeRegisterEmail(String email){
    typeInto(emailField,email);
    }
    public void typeRegisterPassword(String password){
        typeInto(passwordField,password);
    }
    public void typeLoginEmail(String email){
        typeInto(loginEmailField,email);
    }
    public void typeLoginPassword(String password){
        typeInto(loginPasswordField, password);
    }
    public void clickOnLoginButton(){
        clickOn(loginButton);
    }
}
