package com.TreeSetTopic;

import java.util.TreeSet;

public class Sample5 {

	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		t1.add('a');
		t1.add('b');
		t1.add('e');
		t1.add('c');
		t1.add('d');
		if(t1.contains('e')) {
			t1.remove('d');
		}
		System.out.println(t1);
	}
}
