package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.jsoup.Connection;
import org.junit.Assert;

public class AdminSteps extends BaseSteps {
    @Step
    public void checkIfAdminSiteNamePopUpIsVisibleAndClickable(){
        Assert.assertTrue(adminAccountPage.checkIfAdminSiteNamePopUpIsVisibleAndClickable());
    }
    @Step
    public void clickAdminDashboard(){
        adminAccountPage.clickAdminDashboard();
    }
    @Step
    public void clickCommentsButton(){
        adminPage.clickCommentsButton();
    }
    @Step
    public void typeCommentSearch(String comment){
        adminPage.typeCommentsSearch(comment);
    }
    @Step
    public void clickCommentsSearchButton(){
        adminPage.clickSearchComments();
    }
    @Step
    public void clickApproveButton(){
        adminPage.clickApproveButton();
    }
}
