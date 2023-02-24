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
}
