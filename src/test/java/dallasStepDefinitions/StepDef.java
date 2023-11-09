package dallasStepDefinitions;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;




public class StepDef {

WebDriver driver;
	@Given("^open demoblaze application$")
	public void open_demoblaze_application() throws Throwable {
		
	
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\njaha\\eclipse-workspace\\MavenWithWebDrive\\WebDriver\\chrome.exe");
		ChromeOptions obj = new ChromeOptions();
		obj.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	    
	}
		
	
	

	@Then("^click log in$")
	public void click_log_in() throws Throwable {
	WebElement nm = driver.findElement(By.id("login2"));  
	nm.click();
	}

	@Then("^enter user name$")
	public void enter_user_name() throws Throwable {//loginusername
	WebElement klm = driver.findElement(By.id("loginusername"));
	klm.sendKeys("njahan");
	    
	}

	@Then("^enter password$")
	public void enter_password() throws Throwable {
		WebElement mp = driver.findElement(By.id("loginpassword"));
		mp.sendKeys("njahan12");
	    
	}

	@Then("^verify user can log in$")
	public void verify_user_can_log_in() throws Throwable {
		WebElement lm = driver.findElement(By.xpath("// button [text()='Log in'] ")); 
		lm.click();
		
	    
	}



}
