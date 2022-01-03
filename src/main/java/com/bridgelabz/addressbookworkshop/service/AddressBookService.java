package com.bridgelabz.addressbookworkshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookworkshop.dto.AddressBookDTO;
import com.bridgelabz.addressbookworkshop.model.AddressBookData;
import com.bridgelabz.addressbookworkshop.model.PersonData;
import com.bridgelabz.addressbookworkshop.repository.AddressBookRepository;
@Service
public class AddressBookService implements IAddressBook {
	@Autowired
	private AddressBookRepository addbookrepo;

	@Override
	public AddressBookData addAddressBook(AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = null;
		addressBookData = new AddressBookData(addressBookDTO);
		return addbookrepo.save(addressBookData);
	}

	@Override
	public List<AddressBookData> getAllAddressBookData() {
		return addbookrepo.findAll();
	}
}
