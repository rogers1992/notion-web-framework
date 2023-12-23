package automation.core.ui.webdrives;

import automation.core.ui.browsers.FireFox;
import io.github.bonigarcia.wdm.WebDriverManager;
import automation.core.ui.browsers.Browser;
import automation.core.ui.browsers.Chrome;

import java.util.EnumMap;

/**
 * Creates the instance of a Web Driver.
 */
public final class WebDriverFactory {
    /**
     * Initializes an instance of {@link WebDriverFactory} utility class.
     */
    private WebDriverFactory() {
    }

    /**
     * Gets a Web Driver instances based in a Driver Type parameter.
     *
     * @param type Driver Type enum value.
     * @return Web Driver instance.
     */
    public static WebDriverManager getWebDriverManager(final WebDriverTypes type) {
        Browser<WebDriverManager> browser = getStrategyBrowser().get(type).performStep();
        return browser.getDriver();
    }

    /**
     * Gets strategy browser map.
     *
     * @return browser map.
     */
    private static EnumMap<WebDriverTypes, StrategyGetter<Browser<WebDriverManager>>> getStrategyBrowser() {
        EnumMap<WebDriverTypes, StrategyGetter<Browser<WebDriverManager>>> driverMap = new EnumMap<>(WebDriverTypes.class);
        driverMap.put(WebDriverTypes.CHROME, Chrome::new);
        driverMap.put(WebDriverTypes.FIREFOX, FireFox::new);
        return driverMap;
    }
}