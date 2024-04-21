package com.entry;

import com.inventory.Inventory;

public class Entry extends Inventory{
	public Entry(String name, int quantity, float price, String category){
		super(name, quantity, price, category);
	}
	public void decreaseQuantity(int quantity){
		if(this.quantity - quantity >= 0) {
			this.quantity = this.quantity - quantity;
			System.out.println(this.name + " Quantity decrease "  + quantity);
		}
		else
			System.out.println(this.name + " Quantity cannot be decreased..");
	}
	public void increaseQuantity(int quantity){
		this.quantity = this.quantity + quantity;
		System.out.println(this.name + " Quantity increased by " + quantity);
	}
}
