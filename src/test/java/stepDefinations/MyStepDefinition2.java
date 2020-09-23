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


public class MyStepDefinition2 {
	
	public WebDriver driver;
	HomePage h;
	
	@Given("User is on GreenKart Landing Pages")
	public void user_is_on_green_kart_landing_pages() throws Throwable {
		
		driver = BaseClass.getDriver();
	}
	
	@When("User searched for {string} vegetables")
	public void user_searched_for_vegetables(String string) throws Throwable {
	    
		h = new HomePage(driver);
		h.getSearch().sendKeys(string);
		Thread.sleep(3000);
	}
	
	@When("User searched for Beetroot vegetables")
	public void user_searched_for_beetroot_vegetables() throws Throwable {
		h = new HomePage(driver);
		h.getSearch().sendKeys("Beetroot");
		Thread.sleep(3000);
	}
	
	@When("User searched for Brinjal vegetables")
	public void user_searched_for_brinjal_vegetables() throws Throwable {
	    
		h = new HomePage(driver);
		h.getSearch().sendKeys("Brinjal");
		Thread.sleep(3000);
	}

	
	@And("Added items to carts")
	public void added_items_to_carts() throws Throwable {
		
		driver.findElement(By.cssSelector("a.increment")).click();
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
	    
	}
	
	@And("User proceeded to checkout page for purchases")
	public void user_proceeded_to_checkout_page_for_purchases() throws Throwable {
		driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	    
	}
	
	@Then("Verify selected Beetroot items are displayed in checkout pages")
	public void verify_selected_beetroot_items_are_displayed_in_checkout_pages() throws Throwable {
		
		Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains("Beetroot"));
	}
		
	@Then("Verify selected {string} items are displayed in checkout pages")
	public void verify_selected_items_are_displayed_in_checkout_pages(String string) throws Throwable {
		
		Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(string));
	}
	
	@Then("Verify selected Brinjal items are displayed in checkout pages")
	public void verify_selected_brinjal_items_are_displayed_in_checkout_pages() throws Throwable {
	    
		Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains("Brinjal"));
	}
	
	@Then("{string} results are displayeds")
	public void results_are_displayeds(String string) throws Throwable  {
	    
		Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(string));
	}
  
}
