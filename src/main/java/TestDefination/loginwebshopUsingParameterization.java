package TestDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class loginwebshopUsingParameterization {

	WebDriver driver;
	@Given("Webshop site is launched")
	public void webshop_site_is_launched() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PDC3B-Training.PDC3B\\eclipse\\Rohan-workspace\\SeleniumProject\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		//driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("user enters username {string}")
	public void user_enters_username(String ustring) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(ustring);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("user enters his password {string}")
	public void user_enters_his_password(String pstring) {
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pstring);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
}
