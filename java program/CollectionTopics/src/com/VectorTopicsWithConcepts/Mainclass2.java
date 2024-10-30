package com.VectorTopicsWithConcepts;

import java.util.Vector;

class Car{
	String name;
	double cost;
	String type;
	public Car(String name, double cost, String type) {
		super();
		this.name = name;
		this.cost = cost;
		this.type = type;
	}
	
	public String toString() {
		return this.name+" "+this.cost+" "+this.type; 
	}
}

public class Mainclass2 {

	public static void main(String[] args) {
		Car c1=new Car("i20", 652511.11, "Petrol");
		Car c2=new Car("Truck", 124586.22, "Disel");
		
		Vector v1=new Vector();
		v1.add(c1);
		v1.add(c2); 
		
		for (int i = 0; i < v1.size(); i++) {
			Car car=(Car) v1.get(i);
			System.out.println(car);
		}
	}
}
