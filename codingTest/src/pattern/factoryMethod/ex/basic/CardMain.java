package pattern.factoryMethod.ex.basic;

import java.util.List;

public class CardMain {

	public static void main(String[] args) {
		
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("이순신");
		Product card2 = factory.create("홍길동");
		Product card3 = factory.create("강감찬");
		
		card1.use();
		card2.use();
		card3.use();
		
		List<String> registers = ((IDCardFactory) factory).getOwners();
		
		System.out.println(registers.size());
	}
	
}
