package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepDefinitions{
	
@Before //Executes before every scenario
public void setup() {
	System.out.println("==========");
	System.out.println("Launch Chrome Browser");
	System.out.println("Enter URL of App");
}

@After
public void tearDown() {
	System.out.println("Closed Browser");
	System.out.println("==========");

}

@Given("^User is on add customer page$")
public void user_is_on_add_customer_page() throws Throwable {
	System.out.println("User is on Add Customer Page");
}

@When("^User fills in the customer details$")
public void user_fills_in_the_customer_details() throws Throwable {
	System.out.println("User fills Customer details");
}

@Then("^Customer is added$")
public void customer_is_added() throws Throwable {
	System.out.println("Customer is added");
}

@Given("^User is on Edit Customer page$")
public void user_is_on_Edit_Customer_page() throws Throwable {
	System.out.println("Customer is on Edit CX Page");
}

@When("^User edits contact details$")
public void user_edits_contact_details() throws Throwable {
	System.out.println("Customer is on Edit Contact details Page");

}

@Then("^Contact details updated$")
public void contact_details_updated() throws Throwable {
	System.out.println("Customer is on Contact Details updated");

}

@Given("^User is on delete customer page$")
public void user_is_on_delete_customer_page() throws Throwable {
	System.out.println("Customer is on Delete CX Page");

}

@When("^User delete the customer$")
public void user_delete_the_customer() throws Throwable {
	System.out.println("Customer is on delete CX page");

}

@Then("^Customer is deleted$")
public void customer_is_deleted() throws Throwable {
	System.out.println("Customer is Deleted");

}

}