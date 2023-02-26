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
}
