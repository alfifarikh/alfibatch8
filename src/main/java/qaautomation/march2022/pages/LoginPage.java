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

}
