package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver){
        super(driver);
    }
    //Elements
    //@FindBy(xpath = "//*[@id='signInBtn']")
    //WebElement linkSignIn;

    @FindBy(xpath = "//form[1]/button[1]")
    WebElement linkCreateAccount;

    @FindBy(xpath = "//a[@href=\"/myavanti/forgot-password\"]")
    WebElement linkForgotPassword;

    //Action methods
   // public void clickSignIn(){
        //linkSignIn.click();
   // }

    public void clickRegister(){
        linkCreateAccount.click();
    }

    public void clickForgotPassword(){
        linkForgotPassword.click();
    }
}
