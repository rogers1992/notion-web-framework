package automation.notion.core.ui.portals.trello.pages.board;

import automation.core.ui.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoardPage extends BasePage {
    @FindBy(css = "h1[class='HKTtBLwDyErB_o']")
    private WebElement  boardTitle;
    @FindBy(css = "span[class='nch-icon A3PtEe1rGIm_yL J2CpPoHYfZ2U6i fAvkXZrzkeHLoc']")
    private WebElement menuBoard;
    public String getBoardTitle(){
        return  action.getText(boardTitle);
    }

    public void clickOnShowMenuBoardButton() {
        action.click(menuBoard);
    }
}
