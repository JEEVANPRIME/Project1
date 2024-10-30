package com.HashSetTopic;

import java.util.HashSet;

public class Sample7 {

	public static void main(String[] args) {
		HashSet h1=new HashSet();
		h1.add(10);
		h1.add(20);
		h1.add("hi");
		h1.add('a');
		h1.add('b');
		System.out.println(h1);
		
		HashSet h2=new HashSet();
		h2.add(30);
		h2.add(40);
		h2.add("hi");
		h2.add('a');
		System.out.println(h2);
		h1.removeAll(h2);
		System.out.println(h1);
	}
}
