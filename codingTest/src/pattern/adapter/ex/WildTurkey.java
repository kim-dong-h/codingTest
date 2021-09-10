package pattern.adapter.ex;

public class WildTurkey implements Turkey{

	@Override
	public void gobble() {
		System.out.println("Gobble gobble");
		
	}

	@Override
	public void fly() {
		System.out.println("i'm flying a short distance");
		
	}

	
	
}
