package com.LinkedListTopic;

import java.util.LinkedList;

public class Sample4{
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(55);
		l1.add(30);
		l1.add('A');
		l1.add("Hi");
		System.out.println(l1);
		LinkedList l2=new LinkedList();
		l2.add(95);
		l2.add(20);
		l2.add('b');
		l2.add("Hwooi");
		System.out.println(l2);
		l1.addAll(2,l2);
		System.out.println(l1);
	}

}
