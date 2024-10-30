package com.VectorTopics;

import java.util.Vector;

public class Sample8 {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add('A');
		v1.add(true);
		v1.add(9009);
		v1.add(90.282);
		v1.add("HIEE");
		v1.add("Ben");
		System.out.println(v1);
		System.out.println(v1.get(0));
		System.out.println(v1.get(1));
		System.out.println(v1.get(2));
		System.out.println(v1.get(3));
		System.out.println(v1.get(4));
		System.out.println(v1.get(5));
	}
}
