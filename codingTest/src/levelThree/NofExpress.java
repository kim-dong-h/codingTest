package levelThree;

/**
 * N으로 구성 
 * @author kim
 *
 */
public class NofExpress {

	public static void main(String[] args) {
		
		int N = 5;
		int number = 12;
		
		solution(N, number);
		
	}
	
	
	public static int solution(int N, int number) {
		int answer = 0;
		
		int [] dp = new int[8];
		
		int length = (int)(Math.log10(number) + 1);
		
		System.out.println(length);
		
		
		return answer;
	}
	
}
