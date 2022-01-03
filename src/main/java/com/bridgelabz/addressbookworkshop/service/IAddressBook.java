package com.bridgelabz.addressbookworkshop.service;

import java.util.List;

import com.bridgelabz.addressbookworkshop.dto.AddressBookDTO;
import com.bridgelabz.addressbookworkshop.model.AddressBookData;
import com.bridgelabz.addressbookworkshop.model.PersonData;

public interface IAddressBook {

	AddressBookData addAddressBook(AddressBookDTO addressBookDTO);

	List<AddressBookData> getAllAddressBookData();

	

}
