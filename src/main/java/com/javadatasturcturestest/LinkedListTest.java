package com.javadatasturcturestest;

import org.junit.Assert;
import org.junit.Test;

import com.javadatastructures.MyLinkedListOperations;

public class LinkedListTest {

	@Test
	public void addFirstThreeNode() {
		System.out.println("----------------Add First Three Node---------------------");
		MyLinkedList<Integer> intList = new MyLinkedList<Integer>();
		INode<Integer> firstNode = new MyNode<>(70);
		INode<Integer> secondNode = new MyNode<>(30);
		INode<Integer> thirdNode = new MyNode<>(56);

		intList.addFirst(firstNode);
		intList.addFirst(secondNode);
		intList.addFirst(thirdNode);

		System.out.println(intList);
	}

	@Test
	public void appendNodeAtLast() {
		System.out.println("------------------Append Node At Last--------------------");
		MyLinkedList<Integer> intList = new MyLinkedList<Integer>();
		INode<Integer> firstNode = new MyNode<>(56);
		INode<Integer> secondNode = new MyNode<>(30);
		INode<Integer> thirdNode = new MyNode<>(70);

		intList.addLast(firstNode);
		intList.addLast(secondNode);
		intList.addLast(thirdNode);

		System.out.println(intList);
		System.out.println("Size of LinkedList : " + intList.size());
	}

	@Test
	public void insertNodeAtIndex() {
		System.out.println("-------------------Insert Node At Index---------------------");
		MyLinkedList<Integer> intList = new MyLinkedList<Integer>();
		INode<Integer> firstNode = new MyNode<>(56);
		INode<Integer> secondNode = new MyNode<>(70);
		INode<Integer> thirdNode = new MyNode<>(30);
		INode<Integer> fourthNode = new MyNode<>(40);

		intList.addLast(firstNode);
		intList.addLast(secondNode);

		intList.insert(1, thirdNode);

		intList.insert(2, fourthNode);

		System.out.println(intList);
	}

	@Test
	public void pop() {
		System.out.println("-------------------pop---------------------");
		MyLinkedList<Integer> intList = new MyLinkedList<Integer>();
		INode<Integer> firstNode = new MyNode<>(56);
		INode<Integer> secondNode = new MyNode<>(30);
		INode<Integer> thirdNode = new MyNode<>(70);

		intList.addLast(firstNode);
		intList.addLast(secondNode);
		intList.addLast(thirdNode);

		System.out.println("Before pop : " + intList);
		System.out.println("Popped out node : " + intList.pop());
		System.out.println("After pop : " + intList);
	}

	@Test
	public void popLast() {
		System.out.println("-------------------pop Last---------------------");
		MyLinkedList<Integer> intList = new MyLinkedList<Integer>();
		INode<Integer> firstNode = new MyNode<>(56);
		INode<Integer> secondNode = new MyNode<>(30);
		INode<Integer> thirdNode = new MyNode<>(70);

		intList.addLast(firstNode);
		intList.addLast(secondNode);
		intList.addLast(thirdNode);

		System.out.println("Before pop : " + intList);
		System.out.println("Popped out node : " + intList.popLast());
		System.out.println("After pop : " + intList);
	}
	
	@Test
	public void search() {
		MyLinkedListOperations myLinkedList = new MyLinkedListOperations();
		myLinkedList.insert(56);
		myLinkedList.insert(30);
		myLinkedList.insert(70);
		Assert.assertSame(30, myLinkedList);
	}
}
