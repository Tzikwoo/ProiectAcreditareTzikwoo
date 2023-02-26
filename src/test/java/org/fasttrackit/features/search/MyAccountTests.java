package org.fasttrackit.features.search;

import org.fasttrackit.Utils.Constants;
import org.junit.Ignore;
import org.junit.Test;

public class MyAccountTests extends BaseTest{
    String oldPassword = "PerteBogdan";
    String newPassword = "PerteBogdan1";
    String auxiliary;
    @Test
    public void logOutTest(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASSWORD);
        myAccountSteps.clickLogOutLink();
        myAccountSteps.checkLogOut();
    }
    @Ignore
    @Test
    public void changePasswordTest(){
        String user = "bogdanperte30@yahoo.com";
        loginSteps.doLogin(user,oldPassword);
        myAccountSteps.clickAccountDetailsLink();
        myAccountSteps.changePassword(oldPassword,newPassword,newPassword);
        myAccountSteps.clickSaveChangesButton();
        myAccountSteps.checkPasswordChanged();
        myAccountSteps.clickLogOutLink();
        loginSteps.typeUserMail(user);
        loginSteps.typeUserPassword(newPassword);
        loginSteps.clickLoginButton();
        loginSteps.verifyWelcomeMessage("bogdanperte30");
        auxiliary = oldPassword;
        oldPassword = newPassword;
        newPassword = auxiliary;
    }
    @Test
    public void checkIfButtonsAreInteractiveTest(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASSWORD);
        myAccountSteps.checkLinksAreInteractible();
    }
}
