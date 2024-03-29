package automation.core.ui.webdrives;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WebDriverActions {
    private final WebDriver driver;
    private final WebDriverWait wait;
    private static final Logger LOGGER = LogManager.getLogger(WebDriverActions.class.getSimpleName());

    public WebDriverActions(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
        LOGGER.info("WebDriverActions initiated");
    }
    public void click(final WebElement webElement){
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }
    public void click(final By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public String getText(final WebElement webElement){
        wait.until(ExpectedConditions.visibilityOf(webElement));
        return webElement.getText();
    }
    public String getText(final By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }
    public void setValue(final WebElement webElement, String value){
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(value);
    }
    public boolean isElementDisplayed(WebElement webElement){
        wait.until(ExpectedConditions.visibilityOf(webElement));
        return webElement.isDisplayed();
    }
}
