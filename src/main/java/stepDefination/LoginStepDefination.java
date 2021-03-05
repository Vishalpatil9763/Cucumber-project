package stepDefination;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {
	WebDriver driver;
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\eclipse-workspace\\vishalcucumber\\src\\main\\resources\\driver\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/index.html");
		
		}
//fdgnvghcwasdfghjkl;'
	@When("^title of page is free CRM$")
	public void title_of_page_is_free_CRM()  {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
		
		
		
		
	    
	}

	@Then("^user enters userName And password$")
	public void user_enters_userName_And_password() {
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()  {
	  
	}

	@Then("^user is on homePage$")
	public void user_is_on_homePage()  {
	}
	
	
	
	
	}
	   
		

