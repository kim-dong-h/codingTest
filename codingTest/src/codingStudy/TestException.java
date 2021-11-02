package codingStudy;

public class TestException {

	public static void main(String[] args) {
		
		 String [] arr = {"111","222","333","4444","aseae","5555","6666","77777","aaaa","8888"};
//        String [] arr = {"11","222","3333","44444","555555","6666666","77777777","888888888"};
		
        try {
        	numberEx(arr);			
		} catch (Exception e) {
			e.printStackTrace();
		}
        
		// 만약 메소드에 try catch를 걸지 않으면 프로그램이 강제 종료 된다. 
//		order();
//		receipt();
//		send();
	}
	
	public static void numberEx(String[] arr) throws Exception{
		
		for(String test:arr) {
			int value = Integer.parseInt(test);
			System.out.println(value);
		}
		
	}

	public static void order() {

		try {
			int j = 4 / 0;
			System.out.println("order");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void receipt() {

		try {
			System.out.println("receipt");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void send() {
		try {
			System.out.println("send");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
