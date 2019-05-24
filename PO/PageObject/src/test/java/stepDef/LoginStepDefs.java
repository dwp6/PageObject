package stepDef;

import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import pageobjects.LoginPage;
import utilities.Screenshot;
import utilities.WebDriverHandler;

import java.io.IOException;

import static utilities.UtilityMethods.getURL;


public class LoginStepDefs {

    String url;

//private static final BROWSER_NAME = 'mozilla';
private LoginPage loginPage;
    //public Screenshot screenshot;
   // private WebDriverHandler webDriverHandler;


  //  private void initActions() {
//        initWebDriver();
//        loginPage = new LoginPage(webDriverHandler);
//        screenshot = new Screenshot(webDriverHandler);
  //  }

//    private void initWebDriver() {
//        webDriverHandler = new WebDriverHandler();
//        webDriverHandler.openBrowser(UtilityMethods.getBrowser());
//        webDriverHandler.driver.get(url);
//        webDriverHandler.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        System.out.println(url);
//    }

    public LoginStepDefs(LoginPage loginPage) throws IOException {

        //initWebDriver();
//        loginPage = new LoginPage(webDriverHandler);
//        screenshot = new Screenshot(webDriverHandler);
        this.loginPage = loginPage;
        //this.webDriverHandler = webDriverHandler;
    }

//    @Before
//    public void tearUp() {
//        initActions();
//    }

    @Given("^that I am on the google home page$")
    public void thatIAmOnTheGoogleHomePage() throws IOException {
        url = getURL();
        loginPage.navigateToMainPage(url);
        loginPage.googleLogoCheck();
    }

    @When("^I enter BPDTS in the search engine$")
    public void iEnterBPDTSInTheSearchEngine() {
        loginPage.enterInSearchBox();
    }

    @Then("^results should show$")
    public void resultsShouldShow() {
        loginPage.checkBpdtsIsShowing();
    }

//    @After
//    public void tearDown(Scenario scenario) {
//        try {
//            Screenshot.screenShot(scenario);
//            webDriverHandler.closeDriver();
//        } catch (Exception e) {
//            System.out.println("Closing browser");
//        }
//    }
}
