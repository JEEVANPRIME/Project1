package com.CombineTopic;

import java.util.Arrays;

public class TV {

	Object[] arr;
	int size;
	public TV() {
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
		TV t1=new TV();
		t1.add("Acer");
		t1.add("Flat");
		t1.add(27526.20);
		System.out.println(t1);
	}
	
	
}
