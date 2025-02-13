package org.amex.assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AmexHomePage extends BasePage {

	/** cartesAmexOption. */
	@FindBy(xpath = "//p[text()='Cartes American Express®']")
	private WebElement cartesamex;


	/**
	 * Instantiates a new amex page.
	 *
	 * @param driver the driver
	 */
	public AmexHomePage(WebDriver driver) {
		super(driver);
	}

//	/**
//	 * Enter email.
//	 *
//	 * @param email the email
//	 * @return the facebook login page
//	 */
//	public AmexHomePage enterEmail(String email) {
//		emailInput.sendKeys(email);
//		return this;
//	}
//
//	/**
//	 * Enter password.
//	 *
//	 * @param password the password
//	 * @return the facebook login page
//	 */
//	public AmexHomePage enterPassword(String password) {
//		pass.sendKeys(password);
//		return this;
//	}

	/**
	 * Click cartes amex.
	 */
	public void clickCartesAmex() {
		cartesamex.click();
	}
}
