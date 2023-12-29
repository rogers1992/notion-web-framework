package automation.core.ui.base;

import automation.core.ui.environment.EnvironmentManager;
import automation.core.ui.webdrives.WebDriverActions;
import automation.core.ui.webdrives.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected final WebDriver driver;
    protected final WebDriverWait wait;
    protected final EnvironmentManager environmentManager;
    protected final WebDriverActions action;

    //protected final WebDriverActions action;

    public BasePage() {
        environmentManager = EnvironmentManager.getInstance();
        WebDriverManager webDriverManager = WebDriverManager.getInstance();
        driver = webDriverManager.getWebDriver();
        wait = webDriverManager.getWebDriverWait();
        //action = new WebDriverActions(driver, wait);
        action = new WebDriverActions(driver, wait);
        PageFactory.initElements(driver, this);
    }
    public void closeBasePage(){
        driver.close();
    }
}
