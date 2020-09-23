package stepDefinations;

import CucumberMaven.FRMEWORKCUCUMBER.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	
	
	@Before("@MobileTest")
	public void Demo() {
		
		System.out.println("before test");
	}
	
	@After("@MobileTest")
	public void Demo1() {
		
		System.out.println("After test");
	}
	
	@After("@SeleniumTest")
	public void closeMethod() {
		
		driver.close();
	
	}

}
