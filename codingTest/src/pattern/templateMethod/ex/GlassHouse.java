package pattern.templateMethod.ex;

public class GlassHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Building Glass walls");

	}

	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with glass coating");

	}

}
