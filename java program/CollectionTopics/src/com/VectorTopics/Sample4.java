package com.VectorTopics;

import java.util.Vector;

public class Sample4 {
	
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		System.out.println("v1-->"+v1);
		Vector v2=new Vector();
		v2.add('A');
		v2.add('B');
		v2.add('C');
		System.out.println("v2-->"+v2);
		v1.addAll(1,v2);
		System.out.println("After adding");
		System.out.println("v1-->"+v1);
	}

}
