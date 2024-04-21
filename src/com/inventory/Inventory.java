package com.inventory;

public class Inventory{
	protected String name;
	protected int quantity;
	protected float price;
	protected String category;
	protected boolean isAvail = true;
	
	public Inventory(){}
	protected Inventory(String name, int quantity, float price, String category){
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.category = category;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setAvail(boolean isAvail) {
		this.isAvail = isAvail;
	}
	public String getName() {
		return name;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public float getPrice() {
		return price;
	}
	
	public String getCategory() {
		return category;
	}
	
	public boolean isAvail() {
		if(this.quantity > 0)
			return isAvail;
		else
			this.isAvail = false;
			return isAvail;
	}
	
}