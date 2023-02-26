package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends PageObject {
    @FindBy(css = ".cart .button")
    private WebElementFacade addToCartButton;
    @FindBy(css = "#main > div.woocommerce-message > a")
    private WebElementFacade addedToCartMessage;
    @FindBy(css = ".woocommerce-message a")
    private WebElementFacade viewCartButton;
    @FindBy(css = ".posted_in a")
    private WebElementFacade categoryLink;
    @FindBy(id = "tab-title-reviews")
    private WebElementFacade reviewTab;
    @FindBy(css = ".stars .star-5")
    private WebElementFacade fiveStarRating;
    @FindBy(id = "comment")
    private WebElementFacade reviewField;
    @FindBy(id = "author")
    private WebElementFacade authorField;
    @FindBy(id = "email")
    private WebElementFacade authorEmailField;
    @FindBy(id = "submit")
    private WebElementFacade submitReviewButton;
    @FindBy(css = ".description")
    private List<WebElementFacade> listOfReviews;

    public void clickAddToCartButton() {
        clickOn(addToCartButton);
    }

    public String getAddedToCartMessageText() {
        return addedToCartMessage.getText();
    }

    public void clickViewCartButton() {
        clickOn(viewCartButton);
    }

    public boolean isCategoryVisibleAndClickable() {
        if (categoryLink.isVisible() && categoryLink.isClickable())
            return true;
        else {
            return false;
        }
    }

    public void clickCategoryLink() {
        clickOn(categoryLink);
    }

    public void clickReviewTab() {
        clickOn(reviewTab);
    }

    public void clickFiveStarRating() {
        clickOn(fiveStarRating);
    }

    public void typeReview(String reviewText) {
        typeInto(reviewField, reviewText);
    }

    public void typeAuthor(String authorName) {
        typeInto(authorField, authorName);
    }

    public void typeAuthorEmail(String email) {
        typeInto(authorEmailField, email);
    }

    public void clickSubmitReviewButton() {
        clickOn(submitReviewButton);
    }

    public boolean isReviewInList(String review) {
        for (WebElementFacade element : listOfReviews) {
            if (element.getText().equalsIgnoreCase(review)) {
                return true;
            }
        }
        return false;

    }
}
