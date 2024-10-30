package com.CombineTopic;

class Admin{
	int size;
	int index; 
	static Object[] arr;
	public Admin(int size) {
		this.size=size;
		arr=new Object[size];
	}
	
	void add(Object obj) {
		if(arr.length>=size) { 
			resize();
		}
		arr[index]=obj;
		index++;
		
	}
	
	void resize() {
		size=size*3/2+1;
		Object[] newArr=new Object[size];
		for(int i=0;i<arr.length;i++) {
			newArr[i]=arr[i];
		}
		arr=newArr;
	}
}

public class Mainclass {

	public static void main(String[] args) {
		Admin a1=new Admin(5);
		a1.add(10);
		a1.add(20); 
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(60);
		a1.add(70);
		a1.add(80);
		a1.add(90);
		a1.add(100);
		a1.add(110);
		a1.add(120);
		a1.add(130);
		a1.add(90);
		a1.add(100);
		a1.add(110);
		a1.add(120);
		a1.add(130);
		for (Object o1 : Admin.arr) {
			if(o1!=null) {
			System.out.println(o1);
			}
		}
	}
}
