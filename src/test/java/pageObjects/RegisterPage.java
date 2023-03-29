package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

    public RegisterPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//*[@id='email1']")
    WebElement txtEmail;

    @FindBy(xpath = "//*[@id='confirmEmail']")
    WebElement txtConfirmEmail;

    @FindBy(xpath = "//*[@id='password1']")
    WebElement txtPassword;

    @FindBy(xpath = "//*[@id='registerBtn']")
    WebElement btnRegister;

    //@FindBy(css = "div[role='alert'] span b='We have sent a verification email to '")
    //@FindBy(xpath = "//div[@role='alert']//span[1]")
    @FindBy(xpath = "//div[@role='alert']")
    WebElement msgVerification;

   // @FindBy(xpath = "//b[normalize-space()='rrr@ww.jj.']")
   // WebElement emailAfterVerification;

    public void setTxtEmail(String Email) {
        txtEmail.clear();
        txtEmail.sendKeys(Email);
        txtConfirmEmail.clear();
        txtConfirmEmail.sendKeys(Email);
    }

    public void setTxtPassword(String Pwd) {
        txtPassword.clear();
        txtPassword.sendKeys(Pwd);
    }

    public void clickCreateAccount() {
        btnRegister.click();
    }

    public String getVerificationMsg() {
        try {
            return (msgVerification.getText());
        } catch (Exception e) {
            return (e.getMessage());
        }
    }

    //public void setEmailAfterVerification(String Email) {
       // emailAfterVerification.sendKeys(Email);
   // }
}
