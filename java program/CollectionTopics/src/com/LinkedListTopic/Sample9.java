package com.LinkedListTopic;

import java.util.LinkedList;

public class Sample9 {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.add('a');
		l1.add(20);
		l1.add('b');
		l1.add(30);
		l1.add("hello");
		System.out.println(l1);
		LinkedList l2=new LinkedList();
		l2.add('a');
		l2.add('b');
		l2.add(1);
		l2.add('c');
		l2.add(30);
		l2.add("hello");
		System.out.println(l2);
		l1.removeAll(l2);
		System.out.println(l1);
	}
}
