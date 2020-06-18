package stepDefinitions;



import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
public class StepDefinition {

    @Given("^User is on Netbanking page$")
    public void user_is_on_netbanking_page() {
    	System.out.println("Netbanking Page");
       System.out.println("This is clone project");
   	System.out.println("This is Original Projects changes done");
    }
    
    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) {
    	System.out.println("Login Success");
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    	System.out.println("This is clone project");
    	System.out.println("This is Original Projects changes done");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() {
     System.out.println("Home Page");
     System.out.println("This is clone project");
 	System.out.println("This is Original Projects changes done");
    }
    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) {
    	System.out.println("Cards Display");
    	System.out.println(strArg1);
    	System.out.println("This is clone project");
    	System.out.println("This is Original Projects changes done");
    }

}
