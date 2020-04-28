package com.brain.software;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutor {

	public static void main(String[] args) {
		int corecount=Runtime.getRuntime().availableProcessors();
		System.out.println("count"+corecount);
		ExecutorService service= Executors.newFixedThreadPool(100);
		for(int i=0;i<100;i++) {
				service.execute((new Task()));
				
			 } 
		
		service.shutdown();
		System.out.println("Thread name :"+Thread.currentThread().getName());
       }
	}


