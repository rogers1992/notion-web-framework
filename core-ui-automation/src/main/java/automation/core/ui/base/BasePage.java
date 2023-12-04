package automation.core.ui.base;

import automation.core.ui.environment.EnvironmentManager;
import automation.core.ui.webdrives.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected final WebDriver webDriver;
    protected final WebDriverWait webDriverWait;
    protected final EnvironmentManager environmentManager;

    //protected final WebDriverActions action;

    public BasePage() {
        environmentManager = EnvironmentManager.getInstance();
        WebDriverManager webDriverManager = WebDriverManager.getInstance();
        webDriver = webDriverManager.getWebDriver();
        webDriverWait = webDriverManager.getWebDriverWait();
        //action = new WebDriverActions(driver, wait);
        PageFactory.initElements(webDriver, this);
    }
}
