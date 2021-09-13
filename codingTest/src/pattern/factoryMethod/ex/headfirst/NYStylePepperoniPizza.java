package pattern.factoryMethod.ex.headfirst;

public class NYStylePepperoniPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("NYPepperoni prepare");

	}

	@Override
	public void bake() {
		System.out.println("NYPepperoni bake");

	}

	@Override
	public void box() {
		System.out.println("NYPepperoni box setting");

	}

}
