package CucumberMaven.FRMEWORKCUCUMBER;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static  WebDriver driver;
	
	public static  WebDriver getDriver() throws IOException {
		
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Ajith\\eclipse-workspace1\\frameworkCucumber\\src\\test\\java\\CucumberMaven\\FRMEWORKCUCUMBER\\global.properties");
		pro.load(fis);
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(pro.getProperty("url"));
		return driver;
	}

}
