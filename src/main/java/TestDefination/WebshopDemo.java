package TestDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebshopDemo {
	WebDriver driver;
	@Given("Demowebshop website is launched")
	public void demowebshop_website_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PDC3B-Training.PDC3B\\eclipse\\Rohan-workspace\\SeleniumProject\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		
		System.out.println("Site launched");
	}

	@Given("user clicks on register up button")
	public void user_clicks_on_register_up_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		System.out.println("Click on register button");
	}
	
	@When("user enters required data")
	public void user_enters_required_data() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("User enters asked data");
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Rohan");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("SinghRajput");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rohanrajput1234@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("rohan234");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("rohan234");
		
	}

	@Then("clicks on register button")
	public void clicks_on_register_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		Thread.sleep(2000);
		System.out.println("user clicks on register button");
	}

	@Given("registered user clicks on signin button")
	public void registered_user_clicks_on_signin_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("clicks on signin button");
	}
	
	@Then("he provides valid data for login requiremnet input fields")
	public void he_provides_valid_data_for_login_requiremnet_input_fields() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rohanrajput1234@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("rohan234");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//Thread.sleep(2000);
		
		System.out.println("Enters valid data");
	}

	@Then("clicks on login button for the login validation")
	public void clicks_on_login_button_for_the_login_validation() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("clicks in login button");
	}

	@Given("user clicks on Search Store")
	public void user_clicks_on_Search_Store() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		System.out.println("clicks on search bar ");
	}

	@Then("user enters the item name")
	public void user_enters_the_item_name() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input valid']")).sendKeys("14.1-inch Laptop");
		Thread.sleep(2000);
		System.out.println("searches for the product");
	}

	@Then("clicks on Search button")
	public void clicks_on_Search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		System.out.println("clicks on search button");
	}

	@Given("user selects the item from the given number of list")
	public void user_selects_the_item_from_the_given_number_of_list() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("selects product from number of items");
	}

	@Then("user clicks on add to cart")
	public void user_clicks_on_add_to_cart() {
		driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("adds the product to cart");
	}



}
