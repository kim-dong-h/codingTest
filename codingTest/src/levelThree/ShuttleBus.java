package levelThree;

public class ShuttleBus {

	public static void main(String[] args) {
		
		// 9시부터 시작 
		// 사무실로 갈수 있는 도착 시간 중 제일 늦인 시간을 구하라 
		// 23:59은 탈 수 없다. 
		int n = 2; // 셔틀 운행 수  
		int t = 5; // 셔틀 운행 간격 
		int m = 4; // 셔틀 최대 수용 인원 
		String[] timetable = {"08:00", "08:01", "08:02", "08:03"}; // 크루가 대기열에 도착한 시간 
		
		String result = solution(n, t, m, timetable);
		System.out.println(result);
	}
	
	public static String solution(int n, int t, int m, String[] timetable) {
		
		String answer = "";
		String[][] dynamicArray = new String[n][m];
		
		for (int i=0; i < n; i++) {
			
		}
		
		return answer;
		
	}
	
}
