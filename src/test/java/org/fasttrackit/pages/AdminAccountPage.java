package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AdminAccountPage extends PageObject {
    @FindBy (css = "#wp-admin-bar-site-name > a")
    private WebElementFacade adminSiteNamePopUp;
    @FindBy (css = "#wp-admin-bar-site-name > a")
    private WebElementFacade adminDashboard;

    public boolean checkIfAdminSiteNamePopUpIsVisibleAndClickable(){
        if (adminSiteNamePopUp.isVisible()&&adminSiteNamePopUp.isClickable())
            return true;
        else
            return false;
    }
    public void clickAdminDashboard(){
        clickOn(adminDashboard);
    }
}
