package com.brain.software;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++) {
			Thread t1=new Thread(new Task());
			synchronized (t1) {
				t1.start();
			 } 
			}
		System.out.println("Thread name :"+Thread.currentThread().getName());

	}

}
