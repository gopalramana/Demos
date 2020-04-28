package com.product.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.demo.domain.Product;


@RestController
@RequestMapping(path = "/product/api")
public class ProductController 
{

	private static Map<String, List<Product>> productDB = new HashMap<String, List<Product>>();
	
	
	  static {
	        productDB = new HashMap<String, List<Product>>();
	 
	        List<Product> lst = new ArrayList<Product>();
	        Product std = new Product("xxx", "Class IV");
	        lst.add(std);
	        std = new Product("Yyy", "Class V");
	        lst.add(std);
	 
	      
	   
	 
	    }
	 
	
    @GetMapping(value = "/getproductdetails")
    public List getProductDetails() 
    {
        return new ArrayList();
    }
    
    @GetMapping(value="/getproductconfig")
    public List<Product> getProductConfig() 
    {
    	 List<Product> lst=new ArrayList<Product>();
        Product std = new Product("xxx", "Class IV");
        lst.add(std);
        std = new Product("Yyy", "Class V");
        lst.add(std);
       return lst ;
    }
    
}
