package com.bridgelabz.addressbookworkshop.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookworkshop.dto.PersonDTO;
import com.bridgelabz.addressbookworkshop.model.PersonData;
import com.bridgelabz.addressbookworkshop.repository.PersonRepository;


@Service
public class PersonService implements IPersonService {
	@Autowired
	private PersonRepository personrepository;
	/*
	 * param:PersonData.
	 *  return:all the data.
	 */

	@Override
	public List<PersonData> getAllPersonData() {
		return personrepository.findAll();
	}
	/*
	 * param:id return:all the details about particular id.
	 */

	@Override
	public PersonData getPersonDataById(int id) {
		return personrepository.findById(id).get();
	}
	/*
	 * param:persondto object. method:addPerson. return:all the details of person
	 * sent in JSON format.
	 */

	@Override
	public PersonData addperson(PersonDTO persondto) {
		PersonData personData = null;
		personData = new PersonData(persondto);
		return personrepository.save(personData);
	}
	/*
	 * method:UpdatePerson. param:persondto object. return:Updated data.
	 */

	@Override
	public PersonData UpdatePerson(int id, PersonDTO persondto) {
		PersonData personData = this.getPersonDataById(id);
		personData.UpdatePerson(persondto);
		//System.out.println(personData);
		return personrepository.save(personData);
	}
	/*
	 * method:deleteperson param:id. return:delete the data of particular id.
	 */

	@Override
	public void deleteperson(int id) {
		PersonData personData = this.getPersonDataById(id);
		personrepository.delete(personData);
	}
	
	
}