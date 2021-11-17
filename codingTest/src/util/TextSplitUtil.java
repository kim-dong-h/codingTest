package util;

public class TextSplitUtil {

	public static void main(String[] args) {
//		querySplit();

		try {
			tabSplit();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void tabSplit() throws Exception{
		// as 없는 쿼리 자르기 
		String query = "    ";
		String [] querySplit = query.split("\n");
		for(String temp: querySplit) {
			String [] lineSplit = null;
			if(temp.contains("as ")) {
				lineSplit = temp.split("as ");
			}else if(temp.contains(".")) {
				lineSplit = temp.split("\\.");
			}
			if(lineSplit.length > 1) {
				String columnName =  lineSplit[1].trim();
				columnName = columnName.replaceAll("\\W", "");
				columnName = columnName.toLowerCase();
				String upperName =  columnName.toUpperCase();
				String FormatString = "resultMap.put(\""+upperName+"\", map.get(\""+columnName+"\"));";
				System.out.println(FormatString);
			}
		}
		
	}
	
	public static void querySplit() {

		
		String query = "";
		
		String [] querySplit = query.split("\n");
		
		System.out.println(querySplit.length);
		for(String temp: querySplit) {
			
			String [] tempSplit = temp.split("as ");
			if(tempSplit.length > 1) {
				String columnName = tempSplit[1].trim();
				// 알파벳이나 숫자를 제외한 문자만 찾기 \\W 
				columnName = columnName.replaceAll("\\W", "");
				columnName = columnName.toLowerCase();
				String upperName =  columnName.toUpperCase();
				String FormatString = "resultMap.put(\""+upperName+"\", map.get(\""+columnName+"\"));";
				System.out.println(FormatString);				
			}
		}
		
	
	}
	
}
