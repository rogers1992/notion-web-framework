package automation.notion.core.ui.portals.trello.pages;

import automation.core.ui.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage {
    @FindBy(css ="span[class='css-178ag6o']")
    private WebElement logoutButton;

    public void confirmLogout(){
        action.click(logoutButton);
    }
}
