package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;

public class LoginPageSteps extends TestSetupPage {
    @Given("I am on login screen and enter user pass")
    public void i_am_on_login_screen_and_enter_user_pass() {
        LoginPage loginPage = new LoginPage();
        loginPage.userInfo();
    }

    @Then("I click on login button")
    public void i_click_on_login_button() {
        new LoginPage().clickLogin();
    }

    @Then("I am landing on the admin dashboard screen")
    public void i_am_landing_on_the_admin_dashboard_screen() {
        new LoginPage().setTextDisplayed();
    }
}
