package TestDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class againloginwebshop {
	WebDriver driver;
	@Given("Site is launched here")
	public void site_is_launched_here() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\PDC3B-Training.PDC3B\\eclipse\\Rohan-workspace\\SeleniumProject\\resources\\chromedriver.exe");
		//driver = new ChromeDriver();
		//driver.get("http://demowebshop.tricentis.com/");
		System.out.println("Site launched syso");
		//Thread.sleep(2000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Webshop site is launched as syso")
	public void webshop_site_is_launched_as_syso() throws InterruptedException {
		Thread.sleep(1000);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PDC3B-Training.PDC3B\\eclipse\\Rohan-workspace\\SeleniumProject\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println("Site launched syso");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("user clicks on login button again")
	public void user_clicks_on_login_button_again() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("user enters the username {string}")
	public void user_enters_the_username(String unstring) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(unstring);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("user enters his\\/her password {string}")
	public void user_enters_his_her_password(String psstring) {
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(psstring);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("clicks on login button again")
	public void clicks_on_login_button_again() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}	
}
