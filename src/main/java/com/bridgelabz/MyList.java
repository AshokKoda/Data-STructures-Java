package com.bridgelabz;

public interface MyList<T> {

	// adding new item to the first
	public void add(T item);

	// adding new item to the last
	public void append(T item);

	public void remove(T item);

	public boolean search(T item);

	public boolean isEmpty();

	public int size();

	public int index(T item);

	public void insert(int pos, T item);

	public T pop();
}
