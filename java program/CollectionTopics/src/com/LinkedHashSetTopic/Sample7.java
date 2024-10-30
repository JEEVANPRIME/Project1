package com.LinkedHashSetTopic;

import java.util.LinkedHashSet;

public class Sample7 {

	public static void main(String[] args) {
		LinkedHashSet l1=new LinkedHashSet();
		l1.add(10);
		l1.add(20);
		l1.add(3);
		l1.add('a');
		LinkedHashSet l2=new LinkedHashSet();
		l2.add(4);
		l2.add(3);
		l2.add('a');
		l1.removeAll(l2);
		System.out.println(l1);
	}
}
