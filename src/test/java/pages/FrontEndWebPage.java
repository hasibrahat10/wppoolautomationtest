package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.TestSetupPage;

public class FrontEndWebPage extends TestSetupPage {
    public FrontEndWebPage (){
        PageFactory.initElements(driver, this);
    }
 @FindBy(xpath = "/html/body/div[2]")
    WebElement darkIcon;
    public void setDarkIcon(){
        waitForDisplayed(darkIcon);
        darkIcon.click();
    }
}
