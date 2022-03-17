package com.javadatastructures;

public class DataStructuresInJava {

	public static void main(String[] args) {
		System.out.println("**************Data STructures*************");

		MyLinkedListOperations myLinkedList = new MyLinkedListOperations();
		MyLinkedListOperations myLinkedList1 = new MyLinkedListOperations();
		MyLinkedListOperations myLinkedList2 = new MyLinkedListOperations();
		
		System.out.println("<------------Add node in start----------->");
		myLinkedList.addNode(70);
		myLinkedList.addNode(30);
		myLinkedList.addNode(56);
		myLinkedList.PrintList();

		System.out.println("<------------Add node in last----------->");
		myLinkedList1.append(56);
		myLinkedList1.append(30);
		myLinkedList1.append(70);
		myLinkedList1.PrintList();
		
		System.out.println("<------------Insert between two nodes----------->");
		myLinkedList2.insert(56);
		myLinkedList2.insert(70);
		myLinkedList2.insertBetweenNode(56, 70, 30);
		myLinkedList2.PrintList();

	}

}
