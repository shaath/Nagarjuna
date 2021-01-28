package xlOps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {

	public static void main(String[] args) throws IOException {
		String path = "D:\\Nagarjuna\\Workspace\\SeleniumProoject\\src\\testData\\TestData.xlsx";
		String pathOut = "D:\\Nagarjuna\\Workspace\\SeleniumProoject\\src\\results\\TestRes.xlsx";
		
		FileInputStream fi = new FileInputStream(path);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("EmpReg");
//		XSSFRow r = ws.getRow(4);
//		XSSFCell c = r.getCell(0);
		
//		System.out.println(c.getStringCellValue());
		
		XSSFRow r = ws.getRow(1);
		XSSFCell c = r.createCell(3);
		
		c.setCellValue("Pass");
		
		FileOutputStream fo = new FileOutputStream(pathOut);
		wb.write(fo);
		wb.close();
		

	}

}
