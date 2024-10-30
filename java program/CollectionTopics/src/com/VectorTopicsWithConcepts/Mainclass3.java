package com.VectorTopicsWithConcepts;

import java.util.Vector;

class School{
	String name;
	char grade;
	int strength;
	public School(String name, char grade, int strength) {
		super();
		this.name = name;
		this.grade = grade;
		this.strength = strength;
	}
	public String toString() {
		return "School [name=" + this.name + ", grade=" + this.grade + ", strength=" + this.strength + "]";
	}
}

public class Mainclass3 {

	public static void main(String[] args) {
		School s1=new School("Jeevan", 'A', 45);
		School s2=new School("Shiv", 'B', 49);
		
		Vector v1=new Vector();
		v1.add(s1);
		v1.add(s2);
		for (int i = 0; i < v1.size(); i++) {
			School school=(School)v1.get(i);
			System.out.println(school);
		}
	}
}
