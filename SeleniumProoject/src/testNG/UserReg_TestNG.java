package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserReg_TestNG extends TestNGMaster {

	@Test
	public void orgUserReg() throws InterruptedException
	{
		boolean flag = false;
		expRes = uname;
		Thread.sleep(3000);
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btnAdd")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("systemUser_employeeName_empName")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(pswd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(cpwd);
		Thread.sleep(3000);
		driver.findElement(By.id("btnSave")).click();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		for (int i = 0; i < rows.size(); i++) {
			
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			actRes = cols.get(1).getText();
			if (expRes.equalsIgnoreCase(actRes)) {
				flag = true;
				break;
			}
		}
		
		Assert.assertEquals(flag, true);
	}
}
