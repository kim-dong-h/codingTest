package pattern.strategy.game;

public class DdPrizeMoney implements Prize{

	@Override
	public double percent() {
		double money = 1.5;
		return money;
	}

	@Override
	public double chance() {
		double chance = 0.07;
		return chance;
	}
	
	
}
