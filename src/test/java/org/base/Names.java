package org.base;

public enum Names {



	name("Arun"),
	address("endiyur"),
	phone("9500587985"),
	ids;


	String details;

	Names(String deatil){

		this.details= deatil;

	}

	Names(){

		this.details= "2012";

	}

	public String getReour() {

		return details;
	}

}
