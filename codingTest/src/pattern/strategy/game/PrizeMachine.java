package pattern.strategy.game;

public class PrizeMachine {

	private Prize prize;
	
	public double percent() {
		return prize.percent();
	}
	
	public void setPrizeStrategy(Prize prize) {
		this.prize = prize;
	}
	
}
