package com.LinkedHashSetTopic;

import java.util.LinkedHashSet;

public class Sample5 {

	public static void main(String[] args) {
		LinkedHashSet l1 =new LinkedHashSet();
		l1.add(10);
		l1.add("hello");
		l1.add('a');
		if(l1.contains("hello")) {
			l1.remove('a');
		}
		System.out.println(l1);
	}
}
