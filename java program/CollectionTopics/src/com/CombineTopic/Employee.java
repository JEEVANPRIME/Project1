package com.CombineTopic;

import java.util.Arrays;

public class Employee {

	Object[] arr;
	int size;
	public Employee() {
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
		Employee e1=new Employee();
		e1.add(178);
		e1.add(22500.38);
		e1.add('A');
		System.out.println(e1);
	}
	
	
}
