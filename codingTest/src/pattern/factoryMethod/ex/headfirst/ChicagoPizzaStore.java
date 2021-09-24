package pattern.factoryMethod.ex.headfirst;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		if("cheese".equals(type)) {
			return new ChicagoStyleCheesePizza();
		}else if("pepperoni".equals(type)) {
			return new ChicagoStylePepperoniPizza();
		}
		return null;
	}

}
