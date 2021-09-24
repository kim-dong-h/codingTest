package pattern.factoryMethod.ex.headfirst;

public class ChicagoStyleCheesePizza implements Pizza{

	@Override
	public void prepare() {
		System.out.println("Chicago Cheese Pizza Prepare");
		
	}

	@Override
	public void bake() {
		System.out.println("chicago Cheese bake check");
		
	}

	@Override
	public void box() {
		System.out.println("chicago Cheese Box setting");
		
	}

}
