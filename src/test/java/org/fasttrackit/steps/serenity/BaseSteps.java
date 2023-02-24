package org.fasttrackit.steps.serenity;

import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAccountPage;

public class BaseSteps extends ScenarioSteps {
    protected HomePage homePage;
    protected AccountPage accountPage;
    protected MyAccountPage myAccountPage;
}
