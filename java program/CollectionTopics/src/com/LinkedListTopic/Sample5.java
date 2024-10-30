package com.LinkedListTopic;

import java.util.LinkedList;

public class Sample5 {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(20);
		l1.add("hello");
		l1.add('a');
		l1.add(true);
		l1.add(10.26);
		System.out.println(l1);
		l1.remove("hello");
		System.out.println(l1);
		l1.remove(2);
		System.out.println(l1);
		l1.remove();
		System.out.println(l1);
	}
}
