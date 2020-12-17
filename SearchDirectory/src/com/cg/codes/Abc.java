package com.cg.codes;

import java.util.List;

@FunctionalInterface
public interface Abc {
	public void display(List<Employee> l);

	default void show1() {
		System.out.println("This is a default method");
	}

	static void show2() {
		System.out.println("This is a static method");
	}
}
