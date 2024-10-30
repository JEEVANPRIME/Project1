package com.VectorTopics;

import java.util.Vector;

public class Sample9 {

	static void isFact(int no) {
		int fact = 1;
		for (int i = no; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add(5);
		v1.add(2);
		v1.add(6);
		v1.add(2);
		System.out.println(v1);
		isFact((int) v1.get(0));
		isFact((int) v1.get(1));
		isFact((int) v1.get(2));
		isFact((int) v1.get(3)); 
	}
}
