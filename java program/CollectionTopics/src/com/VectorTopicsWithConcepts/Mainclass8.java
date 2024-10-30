package com.VectorTopicsWithConcepts;

import java.util.Vector;

class Home{
	String name;
	String color;
	double cost;
	public Home(String name, String color, double cost) {
		super();
		this.name = name;
		this.color = color;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Home [name=" + name + ", color=" + color + ", cost=" + cost + "]";
	}
}

public class Mainclass8 {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(new Home("Star", "Yellow", 25625000));
		v1.add(new Home("Bye", "White", 12323240));
		for (int i = 0; i < v1.size(); i++) {
			Home home=(Home)v1.get(i);
			System.out.println(home);
		}
	}
}
