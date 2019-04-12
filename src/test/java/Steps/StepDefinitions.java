package Steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinitions {

    @When("^User tries to login$")
    public void userTriesToLogin() throws Throwable {
        System.out.println("Number 2");
    }

    @Given("^Ahmed PLaying football$")
    public void ahmedPLayingFootball() throws Throwable {
        System.out.println("Number 1");
    }
}

