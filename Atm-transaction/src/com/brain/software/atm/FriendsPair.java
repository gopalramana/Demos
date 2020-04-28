package com.brain.software.atm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FriendsPair {

	public static void main(String[] args) {
		List<String> frndsList = new ArrayList<>();
		frndsList.add("U1,U2");
		frndsList.add("U3,U4");
		frndsList.add("U2,U1");
		frndsList.add("U1,U5");
		System.out.println("Before:" +frndsList);
		compareFriends(frndsList);
	}
	
	public static List<String> compareFriends(List<String> frndsList){
		List<String> result = new ArrayList<>();
		// To Store all input values in split array format
		// key is index, value corresponding split array
		Map<Integer, String[]> splitArraysMap = new HashMap<>();
		for (int i=1; i<frndsList.size(); i++) {
			splitArraysMap.put(i, frndsList.get(i).split(","));
			
		}
		System.out.println("....."+splitArraysMap);
		Integer mapSize = splitArraysMap.size();
		for (Integer key : splitArraysMap.keySet()) {
			String[] frndsArray = splitArraysMap.get(key);
			boolean unique = false;
			for(int i = key+1; i <= mapSize; i++) {
				
			}
			
			if(key == mapSize-1) {
				break;
			}
		}
		return result;
	}

}