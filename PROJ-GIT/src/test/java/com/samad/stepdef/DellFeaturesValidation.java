package com.samad.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.samad.POM.DellFeaturesValidation_POM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellFeaturesValidation {

	WebDriver driver;
	
	@Given("^I as User visit Dell homepage$")
	public void i_as_User_visit_Dell_homepage() throws Throwable {
		try {
			  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver_win32\\chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			  driver.get("http://www.dell.com");
			  driver.manage().window().maximize();
			} catch (Exception e) {
				System.out.println("Browser not opening");
			}
			}

	// Rumana (rumana-2022) to write codes for this step in branch name RUMANA 
	@When("^I clicks on contact us and navigates back to homepage$")
	public void i_clicks_on_contact_us_and_navigates_back_to_homepage() throws Throwable {
	    
	}

	// Nabila (nabila-anjum) to write code for this step in branch name NABILA
	@When("^I mouse hovers on products and mouse hovers on laptops and clicks on rugged laptops$")
	public void i_mouse_hovers_on_products_and_mouse_hovers_on_laptops_and_clicks_on_rugged_laptops() throws Throwable {
	   
	}

	// Khadija (happykhadija) to write code for this step in branch name KHADIJA
	@When("^I  types \"([^\"]*)\" and press enter$")
	public void i_types_and_press_enter(String arg1) throws Throwable {
		try {
			DellFeaturesValidation_POM pom = new DellFeaturesValidation_POM(driver);
			pom.TypeField().sendKeys(arg1);
			
			Thread.sleep(2000);
			
			pom.TypeField().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			System.out.println("Element not found");
		}
	}

	// Ahalam (ahalamoirdhaa) to write code for this step in branch name AHALAM
	@When("^I scroll down to page navigation and click next page$")
	public void i_scroll_down_to_page_navigation_and_click_next_page() throws Throwable {
	    
	}

	// Tanha (tanhatuly) to write code for this step in branch name TANHA
	@When("^I navigates to back page and navigates to forward page and click on dell technologies to navigate to homepage$")
	public void i_navigates_to_back_page_and_navigates_to_forward_page_and_click_on_dell_technologies_to_navigate_to_homepage() throws Throwable {
	  
	}

	// Samad (samad2022) to write code for this step in branch name SAMAD
	@Then("^I lands on dell homepage$")
	public void i_lands_on_dell_homepage() throws Throwable {
	   
	}


}
