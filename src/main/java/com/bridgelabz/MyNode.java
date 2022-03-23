package com.bridgelabz;

public class MyNode<T> implements INode<T> {

	T key;
	INode<T> next;

	public MyNode(T key) {
		this.key = key;
	}

	@Override
	public void setKey(T key) {
		this.key = key;
	}

	@Override
	public T getKey() {
		return key;
	}

	@Override
	public void setNext(INode<T> next) {
		this.next = next;
	}

	@Override
	public INode<T> getNext() {
		return next;
	}

	@Override
	public String toString() {
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append("MyNode{" + key + "}");
		if (next != null) {
			strBuffer.append("=>" + next);
		}
		return strBuffer.toString();
	}

}
