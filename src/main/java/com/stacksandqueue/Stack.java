package com.stacksandqueue;

public class Stack<K> {
	
	LinkedList<K> linkedList;
	
	public Stack() {
		this.linkedList = new LinkedList<>();
	}
	
	public void push(K data) {
		linkedList.addNode(data);
	}
	
	public void pop() {
		linkedList.pop();
	}
	
	public void peek() {
		linkedList.peek();
	}

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.peek();
		stack.pop();
		stack.peek();
	}

}
