package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class MyAccountLoginStepDefinitions {
	
	public WebDriver driver = null;
	
	
	@Given("^open browser$")
	public void open_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\SeleniumWebDriverDrivers\\BrowserDriver\\chromedriver_win32_l\\chromedriver.exe");
	    
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		//driver = new ChromeDriver();
	    driver.manage().window().maximize();
	}

	@When("^Enter the url \"([^\"]*)\"$")
	public void enter_the_url(String url) throws Throwable {
	    driver.get(url);
	}

	@And("^Click on My Account Menu$")
	public void click_on_My_Account_Menu() throws Throwable {
	    //driver.findElement(By.linkText("My Account")).click();
		System.out.println("Pass");
	}

	/*@And("^Enter registered username and password$")
	public void enter_registered_username_and_password() throws Throwable {
	    driver.findElement(By.id("username")).sendKeys("pavanoltraining");
	    driver.findElement(By.id("password")).sendKeys("Test@selenium123");
	}*/
	
	@When("^Enter registered username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_registered_username_and_password(String user, String pwd) throws Throwable {
	    driver.findElement(By.id("username")).sendKeys(user);
	    driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@And("^Click on login button$")
	public void click_on_login_button() throws Throwable {
	   driver.findElement(By.name("login")).click();
	}
	
	@Then("^Verify Login$")
	public void verify_Login() throws Throwable {
		 String capText = driver.findElement(By.xpath("//strong[contains(text(),'Error')]")).getText();
		 if(capText.contains("ERROR")) {
			 driver.close();
			 Assert.assertTrue("Invalid Input - Error Page", true);
		 }
		 else {
			 driver.close();
			 Assert.assertTrue(false);
			 
		 }
	}
}