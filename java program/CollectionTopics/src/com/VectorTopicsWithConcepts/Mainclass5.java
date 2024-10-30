package com.VectorTopicsWithConcepts;

import java.util.Vector;

class Bike{
	String brand;
	double cost;
	String color;
	public Bike(String brand, double cost, String color) {
		super();
		this.brand = brand;
		this.cost = cost;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", cost=" + cost + ", color=" + color + "]";
	}
}

public class Mainclass5 {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(new Bike("Splender", 62500.29, "Black"));
		v1.add(new Bike("Activa 3G", 67250.12, "White"));
		for (int i = 0; i < v1.size(); i++) {
			Bike bike=(Bike)v1.get(i);
			System.out.println(bike);
		}
		}
	}

