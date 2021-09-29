package shop;

import java.util.UUID;

public class Product {
	private String name;
	private UUID id;
	private int quantity;
	
	public Product(String name, int quantity) {
		this.id = UUID.randomUUID();
		this.name = name;
		this.quantity = quantity;
	}
	
	public String toString() {
		return this.id.toString() + " : " + this.name + " : " + this.quantity;
	}
	
}
