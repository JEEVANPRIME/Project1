package com.CombineTopic;

class Listing{
	Object[] arr;
	int size;
	public Listing() {
		arr=new Object[10];
		size=0;
	}
	
	void resize() {
		int x=size*2;
		Object[] newArr=new Object[x];
		System.arraycopy(arr, 0, newArr, 0, arr.length);
		arr=newArr;
	}
	
	void add(Object obj) {
		if(size>=arr.length) {
			resize();
		}
		arr[size++]=obj;
	}
	
	Object remove(int index) {
		Object removed=arr[index];
		arr[index]=null;
		System.arraycopy(arr, index+1, arr, index, arr.length-index-1);
		size--;
		return removed;
	}
	
	public String toString() {
		StringBuilder s1=new StringBuilder();
		s1.append("[");
		for(int i=0;i<size;i++) {
			s1.append(arr[i]+", ");
		}
		s1.append("]");
		return s1.toString();
	}
}

public class ShoesStore {

	public static void main(String[] args) {
	Listing shoe=new Listing();
	shoe.add("Sneakers");
	shoe.add("Puma");
	shoe.add("Crooks");
	shoe.add("Chappal");
	shoe.add("Formals");
	shoe.add("Flip flops");
	System.out.println(shoe);
	System.out.println(shoe.remove(3));
	System.out.println(shoe);
	System.out.println(shoe.remove(4));
	System.out.println(shoe);
	}
}
