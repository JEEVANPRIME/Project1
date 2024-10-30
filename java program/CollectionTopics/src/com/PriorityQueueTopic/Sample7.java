package com.PriorityQueueTopic;

import java.util.PriorityQueue;

public class Sample7 {

	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
		q.add("cricket");
		q.add("chess");
		q.add("atom");
		q.add("bard");
		System.out.println(q);
		if(q.contains("atom")) {
			q.remove("atom");
		}
		System.out.println(q);
	}
}
