package com.sky.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;

	@CacheLookup
	@FindBy(xpath = ".//*[@id='skycom-shop']/a")
	public WebElement shopLink;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void navigateToHomePage(String url) {
		driver.get(url);
	}

	public String getHomePageTitle() {
		return driver.getCurrentUrl();
	}

	public void selectShopLink() {
		Actions action = new Actions(driver);
		 action.moveToElement(shopLink).build().perform();
		waitForElement(By.xpath(".//div[@data-id='skycom-shop']/div/a"));
	}

	public void clickOnShopLink() {
		shopLink.click();
	}

	public void waitForElement(By by) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
}
