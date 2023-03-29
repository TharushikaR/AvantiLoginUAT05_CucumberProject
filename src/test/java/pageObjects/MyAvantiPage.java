package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class MyAvantiPage extends BasePage{

    public MyAvantiPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='header_home']/img[1]") // MyAccount Page heading Image
    WebElement msgHeading;

    @FindBy(xpath = "//span[normalize-space()='Log out']")
    WebElement lnkLogout;

    public boolean isMyAvantiPageExists()   // MyAccount Page heading display status
    {
        try {
            return (msgHeading.isDisplayed());
        } catch (Exception e) {
            return (false);
        }
    }

    public void clickLogout() {
        lnkLogout.click();
    }
}
