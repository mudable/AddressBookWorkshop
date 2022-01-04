package com.bridgelabz.addressbookworkshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.bridgelabz.addressbookworkshop.dto.PersonDTO;

import lombok.Data;

@Entity
@Table(name = "PersonData")
public @Data class PersonData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
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
	
	@ManyToOne
	@JoinColumn(name = "add_id", referencedColumnName = "book_id")
	private AddressBookData addressBookData;

	public PersonData(PersonDTO persondto) {
		this.UpdatePerson(persondto);

	}

	public void UpdatePerson(PersonDTO persondto) {
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

	public PersonData() {

	}
}
