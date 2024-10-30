package com.CombineTopic;

import java.util.Arrays;

public class Cloth {

	Object[] arr;
	int size;
	public Cloth() {
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
		Cloth c1=new Cloth();
		c1.add("White");
		c1.add(799.38);
		c1.add("White");
		System.out.println(c1);
	}
	
	
}