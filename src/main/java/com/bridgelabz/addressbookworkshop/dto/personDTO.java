package com.bridgelabz.addressbookworkshop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
public @Data class PersonDTO {
	public int id ;
	public String fname;
	public String lname; 
	public String gender;
	public String phoneNumber;
	public String emailAddress;
	public String city;
	public String state;
	public String country;
	public String address;
	public String profilePic;
}
