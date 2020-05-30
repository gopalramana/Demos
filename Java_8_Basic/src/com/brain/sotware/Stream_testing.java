package com.brain.sotware;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_testing {

	public static void main(String[] args) {
		
		List items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");
		
		


	/*	items.stream().
		filter(item->!((String) item).contains("B"))
		.forEach(System.out::println);
		
		items.stream()
		.filter(s->((String) s).contains("B"))
		.forEach(System.out::println);*/
		
		
		List l=(List) items.stream().filter(s->!((String) s).contains("B")).collect(Collectors.toList());
		System.out.println(l);
		
	}

}
