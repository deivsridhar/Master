package org.amex.assignment.tests;

import org.amex.assignment.factory.PageinstancesFactory;
import org.amex.assignment.pages.AmexHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test(testName = "amex homepage test", description = "amex homepage test")
public class AmexHomePageTest extends BaseTest {

	@Test
	public void amexHomePageTest() {
		driver.get("https://www.americanexpress.com/fr-fr/?inav=NavLogo");
		AmexHomePage amexHomePage = PageinstancesFactory.getInstance(AmexHomePage.class);
		amexHomePage.clickCartesAmex();
		Assert.assertTrue(false, "Login failed : Test failed");
	}
}
