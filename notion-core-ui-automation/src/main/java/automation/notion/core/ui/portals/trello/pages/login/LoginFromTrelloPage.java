package automation.notion.core.ui.portals.trello.pages.login;

import automation.core.ui.base.BasePage;
import automation.notion.core.ui.portals.trello.pages.TrelloHomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginFromTrelloPage extends BasePage {

    @FindBy (id = "username")
    private WebElement userNameTxt;
    @FindBy (id = "login-submit")
    private WebElement loginBtn;
    @FindBy (id = "password")
    private WebElement passwordText;
    public void loginUserFromTrello(){
        TrelloHomePage trelloHomePage = TrelloHomePage.getInstance();
        trelloHomePage.goToLogin();

        action.setValue(userNameTxt, environmentManager.getUsername());
        action.click(loginBtn);
        action.setValue(passwordText, environmentManager.getPassword());
        action.click(loginBtn);





    }

}
