import org.junit.Before;
import utilities.WebDriverHandler;

public class Hooks {
    private final WebDriverHandler webDriverHandler;

    public Hooks(WebDriverHandler webDriverHandler) {
        this.webDriverHandler = webDriverHandler;
    }

    @Before
    public void openBrowser(){
        webDriverHandler.openBrowser();
    }
}
