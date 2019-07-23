package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Stepdefs {
	WebDriver driver=null;
	
	@Given("^the login page is opened$")
	public void the_login_page_is_opened() throws Throwable {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6E.00.13\\Desktop\\Browser and drivers\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://newtours.demoaut.com/");
	}

	@When("^user enters mercury as username$")
	public void user_enters_mercury_as_username() throws Throwable {
	   driver.findElement(By.name("userName")).sendKeys("mercury");
	}

	@When("^user enters mercury as password$")
	public void user_enters_mercury_as_password() throws Throwable {
		driver.findElement(By.name("password")).sendKeys("mercury");
	}

	@Then("^user will Find a flight$")
	public void user_will_Find_a_flight() throws Throwable {
		
	    driver.findElement(By.name("login")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Assert.assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());
	}

}