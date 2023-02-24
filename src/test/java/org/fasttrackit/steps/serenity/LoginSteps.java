package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;

public class LoginSteps extends BaseSteps{
    @Step
    public void navigateToAccountPage(){
        homePage.clickOnAccountLink();
    }
    @Step
    public void typeUserMail(String email){
        accountPage.typeLoginEmail(email);
    }
    @Step
    public void typeUserPassword(String password){
        accountPage.typeLoginPassword(password);
    }
    @Step
    public void clickLoginButton(){
        accountPage.clickOnLoginButton();
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
        myAccountPage.isWelcomeTextDisplayed(message);
    }
}
