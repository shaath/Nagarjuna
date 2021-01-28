package day10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AlertsEg {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "D:\\Nagarjuna\\Jars/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", "D:\\Nagarjuna\\Jars/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();


		driver.get("http://primusbank.qedgetech.com/");

		driver.findElement(By.id("login")).click();
		
		Thread.sleep(5000);
		
		Alert alt = driver.switchTo().alert();
		
		String msg = alt.getText();
		System.out.println(msg);
		
		alt.accept();
		
	}

}
