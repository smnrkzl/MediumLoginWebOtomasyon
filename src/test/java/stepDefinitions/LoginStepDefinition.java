package stepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class LoginStepDefinition {

        WebDriver driver = DriverFactory.getDriver();
        LoginPage loginPage = new LoginPage(driver);

        @Given("^User at login page$")
        public void userAtLoginPage() {
                 loginPage.userAtRegisterPage();
        }
        @When("^Enter a valid \"([^\"]*)\" email field$")
        public void enterEmailField(String mail) {
                loginPage.enterEmailField(mail);
        }
        @When("^Enter a valid \"([^\"]*)\" password field$")
        public void enterAPassword(String password) {
               loginPage.enterPasswordField(password);
        }
        @Then("^Click on the sign up$")
        public void clickOnTheaSignUpButton() {
                 loginPage.clickOnTheSignUp();
        }

}


