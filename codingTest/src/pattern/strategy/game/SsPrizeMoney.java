package pattern.strategy.game;

public class SsPrizeMoney implements Prize{

	@Override
	public double percent() {
		double money = 4.2;
		return money;
	}

	@Override
	public double chance() {
		double chance = 0.001;
		return chance;
	}
	
	
}
