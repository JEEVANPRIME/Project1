package com.LinkedListTopic;

import java.util.LinkedList;

public class Sample7 {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add("hello");
		l1.add('a');
		System.out.println(l1);
		if(l1.contains('a')) {
			l1.remove("hello");
		}
		System.out.println(l1);
	}
}
