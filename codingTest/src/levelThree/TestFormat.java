package levelThree;

public class TestFormat {

	public static void main(String[] args) {
		
		//[[-20, 15], [-14, -5], [-18, -13], [-5, -3]]
		int[][] routers = {{-20,15},{-14,-5},{-18,-13},{-5,-3}};
		
		int value = solution(routers);
		System.out.println(value);
	}

	public static int solution(int[][] routes) {
		
		int answer = 1;
		
		int routersLen = routes.length;
		
		if(routersLen >= 1 && 10000 >= routersLen) {
			for(int i = 0; i < routersLen -1; i++) {
				int start = routes[i][0];
				int end  = routes[i][1];
			}
			
		}
		
//		if(routersLen >= 1 && 10000 >= routersLen) {
//			for(int i = 0; i < routersLen -1; i++) {
//				int first = routes[i][0];
//				int second = routes[i][1];
//				for(int j = 1; j < routersLen; j++) {
//					int jFirst = routes[j][0];
//					int jSecond = routes[j][1];
//					if (!(first <= jFirst && jFirst <= second)) {
//						if(!(first <= jSecond && jSecond <= second)) {
//							answer++;
//						}
//					}
//				}
//			}			
//		}
		
		
		return answer;
	}
}
