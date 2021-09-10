package pattern.strategy.game;

import java.util.Scanner;

public class ClientStart {

	public static void main(String[] args) {
		
		boolean stop = true;
		
		ViewRoad viewRoad = new ViewRoad();
		
		long totalM = Runtime.getRuntime().totalMemory() / 1024 /1024;
		
		System.out.println(totalM + "MB");
		
		long preUseMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		
		System.out.println("충전 금액을 입력하세요");
		Scanner totalScan = new Scanner(System.in);		
		
		int totalMoney = totalScan.nextInt();
		
		System.out.println("x축 금액을 적으세요");
		
		Scanner xScan = new Scanner(System.in);
		int xMoney = xScan.nextInt();
		
		System.out.println("y축 금액을 적으세요");
		Scanner yScan = new Scanner(System.in);
		int yMoney = yScan.nextInt();

		while(stop) {
			
			viewRoad.gameGO(3);
			
			Scanner gameCommandScan = new Scanner(System.in);
			int gameCommand = gameCommandScan.nextInt();
			
			if(gameCommand == 4) {
				stop = false;
			}
		}
		long aftUseMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		
		long useMemory = (aftUseMemory - preUseMemory) / 1024 / 1024;
		
		System.out.println( "사용 메모리 = "+useMemory +"MB");
		
		
	}
	
}
