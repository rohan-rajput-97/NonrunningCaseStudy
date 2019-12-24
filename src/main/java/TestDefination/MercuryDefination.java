package TestDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MercuryDefination {

	@Given("Mercury website is launched")
	public void mercury_website_is_launched() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("Site launched");
	}

	@Given("user clicks on signup up button")
	public void user_clicks_on_signup_up_button() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("Clicked on signup");
	}

	@When("user enters proper data")
	public void user_enters_proper_data() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("Enters Data");
	}

	@Then("clicks on submit button for")
	public void clicks_on_submit_button_for() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("Clicked on submit button");
	}

	@Given("registered user clicks on signin link")
	public void registered_user_clicks_on_signin_link() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("Clicked on signin link");
	}

	@Then("he provides valid data for login input fields")
	public void he_provides_valid_data_for_login_input_fields() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("Provides valid data");
	}

	@Then("clicks on submit button for the login validation")
	public void clicks_on_submit_button_for_the_login_validation() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("Clicks on submit button");
	}

	@Given("user verifies the flights avaialable")
	public void user_verifies_the_flights_avaialable() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("Verifies availabilty");
	}

	@Then("selects the desired flight")
	public void selects_the_desired_flight() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("Selects flight");
	}

	@When("user makes the payments")
	public void user_makes_the_payments() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();System.out.println("Site launched");
		System.out.println("Makes payment");
	}

	@Then("Tickets are generated")
	public void tickets_are_generated() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("Tickets generated");
	}



}
