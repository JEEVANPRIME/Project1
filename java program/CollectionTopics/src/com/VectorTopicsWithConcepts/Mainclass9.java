package com.VectorTopicsWithConcepts;

import java.util.Vector;

class Employee{
	int id;
	double sal;
	char grade;
	public Employee(int id, double sal, char grade) {
		super();
		this.id = id;
		this.sal = sal;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", sal=" + sal + ", grade=" + grade + "]";
	}
}

public class Mainclass9 {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(new Employee(123, 56000, 'A'));
		v1.add(new Employee(567, 79800, 'B'));
		for (int i = 0; i < v1.size(); i++) {
			Employee employee=(Employee)v1.get(i);
			System.out.println(employee);
		}
	}
}
