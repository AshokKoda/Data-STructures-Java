package com.javadatastructures;

public class MyLinkedListOperations {

	Node head;
	Node tail;

	// Push as first node will be the last node
	public void addNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			head = newNode;
			newNode.next = temp;
		}
	}

	// Push as last node will be the first node
	public void append(int data) {
		Node nextNode = new Node(data);
		if (head == null) {
			head = nextNode;
			tail = nextNode;
		} else {
			tail.next = nextNode;
			tail = tail.next;
		}
	}

	// Show method to display the linked list data
	public void PrintList() {
		Node temp = this.head;
		if (temp != null) {
			while (temp != null) {
				System.out.println(temp.data + " ");
				temp = temp.next;
			}
		} else {
			System.out.println("The list is empty.");
		}
	}
}
