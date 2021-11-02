package util;

public class TextSplitUtil {

	public static void main(String[] args) {
		querySplit();
	}
	
	
	public static void querySplit() {

		
		String query = "";
		
		String [] querySplit = query.split("\n");
		
		System.out.println(querySplit.length);
		for(String temp: querySplit) {
			
			String [] tempSplit = temp.split("as ");
			if(tempSplit.length > 1) {
				String columnName = tempSplit[1].trim();
				columnName = columnName.toLowerCase();
				String upperName =  columnName.toUpperCase();
				String FormatString = "resultMap.put(\""+upperName+"\", map.get(\""+columnName+"\"));";
				System.out.println(FormatString);				
			}
		}
		
	
	}
	
}
