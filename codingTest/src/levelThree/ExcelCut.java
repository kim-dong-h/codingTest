package levelThree;

public class ExcelCut {

	public static void main(String[] args) {
		
		// 행의 갯수 
		int n = 8;
		// 현재 선택된 행의 수 
		int k = 2;
		
		// D 
		String [] cmd = {"D 2", "C", "U 3", "C", "D 4", "C", "U 2", "Z", "Z"};
		solution(n, k, cmd);
		
	}
	
	 public static String solution(int n, int k, String[] cmd) {
	        String answer = "";
	        if ( 5 >=n && n >= 1000000) {
	        	return "fail";
	        }
	        if ( 0 >= k && k >= n) {
	        	return "fail";
	        }
	        if (1 >= cmd.length && cmd.length >= 200000) {
	        	return "fail";
	        }
	        
	        
	        
	        return answer;
	    }
	
}
