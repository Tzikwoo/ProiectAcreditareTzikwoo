package org.fasttrackit.features.search;

import org.fasttrackit.Utils.Constants;
import org.junit.Test;

public class AdminTests extends BaseTest{
    @Test
    public void leaveAReviewThenApproveItTest(){
        String reviewText = "TEST REVIEW4";
        String authorName = "ALEX ANDREI";
        String authorEmail = "alexandrei@yahoo.com";
        searchSteps.searchAndClick("Beanie");
        searchSteps.selectProductFromList("Beanie with Logo");
        productSteps.clickReviewTab();
        productSteps.clickFiveStarRating();
        productSteps.typeReview(reviewText);
        productSteps.typeAuthor(authorName);
        productSteps.typeAuthorEmail(authorEmail);
        productSteps.clickSubmitReviewButton();
        loginSteps.navigateToAccountPage();
        loginSteps.typeUserMail(Constants.ADMIN_EMAIL);
        loginSteps.typeUserPassword(Constants.ADMIN_PASSWORD);
        loginSteps.clickLoginButton();
        adminSteps.clickAdminDashboard();
        adminSteps.clickCommentsButton();
        adminSteps.typeCommentSearch(reviewText);
        adminSteps.clickCommentsSearchButton();
        adminSteps.clickApproveButton();
        loginSteps.navigateToHomepage();
        searchSteps.searchAndClick("Beanie");
        searchSteps.selectProductFromList("Beanie with Logo");
        productSteps.clickReviewTab();
        productSteps.isReviewInList(reviewText);
    }
}
