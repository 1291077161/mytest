package com.multiplethread.cpu;

public class Plate<T> {
	private T item;

	public Plate(T t) {
		this.item = t;
	}

	public void setItem(T t) {
		this.item = t;
	}

	public T getItem() {
		return this.item;
	}

	public static void main(String[] args) {
		Plate<? extends String> plate = new Plate<String>("aaa");

	}
}
