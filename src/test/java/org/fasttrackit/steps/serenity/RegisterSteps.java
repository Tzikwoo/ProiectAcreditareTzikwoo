package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class RegisterSteps extends BaseSteps{
    @Step
    public void typeRegisterEmail(String email){
        registerPage.typeRegisterEmail(email);
    }
    @Step
    public void typeRegisterPassword(String password){
        registerPage.typeRegisterPassword(password);
    }
    @Step
    public void clickRegisterButton(){
        registerPage.clickRegisterButton();
    }
    @Step
    public void verifyWelcomeMessage (String message){
        myAccountPage.verifyWelcomeText(message);
    }
    @Step
    public void checkAlreadyUsedNotification(){
        Assert.assertEquals("Error: An account is already registered with your email address. Please log in.",registerPage.getAlreadyUsedNotificationText());
    }
    @Step
    public void checkWeakPasswordAndHintAreVisible(){
        Assert.assertTrue(registerPage.checkWeakPassAndHintAreVisible());
    }
    @Step
    public void doRegister(String mail, String password){
        registerPage.typeRegisterEmail(mail);
        registerPage.typeRegisterPassword(password);
        registerPage.clickRegisterButton();
    }
}
