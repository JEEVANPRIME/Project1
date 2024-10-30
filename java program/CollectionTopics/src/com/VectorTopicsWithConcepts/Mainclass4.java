package com.VectorTopicsWithConcepts;

import java.util.Vector;

class TV {
	String brand;
	double cost;
	String type;

	public TV(String brand, double cost, String type) {
		super();
		this.brand = brand;
		this.cost = cost;
		this.type = type;
	}

	public String toString() {
		return "TV [brand=" + brand + ", cost=" + cost + ", type=" + type + "]";
	}
}

public class Mainclass4 {

	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add(new TV("Acer", 125000, "Flat"));
		v1.add(new TV("Sansui", 124590, "Box"));
		for (int i = 0; i < v1.size(); i++) {
			TV tv=(TV)v1.get(i);
			System.out.println(tv);
		}
	}
}
