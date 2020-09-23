package stepDefinations;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import CucumberMaven.FRMEWORKCUCUMBER.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;


public class MyStepDefinition {
	
	public WebDriver driver;
	HomePage h;
	
	@Given("User is on GreenKart Landing Page")
	public void user_is_on_green_kart_landing_page() throws Throwable {
		
		driver = BaseClass.getDriver();
	}
	
	@When("User searched for {string} vegetable")
	public void user_searched_for_vegetable(String string) throws Throwable {
	    
		h = new HomePage(driver);
		h.getSearch().sendKeys(string);
		Thread.sleep(3000);
	}
	
	@And("Added items to cart")
	public void added_items_to_cart() {
		
		driver.findElement(By.cssSelector("a.increment")).click();
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
	    
	}
	
	@And("User proceeded to checkout page for purchase")
	public void user_proceeded_to_checkout_page_for_purchase() {
		driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	    
	}
	
	@Then("Verify selected {string} items are displayed in checkout page")
	public void verify_selected_items_are_displayed_in_checkout_page(String string) {
		
		Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(string));
	}
  
	@Then("{string} results are displayed")
	public void results_are_displayed(String string) throws Throwable {
		
		Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(string));
	   
	}	
}
