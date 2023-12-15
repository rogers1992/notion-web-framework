package automation.notion.core.ui.portals.trello.pages;

import automation.core.ui.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;

public class TrelloHomePage extends BasePage {
    private static TrelloHomePage instance;
    @FindBy(css = "a[data-uuid='MJFtCCgVhXrVl7v9HA7EH_login']")
    private WebElement loginBtn;

    private TrelloHomePage(){

    }
    public static TrelloHomePage getInstance(){
        if((Objects.isNull(instance))){
            instance = new TrelloHomePage();
        }
        return instance;
    }
    public void goToLogin(){
        driver.navigate().to(environmentManager.getBaseUrl());
        action.click(loginBtn);
    }

}
