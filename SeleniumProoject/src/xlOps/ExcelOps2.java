package xlOps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import methods.OrgMaster;

public class ExcelOps2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		String path = "D:\\Nagarjuna\\Workspace\\SeleniumProoject\\src\\testData\\TestData.xlsx";
		String pathOut = "D:\\Nagarjuna\\Workspace\\SeleniumProoject\\src\\results\\EmpRegRes.xlsx";
		
		FileInputStream fi = new FileInputStream(path);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("EmpReg");
		
		int lRc = ws.getLastRowNum();
		System.out.println(lRc);
		
		OrgMaster om = new OrgMaster();
		
		om.orgLaunch(om.url);
		om.orgLogin("Admin", "Qedge123!@#");
		
		
		for (int i = 1; i <= lRc; i++) 
		{
			XSSFRow r = ws.getRow(i);
			
			XSSFCell c = r.getCell(0);
			XSSFCell c1 = r.getCell(1);
			XSSFCell c2 = r.getCell(2);
			XSSFCell c3 = r.createCell(3);
			
			String f = c.getStringCellValue();
			String l = c1.getStringCellValue();
			String empId = c2.getStringCellValue();
			
			System.out.println(f +"---"+ l +"----"+empId);
			
			String res = om.orgEmpReg(f, l, empId);
			
			c3.setCellValue(res);
			 
		}
		
		FileOutputStream fo = new FileOutputStream(pathOut);
		wb.write(fo);
		wb.close();
		
		om.orgLogout();
		om.orgClose();
		

	}

}
