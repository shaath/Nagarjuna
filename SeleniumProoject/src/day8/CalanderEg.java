package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalanderEg {

	public static void main(String[] args) throws InterruptedException {
		
		String expDate = "18/November/2022";
		
		String[] split = expDate.split("/");
		String day = split[0];
		String month = split[1];
		String year = split[2];
		System.out.println(day + "----"+ month + "----"+ year);
		
		System.setProperty("webdriver.gecko.driver", "D:\\Nagarjuna\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://www.cleartrip.com/");
	
		Thread.sleep(3000);
		
		driver.findElement(By.id("DepartDate")).click();
		
		// Year
		String actYear = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText();
		
		while (!actYear.equalsIgnoreCase(year)) 
		{
			driver.findElement(By.xpath("(//a[@title='Next'])[2]")).click();
			actYear = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText();
		}
		
		//Month
		
		String actMonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText();
		
		while (!actMonth.equalsIgnoreCase(month)) 
		{
			driver.findElement(By.xpath("(//a[@title='Next'])[2]")).click();
			actMonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText();
		}
		boolean flag = false;
		//Day 
		List<WebElement> rows = driver.findElements(By.xpath("(//table[@class='calendar'])[1]/tbody/tr"));
		for (int i = 0; i < rows.size(); i++) {
			List<WebElement> cols =rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < cols.size(); j++) {
				String actDay = cols.get(j).getText();
				if (actDay.equals(day)) {
					flag = true;
					cols.get(j).click();
					break;
				}
			}
			if (flag) {
				break;
			}
			
		}
	}

}
