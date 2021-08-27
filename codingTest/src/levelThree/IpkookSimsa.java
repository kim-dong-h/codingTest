package levelThree;

import java.util.ArrayList;
import java.util.Collections;

public class IpkookSimsa {

	public static void main(String[] args) {

		int n = 100000; // 사람 수
		int[] times = { 2, 8, 20 }; // 직원 처리 속도

		solution(n, times);

	}

	public static long solution(int n, int[] times) {

		long answer = 0;
		
		// 처리 속도의 최소 값의 max 값을 구한다.
		// 직원 처리 속도의 모든 값을 n값으로 곱한 모든 값을 배열에 넣어 그 배열을 정렬하면 된다.
		
		ArrayList<Integer> allIndex = new ArrayList<Integer>();
		
		for(int i=1; i <=n;i++) {
			for(int j=0; j < times.length; j++) {
				allIndex.add(i * times[j]);
			}
		}
		Collections.sort(allIndex);
		
		answer = allIndex.get(n-1);
		
		System.out.println(answer);
		
		return answer;

	}

}
