package com.TreeSetTopic;

import java.util.TreeSet;

public class Sample7 {

	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		t1.add(10);
		t1.add(20);
		t1.add(90);
		t1.add(50);
		System.out.println(t1);
		TreeSet t2=new TreeSet();
		t2.add(40);
		t2.add(10);
		t2.add(50);
		System.out.println(t2);
		t1.removeAll(t2);
		System.out.println(t1);
	}
}
