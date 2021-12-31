package com.bridgelabz.addressbookworkshop.service;

import java.util.List;

import com.bridgelabz.addressbookworkshop.dto.PersonDTO;
import com.bridgelabz.addressbookworkshop.model.PersonData;

public interface IPersonService {
	PersonData addperson(PersonDTO persondto);

	void deleteperson(int id);

	List<PersonData> getAllPersonData();

	PersonData getPersonDataById(int id);

	PersonData UpdatePerson(int id, PersonDTO persondto);

}
