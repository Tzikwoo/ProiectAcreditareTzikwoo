package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageObject {
    @FindBy (css = ".cart .button")
    private WebElementFacade addToCartButton;
    @FindBy (css = "#main > div.woocommerce-message > a")
    private WebElementFacade addedToCartMessage;
    @FindBy (css = ".woocommerce-message a")
    private WebElementFacade viewCartButton;
    @FindBy (css= ".posted_in a")
    private WebElementFacade categoryLink;

    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }
    public String getAddedToCartMessageText(){
        return addedToCartMessage.getText();
    }
    public void clickViewCartButton(){
        clickOn(viewCartButton);
    }
    public boolean isCategoryVisibleAndClickable(){
        if (categoryLink.isVisible()&&categoryLink.isClickable())
            return true;
            else {
                return false;
            }
        }
        public void clickCategoryLink(){
        clickOn(categoryLink);
        }

    }
