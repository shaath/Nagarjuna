package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Nagarjuna\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://twitter.com");
	}

}
