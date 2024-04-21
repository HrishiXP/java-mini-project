package com.report;

import com.entry.Entry;

public class Report extends Entry{
	public Report(String name, int quantity, float price, String category){
		super(name, quantity, price, category);
	}
	public void getReports() {
		System.out.println("------------Product report---------");
		System.out.println("Name: " + this.getName());
		System.out.println("Price: " + this.getPrice());
		System.out.println("Quantity: " + this.getQuantity());
		System.out.println("Availability: " + this.isAvail());
	}
	
}
