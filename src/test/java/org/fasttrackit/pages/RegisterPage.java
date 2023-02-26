package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageObject {
    @FindBy(id = "reg_email")
    private WebElementFacade emailRegisterField;
    @FindBy(id = "reg_password")
    private WebElementFacade passwordRegisterField;
    @FindBy(css = "[value=\"Register\"]")
    private WebElementFacade registerButton;
    @FindBy(css = "#post-7 > div > div > ul > li")
    private WebElementFacade alreadyUsedNotification;
    @FindBy(css = "p div")
    private WebElementFacade weakPasswordNotification;
    @FindBy(css = "p small")
    private WebElementFacade hintNotification;

    public void typeRegisterEmail(String email) {
        typeInto(emailRegisterField, email);
    }

    public void typeRegisterPassword(String password) {
        typeInto(passwordRegisterField, password);
    }

    public void clickRegisterButton() {
        clickOn(registerButton);
    }

    public String getAlreadyUsedNotificationText() {
        return alreadyUsedNotification.getText();
    }

    public boolean checkWeakPassAndHintAreVisible() {
        if (weakPasswordNotification.isCurrentlyVisible()
                && hintNotification.isCurrentlyVisible()
                && weakPasswordNotification.getText().equals
                ("Very weak - Please enter a stronger password.")
                && hintNotification.getText().equals
                ("Hint: The password should be at least twelve characters long." +
                        " To make it stronger, use upper and lower case letters, numbers, and symbols like ! \" ? $ % ^ & )."))
            return true;
        else {
            return false;

        }
    }
}
