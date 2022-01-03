package com.bridgelabz.addressbookworkshop.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


import com.bridgelabz.addressbookworkshop.dto.AddressBookDTO;

import lombok.Data;

@Data
@Entity
//@Table(name = "AddressBook")
public class AddressBookData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	private String addressBookName;

	@OneToMany(targetEntity = PersonData.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "id", referencedColumnName = "id")
	List<PersonData> personList;

	public AddressBookData() {
	}

	public AddressBookData(AddressBookDTO addressBookDTO) {
		// this.id = addressBookDTO.id;
		this.addressBookName = addressBookDTO.addressBookName;
		this.personList = addressBookDTO.personList;

	}
}
