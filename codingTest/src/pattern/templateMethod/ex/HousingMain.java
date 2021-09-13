package pattern.templateMethod.ex;

public class HousingMain {

	public static void main(String[] args) {
		HouseTemplate template = new GlassHouse();
		template.buildHouse();
		
		System.out.println("*****************");
		
		template = new WoodenHouse();
		template.buildHouse();
		
	}
	
}
