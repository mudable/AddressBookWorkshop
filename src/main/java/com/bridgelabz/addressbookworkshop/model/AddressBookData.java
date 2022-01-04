package com.bridgelabz.addressbookworkshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.bridgelabz.addressbookworkshop.dto.AddressBookDTO;
import lombok.Data;

@Entity
public @Data class AddressBookData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	private int addressbookid;
	private String addressBookName;

	public AddressBookData() {
	}

	public AddressBookData(AddressBookDTO addressBookDTO) {
		this.UpdateAddressBookData(addressBookDTO);
	}

	public void UpdateAddressBookData(AddressBookDTO addressBookDTO) {
	this.addressBookName=addressBookDTO.addressBookName;
		
	}

	
		

	}

