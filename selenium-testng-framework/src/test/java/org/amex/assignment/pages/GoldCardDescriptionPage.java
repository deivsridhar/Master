package org.amex.assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GoldCardDescriptionPage extends BasePage {

	/** The goldcardamex. */
	@FindBy(xpath = "(//a[text()='Demandez votre Carte'])[1]")
	private WebElement goldcardamex;


	/**
	 * Instantiates a cartesamex page.
	 * @param driver the driver
	 */
	public GoldCardDescriptionPage(WebDriver driver) {
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
	 * Click gold amex.
	 */
	public void clickGoldcardAmex() {
		goldcardamex.click();
	}
}
