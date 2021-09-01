package pattern.strategy.game;

public class KkPrizeMoney implements Prize{

	@Override
	public double percent() {
		double money = 2.2;
		return money;
	}

	@Override
	public double chance() {
		double chance = 0.01;
		return chance;
	}
	
	
}
