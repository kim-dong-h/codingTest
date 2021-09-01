package pattern.strategy.game;

public class BbPrizeMoney implements Prize{

	@Override
	public double percent() {
		double money = 1.3;
		return money;
	}
	@Override
	public double chance() {
		double chance = 0.09;
		return chance;
	}

	
	
}
