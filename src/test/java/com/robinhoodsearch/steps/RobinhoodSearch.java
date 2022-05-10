package com.robinhoodsearch.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RobinhoodSearch {

	WebDriver driver;
	
	
	@Given("I am on google homepaage")
	public void i_am_on_google_homepaage() {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com");
			
	}

	@When("I put <{string}> in search engine")
	public void i_put_in_search_engine(String string) {
	  	}

	@When("I click on search")
	public void i_click_on_search() {
	    
	}

	@When("I choose the first result that pop up on the screen")
	public void i_choose_the_first_result_that_pop_up_on_the_screen() {
	    
	}

	@Then("I see the robinhood homepage")
	public void i_see_the_robinhood_homepage() {
	    
	}
	
	
}
