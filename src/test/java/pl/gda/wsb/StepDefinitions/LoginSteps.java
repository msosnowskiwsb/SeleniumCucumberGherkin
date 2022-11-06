package pl.gda.wsb.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("Open login page")
    public void open_login_page(){
        System.out.println("Open login page");
    }

    @When("User enters username i password")
    public void user_entersUsernameIPassword() {
        System.out.println("Username and password");
    }

    @And("Click on login button")
    public void click_on_login_button(){
        System.out.println("click on login btn");
    }

    @Then("The validation message is displayed")
    public void the_validation_message_is_displayed(){
        System.out.println("is displayed");
    }
}
