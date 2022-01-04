package com.bridgelabz.addressbookworkshop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookworkshop.dto.AddressBookDTO;
import com.bridgelabz.addressbookworkshop.dto.PersonDTO;
import com.bridgelabz.addressbookworkshop.exception.PersonException;
import com.bridgelabz.addressbookworkshop.model.AddressBookData;
import com.bridgelabz.addressbookworkshop.model.PersonData;
import com.bridgelabz.addressbookworkshop.repository.AddressBookRepository;

@Service
public class AddressBookService implements IAddressBook {
	@Autowired
	private AddressBookRepository addbookrepo;

	@Override
	public AddressBookData getAddressBookDataById(int addressbookid) {
		return addbookrepo.findById(addressbookid).orElseThrow(() -> new PersonException("Id is not present"));
	}

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

	@Override
	public AddressBookData UpdateAddressBookData(int addressbookid, AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = this.getAddressBookDataById(addressbookid);
		addressBookData.UpdateAddressBookData(addressBookDTO);
	//System.out.println(addressBookData);
		return addbookrepo.save(addressBookData);
	}


	@Override
	public void deleteAddressBookData(int addressbookid) {
		AddressBookData addressBookData = this.getAddressBookDataById(addressbookid);
		addbookrepo.delete(addressBookData);

	}
}
