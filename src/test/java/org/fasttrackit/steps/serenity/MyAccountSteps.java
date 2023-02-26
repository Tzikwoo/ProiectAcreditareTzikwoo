package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class MyAccountSteps extends BaseSteps{
    @Step
    public void typeLostEmail(String email){
        myAccountPage.typeLostEmail(email);
    }
    @Step
    public void clickResetPasswordButton(){
        myAccountPage.clickResetPasswordButton();
    }
    @Step
    public void verifyPasswordResetNotification(){
        Assert.assertEquals("Password reset email has been sent.",myAccountPage.getPasswordResetNotificationText());
    }
    @Step
    public void clickLogOutLink(){
        myAccountPage.clickLogOutLink();
    }
    @Step
    public void checkLogOut(){
        Assert.assertTrue(loginPage.checkIfLoginButtonIsVisible());
    }
    @Step
    public void clickAccountDetailsLink (){
        myAccountPage.clickAccountDetailsLink();
    }
    @Step
    public void changePassword(String oldPassword, String newPassword, String confirmPassword){
        myAccountPage.typeCurrentPassword(oldPassword);
        myAccountPage.typeNewPassword(newPassword);
        myAccountPage.confirmNewPassword(confirmPassword);
    }
    @Step
    public void clickSaveChangesButton(){
        myAccountPage.clickSaveChangesButton();
    }
    @Step
    public void checkPasswordChanged(){
        Assert.assertEquals("Account details changed successfully.",myAccountPage.getPasswordChangedMessageText());
    }
    @Step
    public void checkLinksAreInteractible(){
        Assert.assertTrue(myAccountPage.checkAccountLinksAreInteractible());
    }
}
