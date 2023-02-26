package org.fasttrackit.features.search;

import org.junit.Test;

public class SearchTests extends BaseTest{
    @Test
    public void searchForSpecificItemTest(){
        searchSteps.searchAndClick("HOODIE");
        searchSteps.isProductInList("HOODIE WITH ZIPPER");
    }
    @Test
    public void verifyInexistentMessageAfterSearchTest(){
        searchSteps.searchAndClick("BLANK");
        searchSteps.checkInexistentItemMessage();
    }
    @Test
    public void sortByPriceDescendingSearchedProductsTest(){
        searchSteps.searchAndClick("BELT");
        searchSteps.clickAccesoriesLink();
        searchSteps.selectDescendingOrderDropdown();
        searchSteps.checkDescendingOrder();
    }
    @Test
    public void sortByPriceAscendingSearchedProductsTest(){
        searchSteps.searchAndClick("BELT");
        searchSteps.clickAccesoriesLink();
        searchSteps.selectAscendingOrderDropdown();
        searchSteps.checkAscendingOrder();
    }
}
