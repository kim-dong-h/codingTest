package pattern.factoryMethod.ex.headfirst;

public class NYStyleCheesePizza implements Pizza{

	@Override
	public void prepare() {
		System.out.println("NYCheesePizza prepare");
		
	}

	@Override
	public void bake() {
		System.out.println("NYCheesePizza bake");
		
	}

	@Override
	public void box() {
		System.out.println("NYCheesePizza Box setting");
		
	}

}
