package com.CombineTopic;


public class Car {

	Object[] arr;
	int size;
	public Car() {
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
		Car c1=new Car();
		c1.add("i20");
		c1.add(625000);
		c1.add("White");
		System.out.println(c1);
	}
	
	
}
