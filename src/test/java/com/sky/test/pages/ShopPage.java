package com.sky.test.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopPage {
	WebDriver driver;

	public ShopPage(WebDriver driver) {
		this.driver = driver;
	}

	@CacheLookup
	@FindBy(xpath = ".//*[@id='skycom-shop']/a")
	public WebElement shopLink;

	public List<String> getShopLinks() {
		List<String> shopElementTexts = new ArrayList<String>();
		List<WebElement> shopElements = driver.findElements(By.xpath(".//div[@data-tracking-other='TV']/div/a"));
		for (WebElement shopElement : shopElements) {
			shopElementTexts.add(shopElement.getText().trim());
			System.out.println("\n The actual shopElement text is " + shopElement.getText().trim());
		}
		return shopElementTexts;
	}

	public String getPageTitle()
	{
		return driver.getCurrentUrl();
	}
	public void waitForElement(By by)
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
}
