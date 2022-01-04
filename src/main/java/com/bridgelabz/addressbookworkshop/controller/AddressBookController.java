package com.bridgelabz.addressbookworkshop.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbookworkshop.dto.AddressBookDTO;
import com.bridgelabz.addressbookworkshop.dto.PersonDTO;
import com.bridgelabz.addressbookworkshop.dto.ResponseDTO;
import com.bridgelabz.addressbookworkshop.model.AddressBookData;
import com.bridgelabz.addressbookworkshop.model.PersonData;
import com.bridgelabz.addressbookworkshop.service.IAddressBook;

@RestController
@RequestMapping("/address")
public class AddressBookController {

	@Autowired
	public IAddressBook service;

	/**
	 * @param url
	 * @return PersonData for all person
	 */

	@RequestMapping(value = { "/get" })
	public ResponseEntity<ResponseDTO> getAllAddressBookData() {
		List<AddressBookData> addressBookList = null;
		addressBookList = service.getAllAddressBookData();
		ResponseDTO respDTO = new ResponseDTO("Get call Successful:", addressBookList);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	/*
	 * @param AddressBookDTO
	 * 
	 * @return personData And HTTP status
	 */
	@PostMapping("/add")
	public ResponseEntity<ResponseDTO> addAddressBookData(@Valid @RequestBody AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = null;
		addressBookData = service.addAddressBook(addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Create AddressBook Data:", addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	/*
	 * @param addressBookId
	 * 
	 * @return personData for particular id
	 */
	@GetMapping("/get/{addressbookid}")
	public ResponseEntity<ResponseDTO> getAddressBookDataById(@PathVariable("addressbookid") int addressbookid) {
		AddressBookData addressBookData = null;
		addressBookData = service.getAddressBookDataById(addressbookid);
		ResponseDTO respDTO = new ResponseDTO("Get call for ID Successful:", addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	/*
	 * @param addressbookId ,addressBookDto
	 * 
	 * @return Updated PersonData And HTTP status
	 */

	@PutMapping("/update/{addressbookid}")
	public ResponseEntity<ResponseDTO> UpdateAddressBookData(@Valid @PathVariable("addressbookid") int addressbookid,
		@RequestBody AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = null;
		addressBookData = service.UpdateAddressBookData( addressbookid,addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Update AddressBook Data Successful:", addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);

	}
/*
	 * 
	 * @param addressBookId
	 * @return String if id is removed
	 */
	@DeleteMapping("/delete/{addressbookid}")
	public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("addressbookid") int addressbookid) {
		service.deleteAddressBookData(addressbookid);
		ResponseDTO respDTO = new ResponseDTO("Deleted Successful,Deleted Id:", addressbookid);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);

	}
}
