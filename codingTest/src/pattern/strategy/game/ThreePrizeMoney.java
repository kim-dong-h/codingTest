package pattern.strategy.game;

public class ThreePrizeMoney implements Prize{

	@Override
	public double percent() {
		double money = 2.1;
		return money;
	}

	@Override
	public double chance() {
		double chance = 0.01;
		return chance;
	}
	
	
}
