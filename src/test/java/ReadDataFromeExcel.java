import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromeExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File f=new File("C:\\AutomationPractice\\LoginData.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		String value=sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(value);
		
	}

}
