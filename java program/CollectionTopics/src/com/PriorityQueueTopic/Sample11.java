package com.PriorityQueueTopic;

import java.util.PriorityQueue;

public class Sample11 {

	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		System.out.println(q);
		
		PriorityQueue q1=new PriorityQueue();
		q1.add(30);
		q1.add(40);
		q1.add(50);
		q1.add(60);
		System.out.println(q1);
		q.retainAll(q1);
		System.out.println(q);
	}
}
