package util;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileUploadUtil {

	private String filePath = "/Users/ad0559/CRM_value_compare";
	
	public void FileUpload(String insertText) throws Exception{
		String fileName = "/interfaceCompare.txt";
		BufferedWriter bw = null;
		
		try {			
			
			bw = new BufferedWriter(new FileWriter(filePath+fileName, true));
			
			bw.write(insertText);
			bw.newLine();
			
			bw.flush();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			bw.close();
		}
	}
	
}
