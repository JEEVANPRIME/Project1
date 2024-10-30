package com.VectorTopicsWithConcepts;

import java.util.Vector;

class Laptop{
	String type;
	String color;
	double cost;
	public Laptop(String type, String color, double cost) {
		super();
		this.type = type;
		this.color = color;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Laptop [type=" + type + ", color=" + color + ", cost=" + cost + "]";
	}
}

public class Mainclass7 {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(new Laptop("Gaming", "Black", 72880.25));
		v1.add(new Laptop("Commercial", "White", 25650.12));
		for (int i = 0; i < v1.size(); i++) {
			Laptop laptop=(Laptop)v1.get(i);
			System.out.println(laptop);
		}
	}
}
