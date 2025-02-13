package org.amex.assignment.tests;

import org.amex.assignment.factory.PageinstancesFactory;
import org.amex.assignment.pages.GoldCardDescriptionPage;
import org.amex.assignment.pages.AmexHomePage;
import org.amex.assignment.pages.CartesAmexPage;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test(testName = "amex goldcard test", description = "amex goldcard test")
public class GoldCardDescriptionPageTest extends BaseTest {

	@Test
	public void goldAmexTest() {
		driver.get("https://www.americanexpress.com/fr/carte-de-paiement/types-cartes/cartes-proprietaires/?intlink=fr-fr-hp-product1-all-pry_cartes-01032021");
		GoldCardDescriptionPage addToCartPage = PageinstancesFactory.getInstance(GoldCardDescriptionPage.class);
		addToCartPage.clickGoldcardAmex();
		Assert.assertTrue(false, "goldcard failed : Test failed");
	}
}
