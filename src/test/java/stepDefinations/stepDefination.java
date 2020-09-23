package stepDefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class stepDefination {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        
    	System.out.println("landing page url");
    }
    
    @Given("validate the browser")
    public void validate_the_browser() {
    	System.out.println("validate_the_browser");
    }
    
    @When("Browser is triggered")
    public void browser_is_triggered() {
    	System.out.println("browser_is_triggered");
    }    
    
    @Then("check browser is started")
    public void check_browser_is_started() {
    	System.out.println("check browser is started");
    }
       
    @When("User login into application with {string} and {string}")
    public void user_login_into_application_with_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
       
    }
   
    
    @When("User sign up with following details")
    public void user_sign_up_with_following_details(DataTable dataTable) throws Throwable {
    	
    	List<List<String>> obj = dataTable.asLists();
    	
    	System.out.println(obj.get(0).get(0));
    	System.out.println(obj.get(0).get(1));
    	System.out.println(obj.get(0).get(2));
    	System.out.println(obj.get(0).get(3));
    	System.out.println(obj.get(0).get(4));
    	   	
    }
    
    @When("User login into application with User1 and Pass@{int}")
    public void user_login_into_application_with_user1_and_pass(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
       
    }
    
    @When("User login into application with User2 and Pass@{int}")
    public void user_login_into_application_with_user2_and_pass(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        
    }
    
   
    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	
    	System.out.println("Home page  url");
    }
        
    @And("^Cards are displayed are \"([^\"]*)\"$")
    public void cards_are_displayed_are_something(String strArg1) throws Throwable {
       System.out.println(strArg1);
    }

}