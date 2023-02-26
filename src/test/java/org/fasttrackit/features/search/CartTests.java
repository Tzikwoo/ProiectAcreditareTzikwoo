package org.fasttrackit.features.search;

import org.junit.Test;

public class CartTests extends BaseTest{
    @Test
    public void addASpecificItemToCartTest(){
        searchSteps.searchAndClick("HOODIE");
        searchSteps.clickHoodieWithZipper();
        addToCartSteps.clickAddToCart();
        addToCartSteps.checkAddedToCartMessage();
    }
    @Test
    public void addItemToCartTest(){
        searchSteps.searchAndClick("Beanie");
        searchSteps.selectProductFromList("Beanie with Logo");
        addToCartSteps.clickAddToCart();
        addToCartSteps.checkAddedToCartMessage();
    }
    @Test
    public void checkIfPricesMatchInCartTest(){
        searchSteps.searchAndClick("Beanie");
        searchSteps.selectProductFromList("Beanie with Logo");
        addToCartSteps.clickAddToCart();
        addToCartSteps.clickViewCartButton();
        addToCartSteps.checkPricesAreEqual();
    }
    @Test
    public void checkIfPricesMatchInCartAfterChangingQuantityTest(){
        searchSteps.searchAndClick("Beanie");
        searchSteps.selectProductFromList("Beanie with Logo");
        addToCartSteps.clickAddToCart();
        addToCartSteps.clickViewCartButton();
        addToCartSteps.changeQuantity(3);
        addToCartSteps.updateCart();
        addToCartSteps.checkForNPricesAreEqual(3);
    }
    @Test
    public void addQuantityOnProductPageThenCheckPriceInCartTest(){
        searchSteps.searchAndClick("Beanie");
        searchSteps.selectProductFromList("Beanie with Logo");
        addToCartSteps.clickAddToCart();
        searchSteps.searchAndClick("Beanie");
        searchSteps.selectProductFromList("Beanie with Logo");
        addToCartSteps.clickAddToCart();
        addToCartSteps.clickViewCartButton();
        addToCartSteps.checkForNPricesAreEqual(2);
    }
    @Test
    public void checkIfEmptyCartMessageIsDisplayedTest(){
        searchSteps.searchAndClick("Beanie");
        searchSteps.selectProductFromList("Beanie with Logo");
        addToCartSteps.clickAddToCart();
        addToCartSteps.clickViewCartButton();
        addToCartSteps.removeItem();
        addToCartSteps.checkIfEmptyCartMessageIsDisplayed();
    }
    @Test
    public void checkIfUndoLinkIsVisibleAndClickableTest(){
        searchSteps.searchAndClick("Beanie");
        searchSteps.selectProductFromList("Beanie with Logo");
        addToCartSteps.clickAddToCart();
        addToCartSteps.clickViewCartButton();
        addToCartSteps.removeItem();
        addToCartSteps.checkIfUndoLinkIsVisibleAndClickable();
    }
    @Test
    public void addItemThenRemoveItemTest(){
        searchSteps.searchAndClick("Beanie");
        searchSteps.selectProductFromList("Beanie with Logo");
        addToCartSteps.clickAddToCart();
        addToCartSteps.clickViewCartButton();
        addToCartSteps.removeItem();
        addToCartSteps.clickUndoLink();
        addToCartSteps.checkPricesAreEqual();
    }
    @Test
    public void checkMessageForEmptyCouponFieldTest(){
        searchSteps.searchAndClick("Beanie");
        searchSteps.selectProductFromList("Beanie with Logo");
        addToCartSteps.clickAddToCart();
        addToCartSteps.clickViewCartButton();
        addToCartSteps.clickApplyCouponButton();
        addToCartSteps.checkIfEnterCouponMessageIsDisplayed();
    }
    @Test
    public void checkMessageForInvalidCouponTest(){
        searchSteps.searchAndClick("Beanie");
        searchSteps.selectProductFromList("Beanie with Logo");
        addToCartSteps.clickAddToCart();
        addToCartSteps.clickViewCartButton();
        addToCartSteps.typeCoupon("ghhhs");
        addToCartSteps.clickApplyCouponButton();
        addToCartSteps.checkCouponDoesntExistMessage();

    }
    @Test
    public void checkMessageForPriceUnder50Test(){
        searchSteps.searchAndClick("Beanie");
        searchSteps.selectProductFromList("Beanie with Logo");
        addToCartSteps.clickAddToCart();
        addToCartSteps.clickViewCartButton();
        addToCartSteps.typeCoupon("promo30");
        addToCartSteps.clickApplyCouponButton();
        addToCartSteps.checkUnder50Complete();
    }
    @Test
    public void checkIfPromo30MessageIsDisplayedTest(){
        String itemName = "Beanie with Logo";
        searchSteps.searchAndClick("Beanie");
        searchSteps.selectProductFromList(itemName);
        productSteps.changeQuantity(3);
        addToCartSteps.clickAddToCart();
        addToCartSteps.clickViewCartButton();
        addToCartSteps.typeCoupon("promo30");
        addToCartSteps.clickApplyCouponButton();
        addToCartSteps.checkPromoCodeApplied();
    }
    @Test
    public void checkIfPromo30Works(){
        String itemName = "Beanie with Logo";
        searchSteps.searchAndClick("Beanie");
        searchSteps.selectProductFromList(itemName);
        productSteps.changeQuantity(3);
        addToCartSteps.clickAddToCart();
        addToCartSteps.clickViewCartButton();
        addToCartSteps.typeCoupon("promo30");
        addToCartSteps.clickApplyCouponButton();
        addToCartSteps.checkIfPromo30Works();
    }
}
