package com.CombineTopic;

import java.util.Arrays;
import java.util.Comparator;

final class Emp01 {
	int id;
	String name;
	double sal;

	public Emp01(int id, String name, double sal) {
//		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp1 [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
}

public class MainClassEmployee implements Comparator<Emp01>{

	public static void main(String[] args) {
		Emp01 e1=new Emp01(5, "Umesh", 7.7);
		Emp01 e2=new Emp01(1, "Ramesh", 9.9);
		Emp01 e3=new Emp01(3, "Suresh", 5.3); 
		Emp01[] arr= {e1,e2,e3};
		Arrays.sort(arr,new MainClassEmployee());
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	@Override
	public int compare(Emp01 o1, Emp01 o2) {
//		return o1.id-o2.id;
//		return (int)(o1.sal-o2.sal);
		return o1.name.compareTo(o2.name);  
	}
}
