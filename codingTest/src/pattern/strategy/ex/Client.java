package pattern.strategy.ex;

public class Client {

	public static void main(String[] args) {
		
		Moving bus = new Bus();
		Moving train = new Train();
		
		bus.setMovableStrategy(new Load());
		bus.move();
		
		train.setMovableStrategy(new RailLoad());
		train.move();
		
	}
	
}
