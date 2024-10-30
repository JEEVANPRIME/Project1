package com.VectorTopics;

import java.util.Vector;

public class Sample11 {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add('A');
		v1.add('B');
		v1.add("hello");
		System.out.println("v1-->"+v1);
		Vector v2=new Vector();
		v2.add(40);
		v2.add('A');
		v2.add('B');
		v2.add(50);
		v2.add(60);
		v2.add("hello");
		System.out.println("v2-->"+v2);
		v1.retainAll(v2);
		System.out.println("v1-->"+v1);
		System.out.println("v2-->"+v2);
	}
}
