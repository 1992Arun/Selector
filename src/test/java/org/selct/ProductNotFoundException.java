package org.selct;

public class ProductNotFoundException extends Exception {
	
	public ProductNotFoundException(){
		
		getMessage();
		
	}
	
	public String getMessage() {
		
		return "Product not found";
	}

}
