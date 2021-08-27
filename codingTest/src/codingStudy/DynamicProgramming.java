package codingStudy;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 
 * 다이나믹 프로그래밍이란 큰 문제를 작은 문제로 나누어 푸는 문제
 * 
 */
public class DynamicProgramming {

	public static void main(String[] args) {
		DynamicProgramming dp = new DynamicProgramming();
		
		dp.fibonacci();
		
		int[][] temp = new int [10][10];
		dp.initialize(temp, 10000);
		
		ArrayList<Integer> tt = new ArrayList<Integer>(1);
		
		tt.add(1);
		tt.add(4);
		
		for(int i=0; i< tt.size();i++) {
			System.out.println(tt.get(i));
		}
		
	}
	
	public void initialize(int[][] temp, int inf) {
		
		for(int i =0; i < temp.length; i++) {
			Arrays.fill(temp[i], inf);
		}
		
	}
	
	public void fibonacci() {
		int p = 9;
		
		p = repeatFunction(p);
		
		System.out.println(p);
		
	}
	
	// 재귀함수 이용 
	public int repeatFunction(int n) {
		
		int result = 0;
		
		if(n <=2) {
			return 1;
		}else {
			return repeatFunction(n - 1) + repeatFunction(n - 2);
		}
		
	}
}
