package pattern.strategy.game;

public class HhPrizeMoney implements Prize{

	@Override
	public double percent() {
		double money = 1.9;
		return money;
	}

	@Override
	public double chance() {
		double chance = 0.03;
		return chance;
	}
	
}
