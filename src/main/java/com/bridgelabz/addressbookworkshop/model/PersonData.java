package com.bridgelabz.addressbookworkshop.model;

import lombok.Data;

public @Data class PersonData {
	private int id ;
	private String fname;
	private String lname; 
	private String gender;
	private long phoneNumber;
	private String emailAddress;
	private String city;
	private String state;
	private String country;
	private String address;
	private String profilePic;
}


