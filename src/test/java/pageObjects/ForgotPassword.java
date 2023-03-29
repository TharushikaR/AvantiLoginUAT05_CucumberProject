package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class ForgotPassword extends BasePage{

    public ForgotPassword(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//*[@id='login']")
    WebElement txtLoginEmail;

    @FindBy(xpath = "//*[@id='forgotPasswordStep1SubmitBtn']")
    WebElement btnResetPwd;

    @FindBy(xpath = "//div[@class='card-header']")
    WebElement msgReset;

    public void setTxtLoginEmail(String loginEmail) {
        txtLoginEmail.clear();
        txtLoginEmail.sendKeys(loginEmail);
    }

    public void clickResetPwd() {
        btnResetPwd.click();
    }

    public String getResetMsg() {
        try {
            return (msgReset.getText());
        } catch (Exception e) {
            return (e.getMessage());
        }
    }
}
