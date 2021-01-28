package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpReg_TestNG extends TestNGMaster{
	@Test(dataProvider = "data")
	public void orgEmpReg(String f, String l, String empId)
	{
		expRes = f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(empId);
		driver.findElement(By.id("btnSave")).click();
		
		actRes = driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		Assert.assertEquals(actRes, expRes, "Employee Registration Failed");
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] x = new Object[2][3];
		
		x[0][0] = "Surya";
		x[0][1] = "Prakash";
		x[0][2] = "SP985472789589";
		
		x[1][0] = "Nani";
		x[1][1] = "Konanki";
		x[1][2] = "NK37645o237523";
		
		return x;
  		
	}
}
