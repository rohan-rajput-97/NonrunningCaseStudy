package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CaseStudy {
	WebDriver driver;
	@Given("Browser is opened and TestMe Website is running")
	public void browser_is_opened_and_TestMe_Website_is_running() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PDC3B-Training.PDC3B\\eclipse\\Rohan-workspace\\SeleniumProject\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		Thread.sleep(2000);
	    
		
	}

	@Given("user clicks on signup button on homepage")
	public void user_clicks_on_signup_button_on_homepage() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
		Thread.sleep(2000);
	    
	}

	@Then("user enters desired username {string}")
	public void user_enters_desired_username(String uname) {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(uname);
	    
	}

	@Then("user enters his\\/her first name {string}")
	public void user_enters_his_her_first_name(String fname) {
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(fname);
	   
	}

	@Then("last name {string}")
	public void last_name(String lname) {
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lname);
	   
	}

	@Then("user fills the required fields")
	public void user_fills_the_required_fields() throws InterruptedException {
	   
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("rohan1997");
		driver.findElement(By.xpath("//input[@id='pass_confirmation']")).sendKeys("rohan1997");
		driver.findElement(By.xpath("//label[@class='form-control input-lg']//input[1]")).click();
		driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("rohan12@gmail.com");
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("04/06/1997");
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Xyz lane near abc road");
		Select SQ = new Select(driver.findElement(By.name("securityQuestion")));
		SQ.selectByIndex(1);
		driver.findElement(By.xpath("//input[@name='answer']")).sendKeys("Red");
		
		
	}
	
	@Then("user clicks on Register button")
	public void user_clicks_on_Register_button() throws InterruptedException {
	    
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		driver.close();
	}

	
	
	//Case Study 2
	
	
	@Given("user clicks on signin button on homepage")
	public void user_clicks_on_signin_button_on_homepage() {
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
		
	}

	@Then("user enters his\\/her username {string}")
	public void user_enters_his_her_username(String luname) {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("lalitha");
		
	}

	@Then("user enters valid password {string}")
	public void user_enters_valid_password(String pass) {
	    
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password123");
	}

	@Then("user clicks on Login button")
	public void user_clicks_on_Login_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		Thread.sleep(1000);
		driver.close();
		
	}
	
	
	//Case Study 3

	
	@Given("User has already logged in")
	public void user_has_already_logged_in() {
	    //System.out.println("User is logged in.");
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("lalitha");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password123");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
	}

	@Then("user searches for desired item on search bar")
	public void user_searches_for_desired_item_on_search_bar() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("Headphone");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[contains(text(),'Headphone')]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//form//input[@name='val']")).click();
		driver.close();
		
	}
	
	//Case Study 4
	
	@Given("User has already logged in and has serached the desired product")
	public void user_has_already_logged_in_and_has_serached_the_desired_product() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("lalitha");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password123");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		//driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("Headphone");
		Thread.sleep(1000);
		
		
		
		System.out.println("At the end of cart login");
	}

	@Then("user tries to proceed to payment page without adding product to cart")
	public void user_tries_to_proceed_to_payment_page_without_adding_product_to_cart() {
		boolean b=false;
		
		System.out.println("Inside adding cart ");
		
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("headphone");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		boolean d =driver.findElement(By.xpath("//a[contains(text(),'Cart')]")).isDisplayed();
		System.out.println(d);
		if (b!=d) {
			System.out.println("Cart is present");
		}
		else 
			System.out.println("Cart is missing");
	    
		
		driver.close();
	}
}
