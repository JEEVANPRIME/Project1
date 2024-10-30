package com.LinkedListTopic;

import java.util.LinkedList;

public class Sample10 {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(2);
		l1.add(5);
		l1.add(6);
		l1.add(4);
		for(int i=0;i<l1.size();i++) {
			isFact((int)l1.get(i));
		}
	}
	static void isFact(int no) {
		int fact=1;
		for(int i=no;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
