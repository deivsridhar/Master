package org.amex.assignment.tests;

import org.amex.assignment.factory.PageinstancesFactory;
import org.amex.assignment.pages.AmexHomePage;
import org.amex.assignment.pages.CartesAmexPage;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test(testName = "amex goldpage test", description = "amex goldpage test")
public class CartesAmexPageTest extends BaseTest {

	@Test
	public void goldAmexCardTest() {
		driver.get("https://www.americanexpress.com/fr/carte-de-paiement/types-cartes/cartes-proprietaires/?intlink=fr-fr-hp-product1-all-pry_cartes-01032021");
		CartesAmexPage cartesamexpage = PageinstancesFactory.getInstance(CartesAmexPage.class);
		cartesamexpage.clickCartesAmexGold();
		Assert.assertTrue(false, "cartespage failed : Test failed");
	}
}
