package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Nagarjuna\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://amazon.in");
		Thread.sleep(5000);
		WebElement signIn = driver.findElement(By.id("nav-link-accountList"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(signIn).build().perform();
		
		driver.findElement(By.xpath("//span[text()='Baby Wish List']")).click();

	}

}
