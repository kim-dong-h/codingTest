package pattern.strategy.game;

public class TwoPrizeMoney implements Prize{

	@Override
	public double percent() {
		double money = 2.5;
		return money;
	}

	@Override
	public double chance() {
		double chance = 0.006;
		return chance;
	}
	
	
}
