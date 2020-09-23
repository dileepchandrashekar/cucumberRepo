package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith( Cucumber.class )
@CucumberOptions (
		
		features ="src\\test\\java\\features",
		glue ="stepDefinations",tags="@SmokeTest",monochrome=true,
		plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cukes.xml"}
		)

public class TestRunner {
	

}


/*@SeleniumTest
Scenario: Search for items and then move to checkout page
Given User is on GreenKart Landing Page
When User searched for "Brinjal" vegetable
And Added items to cart
And User proceeded to checkout page for purchase
Then Verify selected "Brinjal" items are displayed in checkout page 
 * 
 * 
 * 
 * 
 * 
 */