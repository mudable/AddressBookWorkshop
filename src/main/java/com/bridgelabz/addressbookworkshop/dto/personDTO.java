package com.bridgelabz.addressbookworkshop.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
public @ToString class PersonDTO {
	public int id;
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "First Name is invalid")
	public String fname;
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Last Name is invalid")
	public String lname;
	@Pattern(regexp = "male|female", message = " Gender  needs to be male or female")
	public String gender;
	@Pattern(regexp = "^[0-9]{10}", message = "Given phone number is invalid")
	public String phoneNumber;
	@Pattern(regexp = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}?(.[a-z]{2,3}){0,1}$", message = "Given emanil id is invalid valid")
	public String emailAddress;
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "City Name is invalid")
	public String city;
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "State Name is invalid")
	public String state;
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "country Name is invalid")
	public String country;
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Address is invalid")
	public String address;
	@NotEmpty(message = "profilepic should not be empty")
	public String profilePic;

}
