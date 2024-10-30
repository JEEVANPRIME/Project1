package com.TreeSetTopic;

import java.util.TreeSet;

public class Sample6 {

	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		t1.add(10);
		t1.add(2);
		t1.add(5);
		t1.add(3);
		System.out.println(t1);
		for (Object a1 : t1) {
			isFact((int)a1);
		}
	}
	static void isFact(int no) {
		int fact=1;
		for(int i=no;i>=1;i--) {
			fact*=i;
		}
		System.out.println(fact);
	}
}
