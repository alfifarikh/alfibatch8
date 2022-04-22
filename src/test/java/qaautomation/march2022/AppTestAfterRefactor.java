package qaautomation.march2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import qaautomation.march2022.pages.LoginPage;
import qaautomation.march2022.pages.ProfilePage;

public class AppTestAfterRefactor extends BaseWebTest {

	
	@Test
	public void test() {
		String username = "tomsmith";
		String password = "SuperSecretPassword!";
		driver.get().findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.get().findElement(By.id("password")).sendKeys(password);
		driver.get().findElement(By.xpath("//button[@type='submit']")).click();
		String actualText = driver.get().findElement(By.xpath("//div[@id='flash']")).getText();
		String expectedText = "You logged into a secure area!";
		System.out.println(actualText);
		Assert.assertTrue(actualText.contains(expectedText));			
	}
	
	@Test
	public void test2() {
		String username = "tomsmith";
		String password = "SuperSecretPassword!";
		driver.get().findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.get().findElement(By.id("password")).sendKeys(password);
		String actualText = driver.get().findElement(By.xpath("//h2[normalize-space()='Login Page']")).getText();
		String expectedText = "Login Page";
		Assert.assertTrue(actualText.contains(expectedText));
	}

	@Test
	public void test3() {
		String username = "tomsmith";
		String password = "SuperSecretPassword!";
		driver.get().findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.get().findElement(By.id("password")).sendKeys(password);
		String actualText = driver.get().findElement(By.xpath("//h2[normalize-space()='Login Page']")).getText();
		String expectedText = "Login Page";
		Assert.assertTrue(actualText.contains(expectedText));
	}
	
}
