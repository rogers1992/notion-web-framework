package automation.notion.core.ui.portals.trello.pages.startAtlassian;

import automation.core.ui.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartAtlassianPage extends BasePage {
    @FindBy(css = "div[class='sc-kAzzGY bxrpKa']")
    private WebElement swithToLabel;
    @FindBy(css = "div[class='sc-bbkauy gkisIK']")
    private WebElement startProductTrelloBtn;
    public boolean isSwitchToLabelDisplayed(){
        return action.isElementDisplayed(swithToLabel);
    }

    public void clickOnStartProductTrelloButton() {
        action.click(startProductTrelloBtn);
    }
}
