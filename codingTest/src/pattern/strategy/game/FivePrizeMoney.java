package pattern.strategy.game;

public class FivePrizeMoney implements Prize{

	@Override
	public double percent() {
		double money = 1.5;
		return money;
	}
	
	@Override
	public double chance() {
		double chance = 0.06;
		return chance;
	}

	
	
}
