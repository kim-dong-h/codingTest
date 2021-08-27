package company;

import java.util.ArrayList;

public class MoneyBrain {

	public static void main(String[] args) {
		
		String text = "nothing";
		String prefixString = "bruno";
		String suffixString = "ingenious";
		
		String result = solution(text, prefixString, suffixString);
//		System.out.println(result);
		
		long result3 = substringCalculator("kincenvizh");
		
		System.out.println(result3);
		
	}
	
	public static long substringCalculator(String s) {
		
		long answer = 0;
		ArrayList<String> arrayList = new ArrayList<String>();
		
		for (int i =0; i < s.length(); i++) {
			arrayList.add(String.valueOf(s.charAt(i)));
		}

		memozation(arrayList);
		
		
		
		return answer;
	}
	
	public static long memozation(ArrayList<String> element) {
		
		long answer = 0; 
		
		
		return answer;
	}
	
	public static String solution(String text, String prefixString, String suffixString) {
		
		String answer = "";
		
		
		
		return answer;
		
	}
	
}
