package com.TreeSetTopic;

import java.util.TreeSet;

public class Sample2 {

	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		t1.add(10);
		t1.add(90);
		t1.add(20);
		t1.add(5);
		System.out.println(t1);
		TreeSet t2=new TreeSet();
		t2.add(90);
		t2.add(70);
		t2.add(80);
		t2.add(60);
		System.out.println(t2);
		t1.addAll(t2);
		System.out.println(t1);
	}
}
