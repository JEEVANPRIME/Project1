package com.LinkedHashSetTopic;

import java.util.LinkedHashSet;

public class Sample3 {

	public static void main(String[] args) {
		LinkedHashSet l1=new LinkedHashSet();
		l1.add(10);
		l1.add("hi");
		l1.add('a');
		l1.remove('a');
		System.out.println(l1);
	}
}
