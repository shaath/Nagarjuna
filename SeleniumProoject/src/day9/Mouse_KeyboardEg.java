package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_KeyboardEg {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "D:\\Nagarjuna\\Jars/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
	
		System.setProperty("webdriver.chrome.driver", "D:\\Nagarjuna\\Jars/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");

		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(gmail).contextClick().build().perform();
		
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
//		act.sendKeys(Keys.chord("P")).build().perform();
	}

}
