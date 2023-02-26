package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;

import java.lang.annotation.Target;

public class AdminPage extends PageObject {
    @FindBy (css = "#menu-comments > a > div.wp-menu-name")
    private WebElementFacade commentsButton;
    @FindBy (id = "comment-search-input")
    private WebElementFacade commentsSearchField;
    @FindBy (id = "search-submit")
    private WebElementFacade commentsSearchButton;
    @FindBy (css = "#comment-619 > td.comment.column-comment.has-row-actions.column-primary > div.row-actions > span.approve > a")
    private WebElementFacade approveButton;
    @FindBy (css = "#comment-620 > td.author.column-author > strong")
    private WebElementFacade authorName;
    public void clickCommentsButton(){
        clickOn(commentsButton);
    }
    public void typeCommentsSearch(String comment){
        typeInto(commentsSearchField,comment);
    }
    public void clickSearchComments(){
        clickOn(commentsSearchButton);
    }
    public void clickApproveButton(){
        Actions actions = new Actions(getDriver());
        actions.moveToElement(authorName).perform();
        waitFor(approveButton);
        clickOn(approveButton);
    }
}
