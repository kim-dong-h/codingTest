package util.osControll;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import util.FileReadUtil;

public class OSMain {

	public static void main(String[] args) {
		
		OSMain OS = new OSMain();
		
		FileReadUtil fileReadUtil = new FileReadUtil();
		
		
		try {
			String returnValue = fileReadUtil.excelFileRead();
			OS.commandConnection();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	// 커맨드 실행 
	public void commandConnection() throws Exception{
		
		try {
			Process process = Runtime.getRuntime().exec("ls");
			
			BufferedReader bufferReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			
			String line = null;
			
			while((line = bufferReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void sshConnection() throws Exception{
		
	}
	
	public void voCreation() throws Exception{
		
	}
	
	public String controllerChange() throws Exception{
		
		return "";
	}
	
	public String serviceCreation() throws Exception{
		return "";
	}
	
	public String serviceImplCreation() throws Exception{
		return "";
	}
	
	public String serviceChange() throws Exception{
		return "";
	}
	
	public String serviceImplChange() throws Exception{
		return "";
	}
	
	public String daoCreation() throws Exception{
		
		return "";
	}
	
	public String daoChange() throws Exception{
		return "";
	}
	
}
