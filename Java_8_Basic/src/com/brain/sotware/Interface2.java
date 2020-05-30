package com.brain.sotware;
@FunctionalInterface
public interface Interface2 {

	default void add() {
		System.out.println("interface1");
	}
	default void div() {
		System.out.println("interface1");
	}
	static void sub() {
		System.out.println("interface1");
	}

	static void mul() {
		System.out.println("interface1");
	}
void hello() ;
}