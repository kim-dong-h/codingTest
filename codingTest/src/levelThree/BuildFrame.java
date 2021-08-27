package levelThree;

import java.util.Arrays;
import java.util.Comparator;

public class BuildFrame {

	public static void main(String[] args) {

		int n = 5;
		int[][] build_frame2 = { { 1, 0, 0, 1 }, { 1, 1, 1, 1 }, { 2, 1, 0, 1 }, { 2, 2, 1, 1 }, { 5, 0, 0, 1 },
				{ 5, 1, 0, 1 }, { 4, 2, 1, 1 }, { 3, 2, 1, 1 } };
		
		int [][] build_frame = {{0,0,0,1},{2,0,0,1},{4,0,0,1},{0,1,1,1},{1,1,1,1},{2,1,1,1},{3,1,1,1},{2,0,0,0},{1,1,1,0},{2,2,0,1}};
		int val[][] = solution(n, build_frame);
		for (int i = 0; i < val.length; i++) {
			int[] tem = val[i];
			System.out.println(Arrays.toString(tem));
		}

	}

	public static int[][] solution(int n, int[][] build_frame) {
		int[][] answer = {};

		if (n >= 5 && n <= 100) {
			answer = new int[build_frame.length][3];
			for (int one = 0; one < build_frame.length; one++) {
				int[] one_frame = build_frame[one];
				int [] tem_compare = new int[3];
				for (int two = 0; two < one_frame.length; two++) {
					
					int two_value = one_frame[two];
					
					
					if (two == 3) {
						if (two_value == 0) {
							
//							System.out.println(Arrays.toString(tem_compare));
							for (int del_one = 0; del_one < answer.length; del_one++) {
								int[] del_one_frame = answer[del_one];
								if (Arrays.equals(del_one_frame, tem_compare)) {
//									System.out.println(Arrays.toString(del_one_frame));
									answer[del_one] = null;
									break;
								}
							}
						}else {
							System.out.println("????");
							answer[one] = tem_compare;
						}
					}else {
//						answer[one][two] = two_value;
						tem_compare[two] = two_value;
					}
//					else if (two == 0) {
//						answer[one][two] = two_value;
//						tem_compare[two] = two_value;
//					} else if (two == 1) {
//						answer[one][two] = two_value;
//						tem_compare[two] = two_value;
//					} else if (two == 2) {
//						answer[one][two] = two_value;
//						tem_compare[two] = two_value;
//					}
					
				}
			}
		} else {
			System.out.println("limit over");
		}
		// 2차원 배열 정렬
//		Arrays.sort(answer, new Comparator<int[]>() {
//			@Override
//			public int compare(int[] o1, int[] o2) {
//				if (o1[0] == o2[0]) {
//					return o1[1] - o2[1];
//				} else {
//					return o1[0] - o2[0];
//				}
//			}
//		});
		return answer;
	}

}
