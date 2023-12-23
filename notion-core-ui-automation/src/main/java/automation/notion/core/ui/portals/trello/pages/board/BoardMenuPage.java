package automation.notion.core.ui.portals.trello.pages.board;

import automation.core.ui.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoardMenuPage extends BasePage {
    @FindBy(css = "a[class='board-menu-navigation-item-link board-menu-navigation-item-link-v2 js-close-board']")
    private WebElement closeBoard;
    @FindBy(css = "input[class='js-confirm full nch-button nch-button--danger']")
    private WebElement closeBoardButton;

    public void clickOnCloseBoardButton(){
        action.click(closeBoard);
    }
    public void clickOnCloseButton(){
        action.click(closeBoardButton);
    }
}
