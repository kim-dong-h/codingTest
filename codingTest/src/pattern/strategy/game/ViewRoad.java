package pattern.strategy.game;

import java.util.Random;

public class ViewRoad {

	public static void main(String[] args) {
		ViewRoad r = new ViewRoad();
		r.gameGO(3);
	}

	public int randomInt() {

		int answer = 0;

		return answer;

	}

	public int gameGO(int lineCount) {

		int money = 0;

		PrizeMachine numberMachine = new NumberPrize();
		PrizeMachine spellingMachine = new SpellingPrize();

		Random random = new Random();

		String[][] gameFan = new String[lineCount][lineCount];

		for (int i = 0; i < gameFan.length; i++) {
			String[] oneDepth = gameFan[i];
			for (int j = 0; j < oneDepth.length; j++) {
				int numberRandom = random.nextInt(5) + 1; // 1~5
				int spellRandom = random.nextInt(2) + 65; // a~e
				gameFan[i][j] = String.valueOf((char) spellRandom);
				System.out.print(" " + gameFan[i][j]);
			}
			System.out.println("");
		}

		int diagonalCountLeft = 0; // 대각선 카운트
		int diagonalCountRight = 0;
		for (int i = 0; i < gameFan.length; i++) {
			int vCount = 0; // 수직 카운트
			int hCount = 0; // 수평 카운트
			for (int j = 0; j < gameFan.length - 1; j++) {
				if (gameFan[i][j].equals(gameFan[i][j + 1])) {
					hCount++;
				}
				if (gameFan[j][i].equals(gameFan[j + 1][i])) {
					vCount++;
				}
				if (i < gameFan.length - 1) {
					// 대각선 왼쪽 비교
					if (i == j) {
						if (gameFan[i][j].equals(gameFan[i + 1][j + 1])) {
							diagonalCountLeft++;
						}
					}
					// 대각선 오른쪽 비교 
					
				}
			}
			System.out.println(diagonalCountLeft);
			if (hCount == gameFan.length - 1) {
				System.out.println("가로 빙고 " + (i + 1) + " 번째 줄 빙고");
			}
			if (vCount == gameFan.length - 1) {
				System.out.println("세로 빙고 " + (i + 1) + " 번째 줄 빙고");
			}
		}
		if (diagonalCountLeft == gameFan.length - 1) {
			System.out.println("대각선 빙고 1 번째");
		}
		return money;
	}

}
