package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Nagarjuna\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();

		WebElement drop = driver.findElement(By.id("drlist"));
		
		Select s = new Select(drop);
		
//		s.selectByIndex(2);
//		Thread.sleep(3000);
//		s.selectByValue("Alwal123");
//		Thread.sleep(3000);
//		s.selectByVisibleText("Bharath");

		List<WebElement> dItems = s.getOptions();
		System.out.println(dItems.size());
		
		for (int i = 0; i < dItems.size(); i++)
		{
			s.selectByIndex(i);
			String name = dItems.get(i).getText();
			System.out.println(name);
		}
	}

}
