package qaautomation.march2022;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import qaautomation.march2022.pages.LoginPage;
import qaautomation.march2022.pages.LoginPageFactory;
import qaautomation.march2022.pages.ProfilePage;
import qaautomation.march2022.pages.ProfilePageFactory;

public class AppTestAfterPageFactory extends BaseWebTest{
	
	LoginPage loginPage = new LoginPage(driver, explicitWait);
	ProfilePage profilePage = new ProfilePage(driver, explicitWait);

	// karena semua extends dari BaseWebTest maka semua driver mesti menggunakan
	// driver.get()
	@Test
	public void loginToWebAndSuccess() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		ProfilePageFactory profilePage = new ProfilePageFactory(driver, explicitWait);
		String username = "tomsmith";
		String password = "SuperSecretPassword!";

		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();

		String actualText = profilePage.getProfileText();

		String expectedText = "You logged into a secure area!";
		Assert.assertTrue(actualText.contains(expectedText));
	}

	@Test
	public void loginToWebNotClickingLoginButton() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		String username = "tomsmith";
		String password = "SuperSecretPassword!";
		
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		
		String actualText = loginPage.getBannerText();
		String expectedText = "Login Page";
		Assert.assertTrue(actualText.contains(expectedText));
	}

	@Test
	public void loginInvalidUsername() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		String username = "tomsmithmabro";
		String password = "SuperSecretPassword!";
		
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();

		String actualText = loginPage.getFailedLoginWarning();

		String expectedText = "Your username is invalid!";
		Assert.assertTrue(actualText.contains(expectedText));
	}
	
	@Test
	public void loginInvalidPassword() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		String username = "tomsmith";
		String password = "SuperSecretPassword!123";
		
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();

		String actualText = loginPage.getFailedLoginWarning();

		String expectedText = "Your password is invalid!";
		Assert.assertTrue(actualText.contains(expectedText));
	}

}
