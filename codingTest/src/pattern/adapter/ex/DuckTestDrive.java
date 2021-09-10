package pattern.adapter.ex;

public class DuckTestDrive {

	public static void main(String[] args) {
		
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("turkey Say");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("duck Say");
		testDrive(duck);
		
		System.out.println("duck Adapter Say");
		testDrive(turkeyAdapter);
		
	}
	
	public static void testDrive(Duck duck) {
		duck.quack();
		duck.fly();
	}
	
}
