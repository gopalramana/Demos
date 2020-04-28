package com.product.demo.domain;

public class Product {
	
    private String id;
    private String productName;
    
    
	public Product(String id, String name) {
		this.id=id;
		this.productName=name;
	
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

}
