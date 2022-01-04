package com.bridgelabz.addressbookworkshop.dto;

import javax.validation.constraints.Pattern;

import lombok.ToString;

public @ToString class AddressBookDTO {
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "AddressBook Name  is invalid")
	public String addressBookName;

}
