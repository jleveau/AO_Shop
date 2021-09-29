package shop;

import java.util.Date;

public class FoodProduct extends Product {
	
	private Date limitDate;

	public FoodProduct(String name, int quantity, Date limitDate) {
		super(name, quantity);
		this.limitDate = limitDate;
	}
	
	

}
