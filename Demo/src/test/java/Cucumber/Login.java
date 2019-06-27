package Cucumber;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	@Given("User enter the name{int}")
	public void user_enter_the_name(Integer int1) {
		System.out.println("passed");
	}

	@When("User enter the password")
	public void user_enter_the_password() {
		System.out.println("pass");
		    }
	
	@When("I enter my data")
	public void i_enter_my_data(io.cucumber.datatable.DataTable dataTable) {
		
		 List<Map<String, Integer>> list = dataTable.asMaps(String.class, Integer.class);
		    for(int i=0;i<list.size();i++)
		    {
		    	System.out.println(list.get(i).get("User_Name"));
		    	System.out.println(list.get(i).get("Password"));
		    	System.out.println(list.get(i).get("status"));
	}}

	@Then("Verify the account")
	public void verify_the_account() {
		System.out.println("passed");
	}

	@Given("User enter the username")
	public void user_enter_the_username() {
		System.out.println("Username passed");
   }

	@When("User enter password")
	public void user_enter_password() {
		System.out.println("Password passed");
	}
	
	@Given("User enter the username {string}")
	public void user_enter_the_username(String string) {
		System.out.println(string);
	}
	    

	@When("User enter password {string}")
	public void user_enter_password(String string) {
		System.out.println(string);  
	}

	@And("click on login")
	public void click_on_login() {
		System.out.println("click login passed");  
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		System.out.println("Home page");  
	}
	
	@Given("User enter old password {string}")
	public void user_enter_old_password(String string) {
		System.out.println(string);  
	}

	@When("User enter new password {string}")
	public void user_enter_new_password(String string) {
		System.out.println(string);   
	}

	@And("User confirm the new password {string}")
	public void user_confirm_the_new_password(String string) {
		System.out.println(string);
	}

	@Then("Password changed")
	public void password_changed() {
		System.out.println("Password changed");
	}  

	@Given("User click on logout button")
	public void user_click_on_logout_button() {
		System.out.println("Click on logout");
	}

	@And("Click again on dialog box displayed")
	public void click_again_on_dialog_box_displayed() {
		System.out.println("Click again to logout");   
	}

	@Then("Home Page will be displayed")
	public void home_Page_will_be_displayed() {
		System.out.println("Redirected to home page through logout");
	}
   
	@Given("Enter user name {string}")
	public void enter_user_name(String string) {
		System.out.println(string);
	}

	@When("Enter user password {string}")
	public void enter_user_password(String string) {
		System.out.println(string);
	}

	@Then("Page will be displayed")
	public void page_will_be_displayed() {
		System.out.println("Page is displayed");
	}

    
}
