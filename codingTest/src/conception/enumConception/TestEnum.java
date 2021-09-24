package conception.enumConception;

public class TestEnum {

	enum Company2 {SK, LG, KT, SAMSUNG, APPLE}
	
	public static void main(String[] args) {
		
		switchCompany(Company2.APPLE);
		
		
		for(Company type : Company.values()) {
			System.out.println(type);
		}
		
		System.out.println(Company.APPLE.ordinal());
		System.out.println(Company.APPLE.getValue());
	}
	
	public static void switchCompany(Company2 company2) {
		
		switch(company2) {
		case SK:
			System.out.println("sk");
			break;
		case KT:
			System.out.println("KT");
			break;
		case LG:
			System.out.println("LG");
			break;
		case SAMSUNG:
			System.out.println("SAMSUNG");
			break;
		case APPLE:
			System.out.println("apple");
			break;
		}
	}
	
}
