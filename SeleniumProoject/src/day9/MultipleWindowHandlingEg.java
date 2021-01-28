package day9;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowHandlingEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Nagarjuna\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://gmail.com");

		String gId=driver.getWindowHandle();
//		System.out.println(gId);
		
		driver.findElement(By.linkText("Privacy")).click();
		
		Set<String> s = driver.getWindowHandles();
		
		Iterator<String> it = s.iterator();
		while (it.hasNext()) 
		{
			String wId = it.next();
			System.out.println(wId);
			driver.switchTo().window(wId);
			
			try {
				driver.findElement(By.linkText("Terms of Service")).click();
				Thread.sleep(3000);
				System.out.println(driver.getTitle()+"---"+driver.getCurrentUrl());
				break;
			} catch (Exception e) {
				System.out.println("The expected element not available in the current window "+driver.getTitle() );
			}
			
		}
		
	}

}
