package automation.notion.ui.hooks;

import automation.notion.core.ui.portals.trello.pages.LogoutPage;
import automation.notion.core.ui.portals.trello.pages.accountMenu.AccountMenu;
import io.cucumber.java.After;

public class LogoutHooks {
    @After(order = 499, value = "@logout")
    public void logout(){
        AccountMenu accountMenu = new AccountMenu();
        accountMenu.openAccountMenu();
        accountMenu.logout();
        LogoutPage logoutPage = new LogoutPage();
        logoutPage.confirmLogout();

    }
}
