package pattern.strategy.game;

public class EePrizeMoney implements Prize{

	@Override
	public double percent() {
		double money = 1.6;
		return money;
	}

	@Override
	public double chance() {
		double chance = 0.06;
		return chance;
	}
	
	
}
