package com.CombineTopic;

import java.util.Arrays;

class Emp implements Comparable<Emp> {
	int id;
	String name;
	double sal;

	public Emp(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

	@Override
	public int compareTo(Emp o) {
		return (int) (this.sal - o.sal);
	}

}

class Emp1 implements Comparable<Emp1> {
	int id;
	String name;
	double sal;

	public Emp1(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

	@Override
	public int compareTo(Emp1 o) {
		return this.id-o.id;  
	}

}

public class MainClassEmp {

	public static void main(String[] args) {
		Emp e1 = new Emp(7168, "Allen", 79845.23);
		Emp e2 = new Emp(7833, "Drake", 45956.12);
		Emp e3 = new Emp(4568, "Aden", 98456.15);
		Emp e4 = new Emp(1245, "Scott", 45985.56);
		Emp e5 = new Emp(7539, "King", 95456.65);
		Emp[] empofsal = { e1, e2, e3, e4, e5 };
		Arrays.sort(empofsal);
		System.out.println("*****Sorted based on sal*****");
		for (int i = 0; i < empofsal.length; i++) {
			System.out.println(empofsal[i]); 
		}
		System.out.println("*****Sorted based on id*****");
		Emp1 e6 = new Emp1(7168, "Allen", 79845.23);
		Emp1 e7 = new Emp1(7833, "Drake", 45956.12);
		Emp1 e8 = new Emp1(4568, "Aden", 98456.15);
		Emp1 e9 = new Emp1(1245, "Scott", 45985.56);
		Emp1 e10 = new Emp1(7539, "King", 95456.65);
		Emp1[] empofid= {e6,e7,e8,e9,e10};
		Arrays.sort(empofid); 
		for (int i = 0; i < empofid.length; i++) {
			System.out.println(empofid[i]);
		}
	}
}
