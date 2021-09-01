package pattern.strategy.game;

public class CcPrizeMoney implements Prize{

	@Override
	public double percent() {
		double money = 1.4;
		return money;
	}

	@Override
	public double chance() {
		double chance = 0.08;
		return chance;
	}
	
	
}
