package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.TestSetupPage;

public class DashboardPage extends TestSetupPage {
    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='wp-menu-name wp-dark-mode-ignore' and contains(text(), 'Plugins')]")
    WebElement pluginsMenu;

    @FindBy(xpath = "//input[@id='plugin-search-input']")
    WebElement searchInput;

    @FindBy(xpath = "//*[contains(text(),'WP Dark Mode automatically enables')]")
    WebElement wpDarkModeText;

//    @FindBy(xpath = "//*[@id=\"deactivate-wp-dark-mode\"]")
//    WebElement wpDarkModeActivated;

    @FindBy(xpath = "//div[contains(text(), 'WP Dark Mode')]")
    WebElement wpDarkText;

    @FindBy(xpath = "//h4[contains(text(), 'Customization')]")
    WebElement customMenu;
    @FindBy(xpath = "//a[contains(text(), 'Switch Settings')]")
    WebElement switchMenu;

    @FindBy(xpath = "//*[@id=\"wp-dark-mode-admin\"]/div/div/div/div[2]/div[3]/div/section/div[1]/div[2]")
    WebElement menuSwitch;

    @FindBy(xpath = "(//span[contains(text(), 'Custom')])[1]")
    WebElement customButton;

    @FindBy(xpath = "//input[@type='number']")
    WebElement inputNumber;

    @FindBy(xpath = "//*[@id=\"wp-dark-mode-admin\"]/div/div/div/div[2]/div[4]/button[2]")
    WebElement buttonSaveChanges;


    public void clickPluginMenu() {
        waitForDisplayed(pluginsMenu);
        pluginsMenu.click();
    }

    public void searchWithText() {
        waitForDisplayed(searchInput);
        searchInput.sendKeys("WP Dark Mode");
        sleep(5);
    }


    public String setTextDisplayed() {
        return wpDarkModeText.getText();
    }

    public void clickCustomMenu() {
        wpDarkText.click();
        waitForDisplayed(customMenu);
        customMenu.click();
    }

    public void clickSwitchMenu() {
        waitForDisplayed(switchMenu);
        switchMenu.click();
        menuSwitch.click();
        sleep(5);
    }

    public void customButton() {
        wpDarkText.click();
        waitForDisplayed(customMenu);
        customMenu.click();
        waitForDisplayed(switchMenu);
        switchMenu.click();
        scrollToElement(customButton);
    }

    public void setCustomScale() {
        waitForDisplayed(customButton);
        customButton.click();
        sleep(2);
        inputNumber.click();
        inputNumber.clear();
        inputNumber.sendKeys("220");
    }

    public void setButtonSaveChanges() {
        waitForDisplayed(buttonSaveChanges);
        buttonSaveChanges.click();
        sleep(5);
    }

}
