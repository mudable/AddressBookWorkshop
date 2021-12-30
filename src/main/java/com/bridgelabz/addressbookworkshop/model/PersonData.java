package com.bridgelabz.addressbookworkshop.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bridgelabz.addressbookworkshop.dto.PersonDTO;

import lombok.Data;

@Entity
@Table(name = "AddressBokkData")
public @Data class PersonData {
	@Id
	private int id;
	private String fname;
	private String lname;
	private String gender;
	private String phoneNumber;
	private String emailAddress;
	private String city;
	private String state;
	private String country;
	private String address;
	private String profilePic;

	public PersonData(PersonDTO persondto) {
		this.id = persondto.id;
		this.fname = persondto.fname;
		this.lname = persondto.lname;
		this.gender = persondto.gender;
		this.phoneNumber = persondto.phoneNumber;
		this.emailAddress = persondto.emailAddress;
		this.city = persondto.city;
		this.state = persondto.state;
		this.country = persondto.country;
		this.address = persondto.address;
		this.profilePic = persondto.profilePic;

	}

	public void UpdatePerson(PersonDTO persondto) {
		//this.UpdatePerson(persondto);
	}
}
