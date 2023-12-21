package automation.core.ui.browsers;

import automation.core.ui.config.UiConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.Objects;

public class FireFox implements Browser<WebDriverManager> {
    protected static final String WEBDRIVER_VERSION = UiConfig.getInstance().getFirefoxDriverVersion();

    /**
     * Initializes an instance of {@link FireFox}.
     */
    public FireFox(){ super(); }
    /**
     * {@inheritDoc}
     */
    @Override
    public WebDriverManager getDriver(){
        WebDriverManager webDriverManager;
        if(Objects.nonNull(WEBDRIVER_VERSION) && !WEBDRIVER_VERSION.isEmpty()){
            webDriverManager = WebDriverManager.firefoxdriver()
                    .driverVersion(WEBDRIVER_VERSION)
                    .capabilities(getOptions());
        }
        else {
            webDriverManager = WebDriverManager.firefoxdriver().capabilities(getOptions());
        }
        webDriverManager.create();
        return webDriverManager;
    }
    private FirefoxOptions getOptions(){
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        if(UiConfig.getInstance().isHeadlessMode()){
            firefoxOptions.addArguments("--headless=new");
        }
        return firefoxOptions;
    }
}
