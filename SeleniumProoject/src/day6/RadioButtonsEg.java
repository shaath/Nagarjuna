package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Nagarjuna\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();

	    WebElement block = driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		
		List<WebElement> checks = block.findElements(By.tagName("input"));

		System.out.println(checks.size());
		for (int i = 0; i < checks.size(); i++) {
			String cName = checks.get(i).getAttribute("value");
			System.out.println(cName);
			if (cName.equalsIgnoreCase("Milk") || cName.equalsIgnoreCase("water"))
			{
				checks.get(i).click();
			}
		}
	}

}
