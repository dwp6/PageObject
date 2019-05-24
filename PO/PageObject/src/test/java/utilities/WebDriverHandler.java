package utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.Objects;

public class WebDriverHandler {
    public WebDriver driver;
    public WebDriver chrome;
    public WebDriver mozilla;

    public boolean
            headlessMode = true;

    public void openBrowser() {
        String browserType = System.getProperty("browser");
        //return Objects.isNull(browser) ? "chrome" : browser;

        if ("mozilla".equals(browserType)) {
            if (mozilla == null) {
                System.setProperty("webdriver.gecko.driver", "src/test/resources/webDrivers/firefox/geckodriver");
                System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
                System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
                FirefoxOptions options = new FirefoxOptions();
                if (UtilityMethods.runHeadless()) {
                    options.setHeadless(true);
                }
                driver = new FirefoxDriver(options);
                driver.manage().window().maximize();
            }

        } else if ("chrome".equals(browserType)) {
            if (chrome == null) {
                System.setProperty("webdriver.chrome.driver", "src/test/resources/webDrivers/chrome/chromedriver");
                ChromeOptions options = new ChromeOptions();
                if (UtilityMethods.runHeadless()) {
                    options.setHeadless(true);
                    options.addArguments("no-sandbox");
                    options.addArguments("disable-dev-shm-usage");
                }
                driver = new ChromeDriver(options);
            }
        }
    }

    public void closeDriver() {
        driver.quit();
    }
}

