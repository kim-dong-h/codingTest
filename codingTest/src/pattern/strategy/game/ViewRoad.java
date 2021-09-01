package pattern.strategy.game;

import java.util.Random;

public class ViewRoad {

	public static void main(String[] args) {
		ViewRoad r = new ViewRoad();
		r.gameGO();
	}

	public int gameGO() {

		int money = 0;

		PrizeMachine numberMachine = new NumberPrize();
		PrizeMachine spellingMachine = new SpellingPrize();

		Random random = new Random();

		String[][] gameFan = new String[3][3];

		System.out.println(gameFan.length);

		for (int i = 0; i < gameFan.length; i++) {
			String[] oneDepth = gameFan[i];
			for (int j = 0; j < oneDepth.length; j++) {
				int numberRandom = random.nextInt(5) + 1; // 1~5
				int spellRandom = random.nextInt(5) + 65; // a~e
				gameFan[i][j] = String.valueOf((char) spellRandom);
				System.out.print(" " + gameFan[i][j]);
			}
			System.out.println("");
		}

		String vTemp = "";
		for (int i = 0; i < gameFan.length; i++) {
			int vCount = 0; // 수직 카운트
			int hCount = 0; // 수평 카운트
			if (vTemp.equals("")) {
				vTemp = gameFan[i][0];
			}
			if (vTemp.equals(gameFan[i][0])) {
				vCount++;
				for (int j = 0; j < gameFan.length - 1; j++) {
					if (gameFan[i][j].equals(gameFan[i][j + 1])) {
						hCount++;
					}
				}
				if (hCount == 2) {
					System.out.println(i + "번째 줄 빙고");
				}
				if (vCount == 2) {
					System.out.println();
				}
			}
		}
		return money;
	}

}
