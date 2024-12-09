package automation.notion.core.ui.portals.trello.pages.board;

import automation.core.ui.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoardMenuPage extends BasePage {
    @FindBy(css = "button[class='TJ69T0gm8D5GkA bxgKMAm3lq5BpA SEj5vUdI3VvxDc'] > span [data-testid='RemoveIcon']")
    private WebElement closeBoard;
    @FindBy(css = "button[class='bxgKMAm3lq5BpA KpU415sFFvOzGZ PnEv2xIWy3eSui SEj5vUdI3VvxDc'] ")
    private WebElement closeBoardButton;

    public void clickOnCloseBoardButton(){
        action.click(closeBoard);
    }
    public void clickOnCloseButton(){
        action.click(closeBoardButton);
    }
}
