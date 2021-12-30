package com.bridgelabz.addressbookworkshop.dto;

import lombok.Data;

public @Data class personDTO {
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
