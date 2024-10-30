package com.PriorityQueueTopic;

import java.util.PriorityQueue;

public class Sample8 {

	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
		q.add('A');
		q.add('B');
		q.add('C');
		q.add('D');
		int j=q.size();
		System.out.println(q);
		PriorityQueue q2=q;
		System.out.println(q2);
		for (int i = 0; i < q.size()*j; i++) {
			System.out.println(i+" "+q.poll());  
		}
		System.out.println(q2);
		System.out.println(q);
	}
}
