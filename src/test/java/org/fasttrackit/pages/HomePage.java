package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa1.fasttrackit.org:8008/")
public class HomePage extends PageObject {
    @FindBy(id = "menu-item-58")
    private WebElementFacade accountLink;
    @FindBy (id = "woocommerce-product-search-field-0")
    private WebElementFacade searchField;
    @FindBy (css = "button[value=\"Search\"]")
    private WebElementFacade searchButton;

    public void clickOnAccountLink(){
        clickOn(accountLink);
    }
    public void searchAndClick(String productName){
        typeInto(searchField,productName);
        clickOn(searchButton);
    }
}
