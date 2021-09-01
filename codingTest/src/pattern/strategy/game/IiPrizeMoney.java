package pattern.strategy.game;

public class IiPrizeMoney implements Prize{

	@Override
	public double percent() {
		double money = 2.0;
		return money;
	}

	@Override
	public double chance() {
		double chance = 0.02;
		return chance;
	}
	
	
}
