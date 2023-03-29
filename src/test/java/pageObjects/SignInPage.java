package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{
    public SignInPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//*[@id='username']")
    WebElement txtUserName;

    @FindBy(xpath = "//*[@id='password']")
    WebElement txtPassword;

    @FindBy(xpath = "//*[@id='signInBtn']")
    WebElement btnSignIn;

    public void setTxtUserName(String userName) {
        txtUserName.clear();
        txtUserName.sendKeys(userName);
    }

    public void setTxtPassword(String password) {
        txtPassword.clear();
        txtPassword.sendKeys(password);
    }

    public void clickSignIn() {
        btnSignIn.click();
    }

}
