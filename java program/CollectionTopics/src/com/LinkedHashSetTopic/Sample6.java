package com.LinkedHashSetTopic;

import java.util.LinkedHashSet;

public class Sample6 {

	public static void main(String[] args) {
		LinkedHashSet l1=new LinkedHashSet();
		l1.add(1);
		l1.add(4);
		l1.add(3);
		l1.add(6);
		System.out.println(l1);
		for (Object a1 : l1) {
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
