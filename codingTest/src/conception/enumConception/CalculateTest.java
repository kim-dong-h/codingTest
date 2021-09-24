package conception.enumConception;

public class CalculateTest {

	enum Vehicle{
		BUS(1500), AIRPLAN(10000), TEXI(4000);
		private int fee;
		
		Vehicle(int fee){
			this.fee = fee;
		}
		int calculateAmount(int person) {
			return fee * person;
		}
	}
	
	public static void main(String[] args) {
		int result = Vehicle.BUS.calculateAmount(3);
		System.out.println(result);
	}
	
}
