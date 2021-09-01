package pattern.strategy.game;

public class AaPrizeMoney implements Prize{

	@Override
	public double percent() {
		double money = 1.2;
		return money;
	}

	@Override
	public double chance() {
		double chance = 0.1;
		return chance;
	}

	
	
}
