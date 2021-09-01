package pattern.strategy.game;

public class OnePrizeMoney implements Prize{

	@Override
	public double percent() {
		double money = 3;
		return money;
	}
	
	@Override
	public double chance() {
		double chance = 0.006;
		return chance;
	}

	
	
}
