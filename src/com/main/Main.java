package com.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.entry.Entry;
import com.inventory.Inventory;
import com.report.Report;


public class Main {
	//private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Report> list= new ArrayList<>();
		Report tv = new Report("tv", 20, 34563.45f, "Electronics");
		list.add(tv);
		tv.increaseQuantity(10);
		Report mob = new Report("mobile", 10, 32563.45f, "Electronics");
		list.add(mob);
		mob.decreaseQuantity(10);
		
		for (Report obj: list) {
			obj.getReports();
		}
		
	}
}
