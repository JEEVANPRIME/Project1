package com.CombineTopic;

import java.util.Arrays;

public class Mobile {

	Object[] arr;
	int size;
	public Mobile() {
		arr=new Object[10];
		size=0;
	}
	public void add(Object obj) {
		arr[size++]=obj;
	}
	@Override
	public String toString() {
		StringBuilder s1=new StringBuilder();
		s1.append("[");
		for(int i=0;i<size;i++) {
			s1.append(arr[i]+", ");
		}
		s1.append("]");
		return s1.toString();
	}
	
	public static void main(String[] args) {
		Mobile m1=new Mobile();
		m1.add("A31");
		m1.add(17687.38);
		m1.add("Blue");
		System.out.println(m1);
	}
	
	
}
