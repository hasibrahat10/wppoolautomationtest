package steps;

import io.cucumber.java.en.*;
import pages.FrontEndWebPage;

public class FrontEndWebPageSteps extends TestSetupPage {
    @Then("I am going to website")
    public void i_am_going_to_website() {

    }
    @Then("I found dark mode icon bottom right corner and click on the icon")
    public void i_found_dark_mode_icon_bottom_right_corner_and_click_on_the_icon() {
      new FrontEndWebPage().setDarkIcon();
    }
}
