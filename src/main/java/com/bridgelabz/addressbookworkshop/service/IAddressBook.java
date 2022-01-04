package com.bridgelabz.addressbookworkshop.service;

import java.util.List;

import com.bridgelabz.addressbookworkshop.dto.AddressBookDTO;

import com.bridgelabz.addressbookworkshop.model.AddressBookData;

public interface IAddressBook {
	AddressBookData addAddressBook(AddressBookDTO addressBookDTO);

	AddressBookData getAddressBookDataById(int addressbookid);

	List<AddressBookData> getAllAddressBookData();

	void deleteAddressBookData(int id);

	AddressBookData UpdateAddressBookData(int addressbookid, AddressBookDTO addressBookDTO);

}
