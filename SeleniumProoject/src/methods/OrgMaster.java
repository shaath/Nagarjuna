package methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrgMaster {

	public WebDriver driver = null;
	public String actRes,expRes;
	public String url = "http://orangehrm.qedgetech.com/";    //Qedge123!@#
	public FileInputStream fi = null;
	public Properties p = null;
	//Launch
	public String orgLaunch(String url) throws IOException
	{
		fi = new FileInputStream("D:\\Nagarjuna\\Workspace\\SeleniumProoject\\src\\config\\OrgMaster.properties");
		p = new Properties();
		p.load(fi);
		
		expRes = "LOGIN";
		System.setProperty("webdriver.gecko.driver", "D:\\Nagarjuna\\Jars/geckodriver.exe");
		driver = new FirefoxDriver();

		driver.get(url);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		actRes = driver.findElement(By.id(p.getProperty("login"))).getAttribute("value");
		if (expRes.equalsIgnoreCase(actRes))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
		
	}
	
	//Login
	public String orgLogin(String u, String p)
	{
		expRes = "welcome";
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin")).click();
		
		actRes = driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		if (expRes.equalsIgnoreCase(actRes))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
		
	}
	
	//Logout
	public String orgLogout() throws InterruptedException
	{
		expRes = "LOGIN";
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		actRes = driver.findElement(By.id("btnLogin")).getAttribute("value");
		if (expRes.equalsIgnoreCase(actRes))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	
	//close
	public void orgClose()
	{
		driver.close();
	}
	
	//EmployeeReg
	public String orgEmpReg(String f, String l, String empId)
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
		
		if (expRes.equalsIgnoreCase(actRes))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	
	//UserReg
	public String orgUserReg(String ename, String uname, String pwd,String cpwd) throws InterruptedException
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
		driver.findElement(By.id("systemUser_password")).sendKeys(pwd);
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
		
		if (flag == true) 
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
}
