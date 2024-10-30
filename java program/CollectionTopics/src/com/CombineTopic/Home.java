package com.CombineTopic;

import java.util.Arrays;

public class Home {

	Object[] arr;
	int size;
	public Home() {
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
		Home h1=new Home();
		h1.add("Star");
		h1.add(176875.38);
		h1.add("Yellow");
		System.out.println(h1);
	}
	
	
}
