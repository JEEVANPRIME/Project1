package com.PriorityQueueTopic;

import java.util.PriorityQueue;

public class Sample5 {

	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
		q.add("Add");
		q.add("Sub");
		q.add("Bad");
		q.add("Green");
		System.out.println(q);
		q.remove("Bad");
		System.out.println(q);
	}
}
