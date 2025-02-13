package org.amex.assignment.pages;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {

	/** The driver. */
	protected WebDriver driver;
    protected WebDriverWait wait;

   

	/** The waiter. */
	protected FluentWait<WebDriver> waiter;

	/**
	 * Instantiates a new base page.
	 *
	 * @param driver the driver
	 */
	public BasePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		waiter = new FluentWait<WebDriver>(driver).ignoring(NoSuchElementException.class, WebDriverException.class)
				.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2));
	}
	
	

}
