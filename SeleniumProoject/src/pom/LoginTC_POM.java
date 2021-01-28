package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTC_POM {

	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Nagarjuna\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		
		driver.get(lp.url);
		
		lp.orgLogin(lp.u, lp.p);
		
		Thread.sleep(5000);

		AdminhomePage ap = PageFactory.initElements(driver, AdminhomePage.class);
		
		ap.welcomeclick();
		ap.logoutclick();
		
		driver.close();
	}
}