package com.CombineTopic;

import java.util.Arrays;

public class Course {

	Object[] arr;
	int size;
	public Course() {
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
		Course c1=new Course();
		c1.add("ECE");
		c1.add("VTU");
		c1.add(1750);
		System.out.println(c1);
	}
	
	
}
