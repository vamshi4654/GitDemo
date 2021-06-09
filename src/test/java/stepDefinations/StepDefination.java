package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {

	@Given("Add Payload")
	public void add_payload() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("vamshi");
	}
	@When("user calls AddPlaceAPI with post http request")
	public void user_calls_add_place_api_with_post_http_request() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("vamshi");
	}
	@Then("the API call got success with status code")
	public void the_api_call_got_success_with_status_code() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("vamshi");
	}
	@Then("{string} in response body is {string}")
	public void in_response_body_is(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("vamshi");
	}
}
