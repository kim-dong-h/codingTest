package levelThree;

public class ShuttleBus {

	public static void main(String[] args) {
		
		// 9시부터 시작 
		// 사무실로 갈수 있는 도착 시간 중 제일 늦인 시간을 구하라 
		int n = 1; // 셔틀 운행 수  
		int t = 1; // 셔틀 운행 간격 
		int m = 5; // 셔틀 최대 수용 인원 
		String[] timetable = {"08:00", "08:01", "08:02", "08:03"}; // 크루가 대기열에 도착한 시간 
		
		String result = solution(n, t, m, timetable);
		System.out.println(result);
	}
	
	public static String solution(int n, int t, int m, String[] timetable) {
		
		String answer = "";
		
		int timeLength = timetable.length;
		
		
		for(int i= 0; i < timeLength; i++) {
			String [] timeSplit = timetable[i].split(":");
			
		}
		
		return answer;
		
	}
	
}
