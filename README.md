# Wp-test-site - A Testing website to Test a Plugin for the Assignment through WpPool Company

[![](https://img.shields.io/badge/Java-1.8.0-brightgreen)]() [![](https://img.shields.io/badge/Maven-11-brightgreen)]()  [![](https://img.shields.io/badge/Cucumber-Latest-brightgreen)]() [![](https://img.shields.io/badge/IntelliJ%20IDEA-2021.2-brightgreen)]()

### Description

This is a  Plugin testing automation project based on Java. Apache Maven is used to build and run the
project and Cucumber-Gherkin is used for writing test scenarios and reporting. http://localhost:8888/wp-test-site/

### Setup Project

First of all, you need to clone the project from Github. Use the following command. Remember that I have set up this project in my localhost, so that this site can't be accessed by other sources. 

```command line
git clone https://github.com/hasibrahat10/wppoolautomationtest.git 
```

### Add More Features and Scenarios

- Go to project features package `src/test/java/features`
- Create a new file `Login.feature`
- Add a new scenario in the file
- Example

```gherkin
   Feature: Login Page

  @login
  Scenario: I want to Login
    Given I am on login screen and enter user pass
    Then I click on login button
    And I am landing on the admin dashboard screen
```

- Go to project step Definitions package `src/test/java/steps`
- Create a new file `LoginPageSteps.java`
- Add necessary feature steps in the file
- Example:

```java
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
```

- Write code inside the steps method

### Before Run

- Open `FileHelper.java` file from `src/test/java/FileHelper.java`
- Changed the credentials
- I have kept my credentials secret, if you want to set the credentials secret then please set your credentials as a system variable
- Example:

```java
       public class FileHelper extends TestSetupPage {
    public static final ResourceBundle bundle = ResourceBundle.getBundle("config");

    public static final String USERNAME = System.getenv("username");
    public static final String PASSWORD = System.getenv("password");

    public static final String USER_DIR = System.getProperty("user.dir");
    public static final String DRIVER_PATH = USER_DIR + "/drivers/";

}
```

- Open `TestRunner.java` file from `src/test/java/testRunner/TestRunner.java`
- Add the tests tag those tests will execute
- To run multiple tag same time use comma among the tags
- To skip a test tag use `~` before the tag as `~@test-1`
- Example:

 ```java
       @RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        tags = "@swtichcustomscale",
        glue = "steps",
//        dryRun = true,
        plugin = {"pretty", "html:test-output"}
)

public class TestRunner {
}
```

### Local run

- Go to testRunner package and open this `TestRunner.java` file
- Right-click on the file
- Select `Run 'TestRunner'` option
- Then click on it
- It will run all the tests that mention in the tags like we can set the tag as (`tags = {"@login, @contact-us, ~@login-failed"}`)

##### Maven run

- Apache Maven should install on your local machine
- Open terminal
- Go to root directory
- Run command `mvn clean install `
- Run a single test `mvn install -Dcucumber.options="--tags @test-1"`

### Reports and Logs

- Project reports are generated inside the directory `test-output/index.html`
- Cucumber html reports `test-output/index.html`
- Then Click `index.html` right shift on the mouse
- Open in a browser


