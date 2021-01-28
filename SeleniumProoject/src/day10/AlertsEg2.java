package day10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsEg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Nagarjuna\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//div[@id='OKTab']/button")).click();
		Thread.sleep(5000);
		
		Alert alt = driver.switchTo().alert();
		
		String msg = alt.getText();
		System.out.println(msg);
		
		alt.accept();
		
//		alt.dismiss();
		
//		alt.sendKeys("Yes");
		

	}

}
