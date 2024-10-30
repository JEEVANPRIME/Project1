package com.PriorityQueueTopic;

import java.util.PriorityQueue;

public class Sample3 {

	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		System.out.println(q);
		PriorityQueue q2=new PriorityQueue();
		q2.add(50);
		q2.add(56);
		q2.add(70);
		System.out.println(q2);
		q.addAll(q2);
		System.out.println(q);
	}
}
