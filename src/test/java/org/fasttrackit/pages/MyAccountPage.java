package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageObject {
    @FindBy (css = "p strong:first-child")
    private WebElementFacade welcomeTextElement;

    public void isWelcomeTextDisplayed(String welcomeText){
        welcomeTextElement.shouldContainOnlyText(welcomeText);
    }
}
