package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxEg2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Nagarjuna\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		
		WebElement block = driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		
		List<WebElement> checks = block.findElements(By.tagName("input"));

		System.out.println(checks.size());
		for (int i = 0; i < checks.size(); i++)
		{
			if (!checks.get(i).isSelected())
			{
				checks.get(i).click();
			}
		}
	}

}
