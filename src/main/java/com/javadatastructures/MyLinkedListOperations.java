package com.javadatastructures;

public class MyLinkedListOperations {

	Node head;
	Node tail;

	public MyLinkedListOperations() {
		head = null;
	}

	public void addNode(int newVal) {
		Node newNode = new Node();
		newNode.data = newVal;
		newNode.nextNode = null;

		if (head == null) {
			head = newNode;
		} else {
			Node temp = new Node();
			temp = head;
			while (temp.nextNode != null)
				temp = temp.nextNode;
			temp.nextNode = newNode;
		}
	}

	public void appendNode(int newVal) {
		Node nextNode = new Node();
		nextNode.data = newVal;
		if (head == null) {
			head = nextNode;
			tail = nextNode;
		} else {
			tail.next = nextNode;
			tail = tail.next;
		}
	}

	public void PrintList() {
		Node temp = new Node();
		temp = this.head;
		if (temp != null) {
			System.out.print("Linked List have: ");
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.nextNode;
			}
			System.out.println();
		} else {
			System.out.println("The list is empty.");
		}
	}
}
