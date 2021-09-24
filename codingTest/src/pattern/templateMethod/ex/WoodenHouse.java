package pattern.templateMethod.ex;

public class WoodenHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Building wooden Walls");

	}

	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with Wood coating");

	}

}
