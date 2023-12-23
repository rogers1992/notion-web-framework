package automation.notion.core.ui.portals.trello.pages.board;

import automation.core.ui.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CloseBoardPage extends BasePage {
    @FindBy(css = "button[class='Bp80TGmc9hQIdE bxgKMAm3lq5BpA V_9lMAQOdk_AYt SEj5vUdI3VvxDc'] ")
    private WebElement deleteBoardLink;
    @FindBy (css = "button[class='a72r81xglmtLCW bxgKMAm3lq5BpA KpU415sFFvOzGZ PnEv2xIWy3eSui SEj5vUdI3VvxDc']")
    private WebElement deleteButton;
    public void clickOnPermanentlyDeleteBoardLink(){
        action.click(deleteBoardLink);
    }

    public void clickOnDeleteButton() {
        action.click(deleteButton);
    }
}
