package com.HashSetTopic;

import java.util.HashSet;

public class Sample8 {

	public static void main(String[] args) {
		HashSet h1=new HashSet();
		h1.add(10);
		h1.add(20);
		h1.add("hi");
		h1.add('a');
		h1.add('b');
		System.out.println(h1);
		
		HashSet h2=new HashSet();
		h2.add(20);
		h2.add(10);
		h2.add("hi");
		h2.add('a');
		System.out.println(h2);
		h1.containsAll(h2); 
		System.out.println(h1);
	}
}
