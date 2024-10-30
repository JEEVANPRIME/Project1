package com.HashSetTopic;

import java.util.HashSet;

public class Sample2 {

	public static void main(String[] args) {
		HashSet h1=new HashSet();
		h1.add(10);
		h1.add(20);
		h1.add(30);
		System.out.println(h1);
		HashSet h2=new HashSet();
		h2.add('a');
		h2.add('b');
		h2.add('c');
		System.out.println(h2);
		h1.addAll(h2);
		System.out.println(h1);
	}
}
