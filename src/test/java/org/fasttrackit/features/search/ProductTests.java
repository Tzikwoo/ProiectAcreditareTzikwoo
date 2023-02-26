package org.fasttrackit.features.search;

import org.junit.Test;

public class ProductTests extends BaseTest{
    @Test
    public void checkIfProductCategoryIsVisibleAndClickableTest(){
        searchSteps.searchAndClick("Beanie");
        searchSteps.selectProductFromList("Beanie with Logo");
        productSteps.checkIfProductCategoryIsVisibleAndClickable();
    }
    @Test
    public void checkIfItemIsINPageDisplayedCategoryTest(){
        String itemName = "Beanie with Logo";
        searchSteps.searchAndClick("Beanie");
        searchSteps.selectProductFromList(itemName);
        productSteps.clickCategoryLink();
        searchSteps.isProductInList(itemName);
    }
}
