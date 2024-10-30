package com.CombineTopic;

import java.util.Arrays;

public class Bike {

	Object[] arr;
	int size;
	public Bike() {
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
		Bike b1=new Bike();
		b1.add("Hero");
		b1.add(67250.38);
		b1.add("White");
		System.out.println(b1);
	}
	
	
}
