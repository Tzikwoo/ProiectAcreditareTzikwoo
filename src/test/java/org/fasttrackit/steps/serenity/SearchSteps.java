package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps extends BaseSteps{
    @Step
    public void navigateToHomepage(){
        homePage.open();
    }
    @Step
    public void searchAndClick(String itemName){
        homePage.searchAndClick(itemName);
    }
    @Step
    public void isProductInList(String productName){
        Assert.assertTrue(searchResultsPage.isProductInList(productName));
    }
    @Step
    public void checkInexistentItemMessage(){
        Assert.assertEquals("No products were found matching your selection.",searchResultsPage.getNoItemFoundMessage());
    }
    @Step
    public void clickHoodieWithZipper(){
        searchResultsPage.clickHoodieWithZipper();
    }
    @Step
    public void selectProductFromList(String product) {
        searchResultsPage.selectProductInList(product);
    }
    @Step
    public void selectDescendingOrderDropdown(){
        searchResultsPage.selectDescendingOrderDropdown();
    }
    @Step
    public void clickAccesoriesLink(){
        searchResultsPage.clickAccesoriesLink();
    }
    @Step
    public void checkDescendingOrder(){
        Assert.assertTrue(searchResultsPage.isPriceDescending());
    }
    @Step
    public void selectAscendingOrderDropdown(){
        searchResultsPage.selectAscendingOrderDropdown();
    }
    @Step
    public void checkAscendingOrder(){
        Assert.assertTrue(searchResultsPage.isPriceAscending());
    }
}
