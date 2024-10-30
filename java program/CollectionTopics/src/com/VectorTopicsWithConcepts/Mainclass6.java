package com.VectorTopicsWithConcepts;

import java.util.Vector;

class University{
	String course;
	String university;
	int cost;
	public University(String course, String university, int cost) {
		super();
		this.course = course;
		this.university = university;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "University [course=" + course + ", university=" + university + ", cost=" + cost + "]";
	}
}

public class Mainclass6 {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(new University("ECE", "VTU", 1750));
		v1.add(new University("CSE", "Banglore University", 1500));
		for (int i = 0; i < v1.size(); i++) {
			University universities=(University)v1.get(i);
			System.out.println(universities);  
		}
	}
}
