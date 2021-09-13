package pattern.factoryMethod.ex.headfirst;

/**
 * creator이 주체 클래스가 되는 방
 * @author kim
 *
 */
public abstract class PizzaStore{

	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.box();
		return pizza;
	}
	
	public abstract Pizza createPizza(String type);

}
