package org.amex.assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CartesAmexPage extends BasePage {

	/** The gold card option. */
	@FindBy(xpath = "(//span[text()='En savoir plus'])[2]")
	private WebElement goldcartesamex;


	/**
	 * Instantiates a cartesamex page.
	 * @param driver the driver
	 */
	public CartesAmexPage(WebDriver driver) {
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
	public void clickCartesAmexGold() {
		goldcartesamex.click();
	}
}
