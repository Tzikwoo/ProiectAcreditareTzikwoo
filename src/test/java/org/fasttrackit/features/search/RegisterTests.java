package org.fasttrackit.features.search;

import org.fasttrackit.Utils.Constants;
import org.junit.Test;

public class RegisterTests extends BaseTest{
    @Test
    public void validRegisterTest(){
        loginSteps.navigateToAccountPage();
        String USER = Constants.USER_RANDOM_EMAIL;
        registerSteps.typeRegisterEmail(USER);
        registerSteps.typeRegisterPassword(Constants.USER_RANDOM_PASSWORD);
        registerSteps.clickRegisterButton();
        registerSteps.verifyWelcomeMessage(USER.substring(0, USER.length() - 10));
    }
    @Test
    public void registerWithUserAlreadyUsedTest(){
        loginSteps.navigateToAccountPage();
        registerSteps.typeRegisterEmail(Constants.USER_EMAIL);
        registerSteps.typeRegisterPassword(Constants.USER_PASSWORD);
        registerSteps.clickRegisterButton();
        registerSteps.checkAlreadyUsedNotification();
    }
    @Test
    public void verifyWeakPasswordAndHintsAreVisible(){
        loginSteps.navigateToAccountPage();
        registerSteps.typeRegisterEmail(Constants.USER_RANDOM_EMAIL);
        registerSteps.typeRegisterPassword("123");
        registerSteps.checkWeakPasswordAndHintAreVisible();
    }
}
