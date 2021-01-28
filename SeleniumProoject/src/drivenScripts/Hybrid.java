package drivenScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import methods.OrgMaster;

public class Hybrid {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat formate = new SimpleDateFormat("ddMMyyyyHHmmss");
		String x = formate.format(d);
		
		
		String path = "D:\\Nagarjuna\\Workspace\\SeleniumProoject\\src\\testData\\Hybrid.xlsx";
		String path_Out = "D:\\Nagarjuna\\Workspace\\SeleniumProoject\\src\\results\\HybridRes"+x+".xlsx";
		
		FileInputStream fi = new FileInputStream(path);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet TC_Sheet = wb.getSheet("Testcase");
		XSSFSheet TS_Sheet = wb.getSheet("Teststeps");
		XSSFSheet TD_Sheet = wb.getSheet("TestData");
		XSSFSheet EmpReg_Sheet = wb.getSheet("EmpReg");
		
		int TC_Rc = TC_Sheet.getLastRowNum();
		int TS_Rc = TS_Sheet.getLastRowNum();
		int EmpReg_Rc = EmpReg_Sheet.getLastRowNum();
		
		OrgMaster om = new OrgMaster();
		String res = null;
		
		for (int i = 1; i <= TC_Rc; i++) {
			TC_Sheet.getRow(i).createCell(3);
			String exe = TC_Sheet.getRow(i).getCell(2).getStringCellValue();
			
			if (exe.equalsIgnoreCase("Y"))
			{
				String TC_Sheet_TCId = TC_Sheet.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= TS_Rc; j++) {
					TS_Sheet.getRow(j).createCell(4);
					String TS_Sheet_TCId = TS_Sheet.getRow(j).getCell(0).getStringCellValue();
					
					if (TC_Sheet_TCId.equalsIgnoreCase(TS_Sheet_TCId))
					{
						String key = TS_Sheet.getRow(j).getCell(3).getStringCellValue();
						System.out.println(key);
						
						switch (key) {
						case "Launch":
							String url = TD_Sheet.getRow(1).getCell(0).getStringCellValue();
							res = om.orgLaunch(url);
							break;
						case "login":
							String u = TD_Sheet.getRow(1).getCell(1).getStringCellValue();
							String p =TD_Sheet.getRow(1).getCell(2).getStringCellValue();
							res = om.orgLogin(u, p);
							break;
						case "logout":
							res = om.orgLogout();
							om.orgClose();
							break;
						case "Empreg":
							for (int k = 1; k <= EmpReg_Rc; k++) {
								String f = EmpReg_Sheet.getRow(k).getCell(0).getStringCellValue();
								String l = EmpReg_Sheet.getRow(k).getCell(1).getStringCellValue();
								String empId = EmpReg_Sheet.getRow(k).getCell(2).getStringCellValue();
								res = om.orgEmpReg(f, l, empId);
								EmpReg_Sheet.getRow(k).createCell(3).setCellValue(res);
							}
							break;
						case "Usereg":
							String ename = TD_Sheet.getRow(1).getCell(6).getStringCellValue();
							String uname = TD_Sheet.getRow(1).getCell(7).getStringCellValue();
							String pwd = TD_Sheet.getRow(1).getCell(8).getStringCellValue();
							String cpwd= TD_Sheet.getRow(1).getCell(9).getStringCellValue();
							res = om.orgUserReg(ename, uname, pwd, cpwd);
							break;
						case "Ulogin":	
							String un =  TD_Sheet.getRow(1).getCell(7).getStringCellValue();
							String pd =  TD_Sheet.getRow(1).getCell(8).getStringCellValue();
							res = om.orgLogin(un, pd);
							break;
						default:
							System.out.println("Give proper keyword");
							break;
						}
						//Test steps sheet result update
						TS_Sheet.getRow(j).getCell(4).setCellValue(res);
						
						//Test case sheet result update
						if (!TC_Sheet.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail")) 
						{
							TC_Sheet.getRow(i).getCell(3).setCellValue(res);
						}
					}
					
				}
			}
			else
			{
				TC_Sheet.getRow(i).getCell(3).setCellValue("BLOCKED");
			}
			
		}
	
		FileOutputStream fo = new FileOutputStream(path_Out);
		wb.write(fo);
		wb.close();
	}
}
