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
import com.bridgelabz.addressbookworkshop.dto.PersonDTO;
import com.bridgelabz.addressbookworkshop.dto.ResponseDTO;
import com.bridgelabz.addressbookworkshop.model.PersonData;
import com.bridgelabz.addressbookworkshop.service.IPersonService;

@RestController
@RequestMapping("/person")
public class PesonController {
	@Autowired
	private IPersonService personService;

	/*
	 * @RequestMapping:Used to take the URL for displaying message. return:message.
	 */
	@RequestMapping(value = { "/get" })
	public ResponseEntity<ResponseDTO> getAllPersonData(@RequestParam int addressbookid) {
		List<PersonData> personDataList = null;
		personDataList = personService.getAllPersonData();
		ResponseDTO respDTO = new ResponseDTO("Get call Successful:", personDataList);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	/*
	 * @GetMapping:used to pass the URL With Id. return:pass the message for
	 * particular id.
	 */

	@GetMapping("/get/{id}")
	public ResponseEntity<ResponseDTO> getPersonDataById(@PathVariable("id") int id,@RequestParam int addressbookid) {
		PersonData personData = null;
		personData = personService.getPersonDataById(id);
		ResponseDTO respDTO = new ResponseDTO("Get call for ID Successful:", personData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	/*
	 * @PostMapping:pass the url. param:persondto object. return: person details
	 */
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addPersonData(@Valid @RequestBody PersonDTO persondto,@RequestParam int addressbookid) {
		PersonData personData = null;
		personData = personService.addperson(persondto,addressbookid);
		ResponseDTO respDTO = new ResponseDTO("Create AddressBook Data:", personData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	/*
	 * @putmapping:url with id. param:id with persondto object. return:updated
	 * data.
	 */

	@PutMapping("/update/{id}")
	public ResponseEntity<ResponseDTO> UpdatePerson(@Valid @PathVariable("id") int id, @RequestBody PersonDTO persondto,@RequestParam int addressbookid) {
		PersonData personData = null;
		personData = personService.UpdatePerson(id, persondto);
		ResponseDTO respDTO = new ResponseDTO("Update AddressBook Data Successful:", personData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);

	}

	/*
	 * @DeleteData:pass the URL with ID. return:delete the data of particular data.
	 */
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDTO> deleteperson(@PathVariable("id") int id,@RequestParam int addressbookid) {
		personService.deleteperson(id);
		ResponseDTO respDTO = new ResponseDTO("Deleted Successful,Deleted Id:", id);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);

	}

}
