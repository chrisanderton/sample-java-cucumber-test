package com.sky.test.stepDefinitions;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sky.test.pages.HomePage;
import com.sky.test.pages.ShopPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStepDefinition {

	WebDriver driver = new ChromeDriver();
	static String baseUrl = "https://www.sky.com/";
	HomePage homePage = new HomePage(driver);
	ShopPage shopPage = new ShopPage(driver);

	@Given("^the user is on the sky web site$")
	public void the_user_is_on_the_sky_web_site() throws Throwable {
		homePage.navigateToHomePage(baseUrl);
	}

	@Then("^the page title is valid$")
	public void the_page_title_is_valid() throws Throwable {
		Assert.assertTrue("The home page Title is not correct", baseUrl.equalsIgnoreCase(homePage.getHomePageTitle()));
		driver.close();
	}

	@When("^the user select the \"([^\"]*)\" link$")
	public void the_user_select_the_link(String str) throws Throwable {
//		homePage.selectShopLink();
		homePage.clickOnShopLink();
	}

	@Then("^the user should see the following links$")
	public void the_user_should_see_the_following_links(List<String> links) throws Throwable {
		String expectedPageTitle = "http://www.sky.com/shop/";
//		List<String> actualLinks = new ArrayList<String>();
//		actualLinks = shopPage.getShopLinks();
//		for (String link : links) {
//			System.out.println("\n The link is " + link.trim());
//			Assert.assertTrue("List of actualLinks does not contain expected link" + link.trim(),
//					actualLinks.contains(link.trim()));
//		}
		Assert.assertTrue("", expectedPageTitle.equalsIgnoreCase(shopPage.getPageTitle()));
		driver.close();
	}
}
