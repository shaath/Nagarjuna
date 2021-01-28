package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitEg {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Nagarjuna\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 180);
		
		driver.get("https://www.24hourfitness.com/");
		driver.manage().window().maximize();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='See Gyms']")));
		
		driver.findElement(By.xpath("//a[text()='See Gyms']")).click();

	}

}
