package automation.notion.core.ui.portals.trello.pages.accountMenu;

import automation.core.ui.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountMenu extends BasePage {
    @FindBy(css = "button[data-testid='account-menu-logout']")
    private WebElement logoutButton;
    @FindBy(css = "button[data-testid='header-member-menu-button']")
    private WebElement accountMenu;
    public void logout(){
        action.click(logoutButton);
    }
    public void openAccountMenu(){
        action.click(accountMenu);
    }
}
