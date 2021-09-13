package pattern.factoryMethod.ex.headfirst;

public class ChicagoStylePepperoniPizza implements Pizza{

	@Override
	public void prepare() {
		System.out.println("Chicago Pepperoni prepare");
		
	}

	@Override
	public void bake() {
		System.out.println("Chicago Pepperoni Bake Check");
		
	}

	@Override
	public void box() {
		System.out.println("Chicago Pepperoni Box Setting");
		
	}

	
	
}
