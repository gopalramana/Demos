package com.brain.sotware;
 
public class TestClass {
	public static void main(String[] args) {
		Student john = new Student("John");
		Student dow = new Student("Dow");
		swap(john, dow);
		System.out.println("john name is "+john.getname());
		System.out.println("dow name is "+dow.getname());
	}
	public static void swap(Student o1, Student o2){
		Student temp = o1;
		o1=o2;
		o2=temp;
		o1.setname("xxx");
	}
}