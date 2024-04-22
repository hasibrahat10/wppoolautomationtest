package pages;

import helper.FileHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.TestSetupPage;

public class LoginPage extends TestSetupPage {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='user_login']")
    WebElement userName;

    @FindBy(xpath = "//*[@id='user_pass']")
    WebElement password;

    @FindBy(xpath = "//*[@id='wp-submit']")
    WebElement submitLogin;
    @FindBy(xpath = "//h1[contains(text(), 'Dashboard')]")
    WebElement dashboardText;


    public void userInfo() {
        userName.click();
        userName.sendKeys(FileHelper.USERNAME);
        System.out.println(FileHelper.USERNAME);
        password.click();
        password.sendKeys(FileHelper.PASSWORD);
    }

    public void clickLogin() {
        sleep(4);
        submitLogin.click();
    }

    public String setTextDisplayed() {
        return dashboardText.getText();
    }

}
