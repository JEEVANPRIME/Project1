package com.VectorTopics;

import java.util.Vector;

public class Sample7 {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add("Cricket");
		v1.add("FootBall");
		v1.add("Chess");
		v1.add("BasketBall");
		v1.add("Carrom");
		System.out.println(v1);;
		if(v1.contains("Carrom")) {
			v1.remove("Carrom");
		}
		System.out.println(v1);
	}
}
