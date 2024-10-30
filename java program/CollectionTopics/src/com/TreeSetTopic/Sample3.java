package com.TreeSetTopic;

import java.util.TreeSet;

public class Sample3 {

	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		t1.add("hello");
		t1.add("alpha");
		t1.add("bard");
		t1.remove("bard");
		System.out.println(t1);
	}
}
