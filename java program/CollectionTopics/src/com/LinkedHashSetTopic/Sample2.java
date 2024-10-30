package com.LinkedHashSetTopic;

import java.util.LinkedHashSet;

public class Sample2 {

	public static void main(String[] args) {
		LinkedHashSet l1=new LinkedHashSet();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		System.out.println(l1);
		LinkedHashSet l2=new LinkedHashSet();
		l2.add('a');
		l2.add('b');
		l2.add('c');
		System.out.println(l2);
		l1.addAll(l2);
		System.out.println(l1);
	}
}
