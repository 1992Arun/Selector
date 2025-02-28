package org.selct;

import java.util.Scanner;

public class Exceptions {
	
	static void excep() throws ProductNotFoundException{
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("enter product name");
		
		String next = sc.next();
		
		if(next.equalsIgnoreCase("iPhone")) {
			
			System.out.println("Product found");
			
		} else {
			
			throw new ProductNotFoundException();
			
		}
	}
	
	static void equ(){
	
	StringBuffer sb1 = new StringBuffer("Arun");
	
	StringBuffer sb2 = new StringBuffer("Arun");
	
	String s = "kumar";
	
	String s1="kumar";
	
	StringBuffer sb3=sb2;
	
	System.out.println(sb3.equals(sb2));
	
		
	}		
	
	public static Exceptions e;
	
	private Exceptions() {
		
		
	}
	
	public static Exceptions singletoncl() {
		
		if(e==null) {
			
			 e = new Exceptions();
			
		}
		return e;
		
	}
	
	
	public static void main(String[] args) throws ProductNotFoundException {
		
		Exceptions e = singletoncl();
		
		System.out.println(System.identityHashCode(e));
		
		Exceptions e1 = singletoncl();
		
		System.out.println(System.identityHashCode(e1));
		
		
		
	}

}
