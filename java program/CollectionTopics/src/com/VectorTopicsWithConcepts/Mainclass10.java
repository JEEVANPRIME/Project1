package com.VectorTopicsWithConcepts;

import java.util.Vector;

class Cloth{
	String color;
	String size;
	double cost;
	public Cloth(String color, String size, double cost) {
		super();
		this.color = color;
		this.size = size;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Cloth [color=" + color + ", size=" + size + ", cost=" + cost + "]";
	}
	
}


public class Mainclass10 {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(new Cloth("Blue", "M", 799.99));
		v1.add(new Cloth("White", "XL", 599.99));
		for (int i = 0; i < v1.size(); i++) {
			Cloth cloth=(Cloth)v1.get(i);
			System.out.println(cloth);
		}
	}
}
