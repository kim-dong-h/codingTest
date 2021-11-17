package util;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// 파일 읽기 ( json, txt, xml, exel)
public class FileReadUtil {
	
	public String excelFileRead() throws Exception{
		
		String filePath = "/Users/ad0559/Documents/fileReadCRM";
		String fileName = "Interface_v1.0.xlsx";
		String sheetName = "쿠폰_개인쿠폰_조회";
		try {
			
			FileInputStream fi = new FileInputStream(filePath + fileName);
			
			XSSFWorkbook workbook = new XSSFWorkbook(fi);
			
			XSSFSheet sheet = workbook.getSheet(sheetName);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return "S";
	}

}
