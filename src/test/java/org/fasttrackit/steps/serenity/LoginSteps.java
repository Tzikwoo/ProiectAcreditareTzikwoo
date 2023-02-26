package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps extends BaseSteps{
    @Step
    public void navigateToAccountPage(){
        homePage.clickOnAccountLink();
    }
    @Step
    public void typeUserMail(String email){
        loginPage.typeLoginEmail(email);
    }
    @Step
    public void typeUserPassword(String password){
        loginPage.typeLoginPassword(password);
    }
    @Step
    public void clickLoginButton(){
        loginPage.clickOnLoginButton();
    }
    @Step
    public void doLogin(String email, String password){
    navigateToAccountPage();
    typeUserMail(email);
    typeUserPassword(password);
    clickLoginButton();
    }
    @Step
    public void verifyWelcomeMessage (String message){
    myAccountPage.verifyWelcomeText(message);
    }
    @Step
    public void invalidPasswordMessage(){
        Assert.assertEquals("ERROR: The password you entered for the email address bogdi_perte98@yahoo.com is incorrect. Lost your password?",loginPage.getInvalidPasswordMessage());
    }
    @Step
    public void usernameRequiredMessage(){
        Assert.assertEquals("Error: Username is required.",loginPage.getEmptyFieldsMessage());
    }
    @Step
    public void clickLostPasswordLink(){
        loginPage.clickLostPasswordLink();

    }
    @Step
    public void navigateToHomepage(){
        homePage.open();
    }
}
