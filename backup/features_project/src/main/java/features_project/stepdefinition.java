package features_project;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition {
		
	@When("^Larry increases the headphone quantity by 2$")
	public void larry_increases_the_headphone_quantity_by() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Output is passed");
	}

	@When("^continue for checkout$")
	public void continue_for_checkout() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Output is passed");
	}

	@When("^change the shipping address to a new address as Pune$")
	public void change_the_shipping_address_to_a_new_address_as() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Output is passed");
	}

	@Then("^the product should be delivered to the new address$")
	public void the_product_should_be_delivered_to_the_new_address() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Output is passed");
}
	
}