package com.situ.lession11;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueTest {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println("_______stack");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
//		System.out.println(stack.pop());java.util.EmptyStackException 空了会报错 而不是null
		/*
		 * poll 调用完 扔出去 peek 调用完 不扔出去
		 */
	}

}
