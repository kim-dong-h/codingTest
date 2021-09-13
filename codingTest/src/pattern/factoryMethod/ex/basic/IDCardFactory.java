package pattern.factoryMethod.ex.basic;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {

	private List<String> owners = new ArrayList<String>();
	
	@Override
	public Product createProduct(String owner) {
		
		return new IDCard(owner);
	}

	@Override
	public void registerProduct(Product p) {
		owners.add(((IDCard) p).getOwner());

	}
	
	public List<String> getOwners(){
		return owners;
	}

}
