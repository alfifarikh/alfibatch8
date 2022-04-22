package qaautomation.march2022.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
	By username = By.xpath("//input[@id='username']");
	By password = By.id("password");
	By loginBtn = By.xpath("//button[@type='submit']");
	By lgnName = By.xpath("//h2[normalize-space()='Login Page']");
	By failLoginWarn = By.xpath("//div[@id='flash']");
	
	By emailName = By.xpath("//input[@id='login']");
	By nextBtn = By.xpath("//i[contains(text(),'')]");
	By switchIframe = By.id("ifmail");
	By descEmail = By.xpath("//tbody//tr[@valign='top']//div//div//div//div[1]//div[1]//div[1]//div[1]//div[1]//p[1]//strong[1]//span[1]");

	public LoginPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}

	public void inputUsername(String user) {
		setText(username, user);
	}

	public void inputPassword(String pass) {
		setText(password, pass);
	}

	public void clickLoginButton() {
		clickAndWait(loginBtn);
	}
	
	public String loginBanner () {
		return getText(lgnName);
	
	}
	
	public String getFailedLoginWarning () {
		return getText(failLoginWarn);
	
	}
	
	public void inputEmailName(String emailUser) {
		setText(emailName, emailUser);
	}
	
	public void clickNextButton() {
		clickAndWait(nextBtn);
	}
	
	public String getDescriptionEmail() {
		return getText(descEmail);
	
	}
	
	public void switchingIframe() {
		switchIframe(switchIframe);
	}

}
