package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.Utils.Constants;
import org.fasttrackit.steps.serenity.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    protected LoginSteps loginSteps;
    @Steps
    protected MyAccountSteps myAccountSteps;
    @Steps
    protected RegisterSteps registerSteps;
    @Steps
    protected SearchSteps searchSteps;
    @Steps
    protected AddToCartSteps addToCartSteps;
    @Steps
    protected CheckoutSteps checkoutSteps;
    @Steps
    protected ProductSteps productSteps;
    @Steps AdminSteps adminSteps;

    @Before
    public void initTests(){
        driver.manage().window().maximize();
        driver.get(Constants.BASE_URL);
        Actions action = new Actions(driver);
    }
}
