package com.samad.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellFeaturesValidation_POM {

WebDriver driver;
	
	public DellFeaturesValidation_POM (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
			}
	@FindBy(xpath="//*[@id=\"unified-masthead\"]/div[1]/div[2]/div[1]/div/a/span/span") 
	WebElement click_contactUs;
	public WebElement ContactUs() {
		return click_contactUs;
		}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/button/span") 
	WebElement hover_products;
	public WebElement Products() {
		return hover_products;
		}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[3]/button") 
	WebElement hover_laptops;
	public WebElement Laptops() {
		return hover_laptops;
		}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[3]/ul/li[11]/a")
	WebElement click_ruggedLaptops;
	public WebElement RuggedLaptops() {
		return click_ruggedLaptops;
	}

	@FindBy(xpath="//*[@id=\"mh-search-input\"]")
	WebElement type_laptopType;
	public WebElement TypeField() {
		return type_laptopType;
	}

	@FindBy(xpath="//*[@id=\"ux-container__main-content_page-content_results_content\"]/div[4]/div[1]/button[7]")
	WebElement find_nextPage;
	public WebElement NextPage() {
		return find_nextPage;
	}

	@FindBy(xpath="//*[@id=\"Layer_1\"]")
	WebElement click_logo;
	public WebElement DellLogo() {
		return click_logo;
	}
	
}


