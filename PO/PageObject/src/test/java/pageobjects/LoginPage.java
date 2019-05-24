package pageobjects;

import org.openqa.selenium.By;
import utilities.UtilityMethods;
import utilities.WebDriverHandler;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginPage extends UtilityMethods {
    public WebDriverHandler webDriverHandler;

    public LoginPage(WebDriverHandler webDriverHandler) {
        super(webDriverHandler);
    }

    //Elements
    public static By GOOGLE_LOGO = By.xpath("//img[@id='hplogo']");
    public static By GOOGLE_TEXT_BOX = By.xpath("//input[@name='q']");
    public static By BPDTS_DETAILS = By.xpath("//div[@class='kno-ecr-pt kno-fb-ctx gsmt']//span[contains(text(),'BPDTS Ltd.')]");

    public void navigateToMainPage(String url){
        navigateToURL(url);
    }

    public void googleLogoCheck() {
        assertThat(webDriverHandler.driver.findElement(GOOGLE_LOGO).isDisplayed());
    }

    public void enterInSearchBox() {
        webDriverHandler.driver.findElement(GOOGLE_TEXT_BOX).sendKeys("BPDTS");
    }

    public void checkBpdtsIsShowing() {
        assertThat(webDriverHandler.driver.findElement(BPDTS_DETAILS).isDisplayed());
    }



}
