package com.bridgelabz.addressbookworkshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbookworkshop.dto.AddressBookDTO;

import com.bridgelabz.addressbookworkshop.dto.ResponseDTO;
import com.bridgelabz.addressbookworkshop.model.AddressBookData;

import com.bridgelabz.addressbookworkshop.service.IAddressBook;

@RestController
@RequestMapping("/address")
public class AddressBookController {
	
	@Autowired
	public IAddressBook service;
	
	@RequestMapping(value = { "/get" })
	public ResponseEntity<ResponseDTO> getAllAddressBookData() {
		List<AddressBookData> personList = null;
		personList = service.getAllAddressBookData();
		ResponseDTO respDTO = new ResponseDTO("Get call Successful:", personList);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	
	@PostMapping("/add")
	public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO  addressBookDTO) {
		AddressBookData addressBookData = null;
		addressBookData = service.addAddressBook(addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Create AddressBook Data:", addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

}
