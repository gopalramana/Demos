package com.brain.sotware;

import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionTestonEmp {	
	
	static List arrList =new ArrayList();

	
	
	
static {
	
	arrList.add(new Emp(1, "indira", BigDecimal.valueOf(2000.00), new Department(100,"software")));
	arrList.add(new Emp(2, "ciri", BigDecimal.valueOf(1000.00), new Department(100,"software")));
	arrList.add(new Emp(4, "suma", BigDecimal.valueOf(4000.00), new Department(101,"admin")));
	arrList.add(new Emp(3, "joshna", BigDecimal.valueOf(6000.00), new Department(101,"admin")));
	arrList.add(new Emp(9, "jo", BigDecimal.valueOf(9000.00), new Department(103,"fin")));
	
}
	
	public static void main(String[] args) {
		Set empset=new HashSet();
		Map<String,Object> map=new HashMap<String,Object>(){
			
			@Override
			public Object put(String key,Object value){
				
			
				
				Object returnkey =super.put(key.toUpperCase(), value);
				
				
				  
				return returnkey;
			}
		};
		
		/*Map<Department,List<Emp>> dept=(Map<Department, List<Emp>>) arrList.stream().collect(Collectors.groupingBy(Emp::getDept));
		System.out.println(dept);*/

	/*	  Map<String, Double> sum = (Map<String, Double>) arrList.stream().collect(
	                Collectors.groupingBy(Emp::getDept, Collectors.summarizingDouble(Emp::getSalary)));
		  */
		 Map<String, BigDecimal> sum1 = (Map<String, BigDecimal>) arrList.stream().collect(
				   Collectors.groupingBy(
						   Emp::getDept,
				            Collectors.reducing(
				                BigDecimal.ZERO,
				                Emp::getSalary,
				                BigDecimal::add)));
		 
			//System.out.println(sum1);
				
			
		empset.add(new Emp(1, "indira", BigDecimal.valueOf(2000.00), new Department(100,"software")));
		empset.add(new Emp(1, "indira", BigDecimal.valueOf(2000.00), new Department(100,"software")));
		empset.add(new Emp(1, "indira", BigDecimal.valueOf(2000.00), new Department(100,"software")));
		empset.add(new Emp(1, "indira", BigDecimal.valueOf(2000.00), new Department(100,"software")));
		empset.add(new Emp(1, "indira", BigDecimal.valueOf(2000.00), new Department(100,"software")));
		
		//System.out.println(empset.size());
		map.put("abc",new Emp(1, "indira", BigDecimal.valueOf(2000.00), new Department(100,"software")));
		map.put("ABC",new Emp(1, "indira", BigDecimal.valueOf(2000.00), new Department(100,"software")));
		System.out.println(map.size());
		
		
			
			
	}

}
