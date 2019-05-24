package utilities;

import cucumber.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

public class Screenshot {
    public static WebDriverHandler webDriverHandler;

    public Screenshot(WebDriverHandler webDriverHandler) {
        this.webDriverHandler = webDriverHandler;
    }

    public static void screenShot(Scenario scenario) {
        //Screenshot of the page where a bug is found or where the test fails
        try {
            if (scenario.isFailed()) {
                try {
                    System.out.println("Taking Picture");
                    byte[] screenshot = ((TakesScreenshot) webDriverHandler.driver).getScreenshotAs(OutputType.BYTES);
                    String testName = scenario.getName();
                    System.out.println("scenario name " + testName);
                    scenario.embed(screenshot, "image/png");
                    System.out.println("Storing it");
                    scenario.write(testName);
                } catch (WebDriverException wde) {
                    System.err.println(wde.getMessage());
                } catch (ClassCastException cce) {
                    cce.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
