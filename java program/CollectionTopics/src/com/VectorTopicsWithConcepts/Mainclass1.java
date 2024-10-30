package com.VectorTopicsWithConcepts;

import java.util.Vector;

class Mobile{
	String name;
	double cost;
	String color;
	public Mobile(String name, double cost, String color) {
		super();
		this.name = name;
		this.cost = cost;
		this.color = color;
	}
	
	public String toString() {
		return this.name+", "+this.cost+", "+this.color;
	}
	
	
}
public class Mainclass1 {
	
	public static void main(String[] args) {

		Mobile m1=new Mobile("Galaxy A31", 17890.43, "Blue");
		Mobile m2=new Mobile("Oppo 16", 20012.43, "Black");
		Mobile m3=new Mobile("Vivo 36", 50121.43, "Silver");
		
		Vector v1=new Vector();
		v1.add(m1);
		v1.add(m2);
		v1.add(m3);
		
		for(int i=0;i<v1.size();i++) {
//			Object x=v1.get(i);
			Mobile mob=(Mobile)v1.get(i); 
			System.out.println(mob);
		}
	}

}
