package com.VectorTopics;

import java.util.Vector;

public class Sample5 {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add("Asia");
		v1.add("Europe");
		v1.add("Austrilia");
		v1.add("Korea");
		System.out.println(v1);
		v1.remove("Korea");
		System.out.println(v1);
		v1.remove(0);
		System.out.println(v1);
	}
}
