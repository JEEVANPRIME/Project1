package com.VectorTopics;

import java.util.Vector;

public class Sample2 {

	
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(10); 
		v1.add(20);
		v1.add(30);
		v1.add(40);
		System.out.println("before"+v1);
		v1.add(1,90);
		System.out.println("after"+v1);
		
	}
}
