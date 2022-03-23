package com.stacksandqueue;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NodeTest {

	@Test
	public void searchWithValue() {
		System.out.println("----------------Search With Value-----------------");
		LinkedList<Integer> list = new LinkedList<>();
		list.appendNode(56);
		list.appendNode(30);
		list.appendNode(40);
		list.appendNode(70);
		list.printList();

		assertTrue(list.search(30));
		assertFalse(list.search(60));
	}

	@Test
	public void addAfterKey() {
		System.out.println("-----------------------Add After Key---------------------");
		LinkedList<Integer> list = new LinkedList<>();

		list.appendNode(56);
		list.appendNode(30);
		list.appendNode(70);
		System.out.println("-------Before---------");
		list.printList();
		System.out.println("-------After---------");
		list.insertAfter(30, 40);
		list.printList();
	}

	@Test
	public void removeKeyAndSize() {
		System.out.println("-----------------------Remove Key And Size---------------------");
		LinkedList<Integer> list = new LinkedList<>();
		list.appendNode(56);
		list.appendNode(30);
		list.appendNode(40);
		list.appendNode(70);
		System.out.println("-------Before delete---------");
		System.out.println("Before removing element size is : ");
		list.size();
		list.printList();

		list.deleteNode(40);
		System.out.println("-------After delete---------");
		System.out.println("After removing element size is : ");
		list.size();
		list.printList();
	}

	@Test
	public void sortedList() {
		System.out.println("-----------------------Sorted List---------------------");
		LinkedList<Integer> list = new LinkedList<>();
		list.appendNode(56);
		list.appendNode(30);
		list.appendNode(40);
		list.appendNode(70);
		System.out.println("-----Before Sorting------");
		//list.s
	}
}
