package com.technoelevate.collection.groceryshoppingcart;

import java.util.ArrayList;
import java.util.ListIterator;

public class Item {
	String product;
	int quantity;
	int price;
	
	
	public Item(String product, int quantity, int price) {
		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}
	public String getProduct() {
		return this.product;
	}
	public double getQuantity() {
		return this.quantity;
	}
	public double getPrice() {
		return this.price;
	}
	
	
	
	
	

}
