package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;

import java.util.List;

public class SearchResultsPage extends PageObject {
    @FindBy(css = "a h2 ")
    private List<WebElementFacade> listOfProductsResults;
    @FindBy(css = "main p")
    private WebElementFacade noItemFoundMessage;
    @FindBy(css = "#main > ul > li.post-18.product.type-product.status-publish.has-post-thumbnail.product_cat-hoodies.clearfix.instock.featured.shipping-taxable.purchasable.product-type-simple > a.woocommerce-LoopProduct-link.woocommerce-loop-product__link > h2")
    private WebElementFacade hoodieWithZipperLink;
    @FindBy(css = ".orderby")
    private WebElementFacade orderDropdown;
    @FindBy (css = "#main > ul > li.post-15.product.type-product.status-publish.has-post-thumbnail.product_cat-accessories.clearfix.first.instock.sale.featured.shipping-taxable.purchasable.product-type-simple > a.woocommerce-LoopProduct-link.woocommerce-loop-product__link > span.price > ins > span")
    private List<WebElementFacade> listOfProductPrices;
    @FindBy (css = "#main > nav > a:nth-child(3)")
    private WebElementFacade accessoriesLink;

    public boolean isProductInList(String productName) {
        for (WebElementFacade element : listOfProductsResults) {
            if (element.getText().equalsIgnoreCase(productName)) {
                return true;
            }
        }
        return false;
    }

    public String getNoItemFoundMessage() {
        return noItemFoundMessage.getText();
    }

    public void clickHoodieWithZipper() {
        clickOn(hoodieWithZipperLink);
    }

    public void selectProductInList(String productName) {
        for (WebElementFacade element : listOfProductsResults) {
            if (element.getText().equalsIgnoreCase(productName)) {
                clickOn(element);
                break;
            }
        }
    }
    public void selectDescendingOrderDropdown(){
        orderDropdown.selectByValue("price-desc");
    }
    public void selectAscendingOrderDropdown(){
        orderDropdown.selectByValue("price");
    }
    public void clickAccesoriesLink(){
        clickOn(accessoriesLink);
    }
    public boolean isPriceDescending(){
        String firstPrice = listOfProductPrices.get(0).getText();
        String lastPrice = listOfProductPrices.get(listOfProductPrices.size()-1).getText();
        int x = Integer.parseInt(firstPrice.replaceAll(",","").replaceAll(" lei",""));
        int y = Integer.parseInt(lastPrice.replaceAll(",","").replaceAll(" lei",""));
        return x>=y;
    }
    public boolean isPriceAscending(){
        String firstPrice = listOfProductPrices.get(0).getText();
        String lastPrice = listOfProductPrices.get(listOfProductPrices.size()-1).getText();
        int x = Integer.parseInt(firstPrice.replaceAll(",","").replaceAll(" lei",""));
        int y = Integer.parseInt(lastPrice.replaceAll(",","").replaceAll(" lei",""));
        return x<=y;
    }
}
