package com.HashSetTopic;

import java.util.HashSet;

public class Sample5 {

	public static void main(String[] args) {
		HashSet h1=new HashSet();
		h1.add(10);
		h1.add(20.56);
		h1.add("hello");
		if(h1.contains("hello")) {
			h1.remove("hello");
		}
		System.out.println(h1);
	}
}
