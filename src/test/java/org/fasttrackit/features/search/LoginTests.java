package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.fasttrackit.Utils.Constants;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class LoginTests extends BaseTest{

    @Test
    public void validLoginTest(){
    loginSteps.navigateToAccountPage();
    loginSteps.typeUserMail(Constants.USER_EMAIL);
    loginSteps.typeUserPassword(Constants.USER_PASSWORD);
    loginSteps.clickLoginButton();
    loginSteps.verifyWelcomeMessage("bogdi_perte98");
    }
    @Test
    public void invalidPasswordLoginTest(){
        loginSteps.navigateToAccountPage();
        loginSteps.typeUserMail(Constants.USER_EMAIL);
        loginSteps.typeUserPassword("123456");
        loginSteps.clickLoginButton();
        loginSteps.invalidPasswordMessage();
    }
    @Test
    public void emptyFieldsLoginTest(){
        loginSteps.navigateToAccountPage();
        loginSteps.clickLoginButton();
        loginSteps.usernameRequiredMessage();
    }
    @Test
    public void verifyPasswordResetTest(){
        loginSteps.navigateToAccountPage();
        loginSteps.clickLostPasswordLink();
        myAccountSteps.typeLostEmail(Constants.USER_EMAIL);
        myAccountSteps.clickResetPasswordButton();
        myAccountSteps.verifyPasswordResetNotification();

    }
    @Test
    public void validAdminLoginTest(){
        loginSteps.navigateToAccountPage();
        loginSteps.typeUserMail(Constants.ADMIN_EMAIL);
        loginSteps.typeUserPassword(Constants.ADMIN_PASSWORD);
        loginSteps.clickLoginButton();
        adminSteps.checkIfAdminSiteNamePopUpIsVisibleAndClickable();
    }
}
