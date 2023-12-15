package automation.notion.core.ui.portals.trello.pages;

import automation.core.ui.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrelloMainHomePage extends BasePage {
    @FindBy(css = "ul[class = 'boards-page-board-section-list']")
    private WebElement workSapce;


    public String getPageTitleText(){
        return driver.getTitle();
    }

    public boolean workSpaceIsDisplayed() {
        return action.isElementDisplayed(workSapce);
    }
}
