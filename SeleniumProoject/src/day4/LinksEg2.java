package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Nagarjuna\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		driver.manage().window().maximize();
		
		//way1
//		driver.findElement(By.xpath("//a[@href='home.aspx']")).click();
		
		List<WebElement> links = driver.findElements(By.xpath("//table[@id='Table_011']//a"));
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) {
			String lText = links.get(i).getText();
			System.out.println(lText);
			if (lText.equalsIgnoreCase("Home")) {
				links.get(i).click();
				break;
			}
		}
		

	}

}
