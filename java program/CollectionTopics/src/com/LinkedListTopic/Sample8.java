package com.LinkedListTopic;

import java.util.LinkedList;

public class Sample8 {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(20);
	l1.add("hello");
	l1.add(true);
	l1.add('a');
	for(int i=0;i<l1.size();i++) {
		System.out.println(l1.get(i));
	}
}
}
