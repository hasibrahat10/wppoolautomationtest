package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.LoginPage;

public class DashboardPageSteps extends TestSetupPage {
    @Then("I click on plugins menu from the settings and navigate to the plugin details screen")
    public void i_click_on_plugins_menu_from_the_settings_and_navigate_to_the_plugin_details_screen() {
        LoginPage loginPage = new LoginPage();
        loginPage.userInfo();
        loginPage.clickLogin();
        new DashboardPage().clickPluginMenu();
    }

    @When("I am on plugin screen search the wp dark mode plugin")
    public void i_am_on_plugin_screen_search_the_wp_dark_mode_plugin() {
        new DashboardPage().searchWithText();
    }

    @Then("I check the plugin is exist for the site with validate a text")
    public void i_check_the_plugin_is_exist_for_the_site_with_validate_a_text() {
        new DashboardPage().setTextDisplayed();
    }


    @When("I am on the settings screen click on customization menu")
    public void i_am_on_the_settings_screen_click_on_customization_menu() {
        LoginPage loginPage = new LoginPage();
        loginPage.userInfo();
        loginPage.clickLogin();
        new DashboardPage().clickCustomMenu();
    }

    @Then("I found switch settings option click on it and select menu switch options")
    public void i_found_switch_settings_option_click_on_it_and_select_menu_switch_options() {
        new DashboardPage().clickSwitchMenu();
    }

    @When("I am  on the swtich settings screen and scroll down to swtich customization")
    public void i_am_on_the_swtich_settings_screen_and_scroll_down_to_swtich_customization() {
        LoginPage loginPage = new LoginPage();
        loginPage.userInfo();
        loginPage.clickLogin();
        new DashboardPage().customButton();
    }

    @Then("I click on custom button and enter the scale size")
    public void iClickOnCustomButtonAndEnterTheScaleSize() {
        new DashboardPage().setCustomScale();
    }

    @Then("I click save changes button")
    public void i_click_save_changes_button() {
        new DashboardPage().setButtonSaveChanges();
    }


}
