package com.example.demo.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/product/api")
public class ProductController 
{

    
    @GetMapping(value = "/getproductdetails")
    public List getProductDetails() 
    {
        return new LinkedList();
    }
    
    @GetMapping(path="/getproductconfig")
    public List getProductConfig() 
    {
       return new LinkedList();
    }
    
}
