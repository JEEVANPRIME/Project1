package com.HashSetTopic;

import java.util.HashSet;

public class Sample3 {

	public static void main(String[] args) {
		HashSet h1=new HashSet();
		h1.add("add");
		h1.add(10);
		h1.add("chess");
		h1.add("carrom");
		h1.remove(10);
		System.out.println(h1);
	}
}
