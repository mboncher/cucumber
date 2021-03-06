package stepsDefination;

/*import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;*/

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Flow {

	public static WebDriver driver;

/*	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bonchervu.meena\\eclipse-workspace\\CucumberPractice\\Driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.store.demoqa.com");
	}*/

/*	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page()  {
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	}*/

/*	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password()  {
		driver.findElement(By.id("log")).sendKeys("testuser_1");
		driver.findElement(By.id("pwd")).sendKeys("Test@123");
		driver.findElement(By.id("login")).click();
	}*/

/*	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully()  {
		System.out.println("Login Successfully");
	}*/

/*	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application()  {
		driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
	}*/

/*	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_Logout_Successfully() throws Throwable {
		System.out.println("LogOut Successfully");
	}*/
	
//---------------------------------	

@Given("^User is on Home Page$")
public void user_is_on_Home_Page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bonchervu.meena\\eclipse-workspace\\CucumberPractice\\Driver\\chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.store.demoqa.com");
    
}

@When("^User Navigate to LogIn Page$")
public void user_Navigate_to_LogIn_Page() throws Throwable {
	driver.findElement(By.xpath(".//*[@id='account']/a")).click();
    
}

@When("^User enters UserName and Password$")
public void user_enters_UserName_and_Password() throws Throwable {
	driver.findElement(By.id("log")).sendKeys("testuser_1");
	driver.findElement(By.id("pwd")).sendKeys("Test@123");
	driver.findElement(By.id("login")).click();
    
}

@Then("^Message displayed Login Successfully$")
public void message_displayed_Login_Successfully() throws Throwable {
	System.out.println("Login Successfully");
    
}

@When("^User LogOut from the Application$")
public void user_LogOut_from_the_Application() throws Throwable {
	driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
    
}

@Then("^Message displayed LogOut Successfully$")
public void message_displayed_LogOut_Successfully() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}


}
