package org.amex.assignment.tests;

import java.io.IOException;

import org.amex.assignment.factory.PageinstancesFactory;
import org.amex.assignment.objects.User;
import org.amex.assignment.pages.GoldCardDescriptionPage;
import org.amex.assignment.pages.UserDeatilsPage;

import org.amex.assignment.pages.AmexHomePage;
import org.amex.assignment.pages.CartesAmexPage;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test(testName = "Enter user details", description = "Enter user details")
public class UserDetailsPageTest extends BaseTest {

	@Test
	public void enterUserDetails() throws IOException, InterruptedException {
		driver.get("https://www.americanexpress.com/fr-fr/charge-cards/apply/personal/gold?sourcecode=A0000FE43V&intlink=fr-amex-cardshop-details-apply-GoldCardAmericanExpress-siderail");
		UserDeatilsPage userDeatilsPage = PageinstancesFactory.getInstance(UserDeatilsPage.class);
		User user = org.amex.assignment.util.JacksonUtils.deserializeJson("myUser.json", User.class);
		userDeatilsPage.setUserDetails(user).clickTitle();
		Assert.assertTrue(false, "clickedsave button : Test failed");
	}
}
