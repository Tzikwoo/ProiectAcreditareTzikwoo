package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ProductSteps extends BaseSteps{
    @Step
    public void checkIfProductCategoryIsVisibleAndClickable(){
        Assert.assertTrue(productPage.isCategoryVisibleAndClickable());
    }
    @Step
    public void clickCategoryLink(){
        productPage.clickCategoryLink();
    }
    @Step
    public void clickReviewTab(){
        productPage.clickReviewTab();
    }
    @Step
    public void clickFiveStarRating(){
        productPage.clickFiveStarRating();
    }
    @Step
    public void typeReview(String reviewText){
        productPage.typeReview(reviewText);
    }
    @Step
    public void typeAuthor(String authorName){
        productPage.typeAuthor(authorName);
    }
    @Step
    public void typeAuthorEmail(String email){
        productPage.typeAuthorEmail(email);
    }
    @Step
    public void clickSubmitReviewButton(){
        productPage.clickSubmitReviewButton();
    }
    @Step
    public void isReviewInList(String review){
        Assert.assertTrue(productPage.isReviewInList(review));
    }
    @Step
    public void changeQuantity(int n){
        productPage.setSpinnerValue(n);
    }
}
