package com.PriorityQueueTopic;

import java.util.PriorityQueue;

public class Sample9 {

	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
		q.add(10);
		q.add(2);
		q.add(5);
		q.add(6);
		int j=q.size();
		System.out.println(q);
		for(int i=0;i<q.size()*j;i++) {
			isFact((int)q.poll());
		}
	}
	static void isFact(int no) {
		int fact=1;
		for(int i=no;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
