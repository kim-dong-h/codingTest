package codingStudy;

import java.util.Scanner;

public class CoinChangeProblem {

	private int n;

	private int k;

	private int[] coin;

	public CoinChangeProblem() {

	}

	public CoinChangeProblem(int n, int k, int[] coin) {
		this.n = n;
		this.k = k;
		this.coin = coin;
	}

	public int coinChangeDP(int n, int k, int[] Coin) {

		int answer = 0;
		int forCheck = 0;
		int D[] = new int[k + 1]; // 15 + 1
		for (int d = 1; d <= k; d++) { // 15 거스름
			D[d] = -1;
			for (int c = 0; c < n; c++) { // 3 동전 개수
				forCheck++;
				if (Coin[c] <= d) { // 1, 2, 3 // 배열의 값을 마이너스로 설정 하지 않기 위해
					if (D[d - Coin[c]] < 0)
						continue;

					if (D[d] < 0)
						D[d] = D[d - Coin[c]] + 1;
					else if (D[d - Coin[c]] + 1 < D[d])
						D[d] = D[d - Coin[c]] + 1;
				}
			}
		}
		System.out.println("for Count = " + forCheck);
		for(int t=0;t < D.length; t++) {
			System.out.println("value = " + D[t]);
		}
		System.out.println(D[k]);
		answer = D[k];
		return answer;
	}

	// 정답인거 같은데 
	public int coinChangeMY2(int n, int k, int[] coin) {
		int answer = 0;
		int tempK = k;
		int forCheck = 0;
		int check = 0;
		for(int i=0; i < k; i++) {
			int bigMoney = -1;
			int jTempCount = 0;
			for(int j=0; j < n -1; j++) {
				forCheck++;
				if (tempK < coin[j]) continue;
				if(coin[j] != 0 && coin[j+1] != 0) {
					if(coin[j] < coin[j+1]) {
						bigMoney = coin[j+1];
						jTempCount = j+1;
					}else {
						bigMoney = coin[j];
						jTempCount = j;
					}					
				}
			}
			if(bigMoney == -1) {
				if(tempK !=0) {
					answer = -1;
				}
				break;
			}
			if(tempK != 0) {
				if(tempK < bigMoney) {
					coin[jTempCount] = 0;
				}else {
					tempK = tempK - bigMoney;
					answer++;
				}
			}
		}
		System.out.println("check = "+ check);
		System.out.println("for Count = "+forCheck);
		System.out.println(answer);
		return answer;
	}
	
	// 실패 
	public int coinChangeMY(int n, int k, int[] coin) {
		int answer = 0;
		int timeCheck = 0;
		int tempK = k;

		for (int i = 0; i <= k; i++) {
			int bigNum = 0;
			int jTempForCount = -1;
			boolean namergeBool = false;
			for (int j = 0; j < n - 1; j++) {
				timeCheck++;
				if(coin[j] > 0) {
					if (tempK < coin[j]) {
						namergeBool = true; 
						continue;
					}
					namergeBool = false;
					if (coin[j] < coin[j + 1]) {
						bigNum = coin[j + 1];
						jTempForCount = j + 1;
					} else {
						bigNum = coin[j];
						jTempForCount = j;
					}										
				}else {
					System.out.println("??? coin -1");
					return -1;
				}
			}
			if(namergeBool) {
				System.out.println("??? bool");
				return -1;
			}
			if( tempK < bigNum) {
				coin[jTempForCount] = 0;
			}else {
				tempK = tempK - bigNum;
//				TODO 이부분이 잘 못 된거 같은데 
				if(tempK != 0 ) {
					coin[jTempForCount] = 0;
					answer++;
				}else {
					break;
				}
			}

		}
		System.out.println("for Count = " +timeCheck);
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		// bottom-up function
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // 가진 동전의 개수
		int k = scanner.nextInt(); // 거스름돈 가격

		int Coin[] = new int[n];
		for (int d = 0; d < n; d++) {
			Coin[d] = scanner.nextInt(); // 동전의 단위 1,2,3
		}

		CoinChangeProblem ccp = new CoinChangeProblem();

		long beforeTime = System.currentTimeMillis();
		
		ccp.coinChangeDP(n, k, Coin);
		long afterTime = System.currentTimeMillis();
		
		long timeCheck = afterTime - beforeTime;
		System.out.println("time diff = " +timeCheck);
		
		System.out.println("");
		System.out.println("=========== MY  ==============");
		System.out.println("");
		
		long beforeTime2 = System.currentTimeMillis();

		ccp.coinChangeMY2(n, k, Coin);
		long afterTime2 = System.currentTimeMillis();

		long timeCheck2 = afterTime2 - beforeTime2;
		System.out.println("time diff2 = " + timeCheck2);

//		timeCheckUtil(ccp);

	}

	public static long timeCheckUtil(CoinChangeProblem ccp) {
		long timeCheck = 0;

		long beforeTime = System.currentTimeMillis();

//		ccp.coinChangeMY();
		long afterTime = System.currentTimeMillis();

		timeCheck = afterTime - beforeTime;
		System.out.println("time diff = " + timeCheck);

		return timeCheck;
	}

}
