package pattern.adapter.ex;

public class MallardDuck implements Duck{

	@Override
	public void quack() {
		System.out.println("Quack");
		
	}

	@Override
	public void fly() {
		System.out.println("i'm flying");
		
	}

	
	
}
