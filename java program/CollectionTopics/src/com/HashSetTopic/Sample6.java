package com.HashSetTopic;

import java.util.HashSet;

public class Sample6 {

	public static void main(String[] args) {
		HashSet h1=new HashSet();
		h1.add(5);
		h1.add(9);
		h1.add(4);
		h1.add(2);
		System.out.println(h1);
		for (Object a1 : h1) {
			isFact((int)a1);
		}
	}
	static void isFact(int no) {
		int fact=1;
		for (int i = no; i >=1; i--) {
			fact*=i;
		}
		System.out.println(fact);
	}
}
