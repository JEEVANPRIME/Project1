package com.CombineTopic;

import java.util.Arrays;

public class Laptop {

	Object[] arr;
	int size;
	public Laptop() {
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
		Laptop l1=new Laptop();
		l1.add("Asus");
		l1.add(72650.38);
		l1.add("Gaming");
		System.out.println(l1);
	}
	
	
}
