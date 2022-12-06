package com.boydlever.models;

public class Fruit {
	private String name;
	private double price;
	// empty constructor
	public Fruit() {}
	// another constructor using name and price
	public Fruit(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	//getter and setter like normal OOP
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
