package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends TestSetupPage {
    @Before
    public void setUpDriver() {
        startDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        takeScreenshot(scenario);
        stopDriver();
    }
}
