package automation.notion.core.ui.portals.trello.pages.startAtlassian;

import automation.core.ui.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartAtlassianPage extends BasePage {
    @FindBy(css = "div[class='sc-kqEXUp eJOfJL']")
    private WebElement swithToLabel;
    public boolean isSwitchToLabelDisplayed(){
        return action.isElementDisplayed(swithToLabel);
    }
}
