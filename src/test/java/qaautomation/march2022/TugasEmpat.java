package qaautomation.march2022;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import qaautomation.march2022.pages.BasePage;
import qaautomation.march2022.pages.LoginPage;

public class TugasEmpat extends BaseWebTestTugasEmpat {
	
	LoginPage loginPage = new LoginPage(driver, explicitWait);
	BasePage basePage = new BasePage(driver, explicitWait);
	
	@Test
	public void testSwitchingIframe() {
		String emailName = "automationtest";
		
		loginPage.inputEmailName(emailName);
		loginPage.clickNextButton();
		
		loginPage.switchingIframe();
		String actualText = loginPage.getDescriptionEmail();
		System.out.println(actualText);
		
		
	}

}
