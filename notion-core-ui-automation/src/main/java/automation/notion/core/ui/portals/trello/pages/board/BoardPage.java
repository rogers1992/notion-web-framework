package automation.notion.core.ui.portals.trello.pages.board;

import automation.core.ui.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoardPage extends BasePage {
    @FindBy(css = "h1[class='HKTtBLwDyErB_o']")
    private WebElement  boardTitle;
    public String getBoardTitle(){
        return action.getText(boardTitle);
    }
}
