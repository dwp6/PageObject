package utilities;


import java.io.IOException;
import java.util.Objects;

public class UtilityMethods {
    public WebDriverHandler webDriverHandler;

    public UtilityMethods(WebDriverHandler webDriverHandler) {
        this.webDriverHandler = webDriverHandler;
    }

    public static String getURL() throws IOException {
        String env = System.getProperty("environment");
        PropertyReader property = new PropertyReader();
        String url = property.getProperty(env);
        System.out.println(url);
        return url;
    }

    public void navigateToURL(String url){
        webDriverHandler.driver.get(url);
    }

    public static boolean runHeadless() {
        String headless = System.getProperty("headless");
        return Objects.isNull(headless) ? true : Boolean.valueOf(headless);
    }


}

