package levelThree;

import java.util.ArrayList;

public class GPStexi {

	public static void main(String[] args) {

		int n = 7; // 도로 개수 
		int m = 10; // 거점 연결 도로 개수 
		int[][] edge_list = { { 1, 2 }, { 1, 3 }, { 2, 3 }, { 2, 4 }, { 3, 4 }, { 3, 5 }, { 4, 6 }, { 5, 6 }, { 5, 7 },
				{ 6, 7 } };
		int k = 6;  // gps_log 총 개수 
//		int[] gps_log = { 1, 2, 3, 3, 6, 7 };
//		int[] gps_log = { 1, 2, 4, 6, 5, 7 };
		int[] gps_log = { 2, 4, 3, 6, 3, 1 };

		System.out.println(solution(n, m, edge_list, k, gps_log));

	}

	
	public static int solution(int n, int m, int[][] edge_list, int k, int[] gps_log) {
		
		int answer = 0;
		
		int a = 104 % 3;
		
		System.out.println(a);
	
		
		return answer;
		
	}
	
	public static int gpsInfoTopDown(int n) {
		
		return n;
	}
	
	
	// TODO 코딩테스트에서는 계속 틀렸다고 표시한다. why???
	public static int solution2(int n, int m, int[][] edge_list, int k, int[] gps_log) {

		int answer = 0;

		if (!(2 <= n && n <= 200)) {
			return -1;
		}
		if (!(1 <= m && m <= 10000)) {
			return -1;
		}
		if (!(2 <= k && k <= 100)) {
			return -1;
		}
		if (m != edge_list.length) {
			return -1;
		}

		for (int i = 0; i < k - 1; i++) {
			boolean equals_data = true;
			int current_gps = gps_log[i];
			int next_gps = gps_log[i + 1];
			if (current_gps == next_gps) {
				continue;
			}
			for (int j = 0; j < m; j++) {
				int start_edge = edge_list[j][0];
				int end_edge = edge_list[j][1];
				if ((current_gps == start_edge && next_gps == end_edge)
						|| (current_gps == end_edge && next_gps == start_edge)) {
					equals_data = false;
					break;
				}
			}
			if (equals_data) {
				answer += 1;
			}
		}

		return answer;
	}
	

}
