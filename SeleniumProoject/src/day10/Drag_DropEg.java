package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_DropEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Nagarjuna\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://jqueryui.com/droppable/");
		
		WebElement drag_drop = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(drag_drop);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(drag, drop).build().perform();
		
//		driver.switchTo().defaultContent();
//		driver.switchTo().parentFrame();
		

	}

}
