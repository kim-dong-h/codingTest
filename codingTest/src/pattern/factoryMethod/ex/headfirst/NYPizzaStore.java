package pattern.factoryMethod.ex.headfirst;

public class NYPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		if ("cheese".equals(type)) {
			return new NYStyleCheesePizza();
		}else if ("pepperoni".equals(type)) {
			return new NYStylePepperoniPizza();
		}
		return null;
	}

}
