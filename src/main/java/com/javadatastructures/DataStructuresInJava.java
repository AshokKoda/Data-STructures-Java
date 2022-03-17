package com.javadatastructures;

public class DataStructuresInJava {

	public static void main(String[] args) {
		System.out.println("**************Data STructures*************");

		MyLinkedListOperations myLinkedList = new MyLinkedListOperations();
		MyLinkedListOperations myLinkedList1 = new MyLinkedListOperations();
		System.out.println("<------------Add node in start----------->");

		myLinkedList.addNode(56);
		myLinkedList.addNode(30);
		myLinkedList.addNode(70);
		myLinkedList.PrintList();

		System.out.println("<------------Add node in last----------->");
		myLinkedList1.appendNode(56);
		myLinkedList1.appendNode(30);
		myLinkedList1.appendNode(70);
		myLinkedList1.PrintList();

	}

}
