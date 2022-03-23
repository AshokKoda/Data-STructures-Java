package com.bridgelabz;

public interface INode<T> {

	public void setKey(T key);
	public T getKey();
	public void setNext(INode<T> next);
	public INode<T>	getNext();
}
