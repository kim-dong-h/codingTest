package pattern.factoryMethod.ex.headfirst;

public class PizzaMain {

	public static void main(String[] args) {
		
		PizzaStore nyStyle = new NYPizzaStore();
		
		Pizza nyPizza = nyStyle.orderPizza("cheese");
		
	}
	
}
