package pattern.strategy.game;

public class GgPrizeMoney implements Prize{

	@Override
	public double percent() {
		double money = 1.8;
		return money;
	}

	@Override
	public double chance() {
		double chance = 0.04;
		return chance;
	}
	
	
}
