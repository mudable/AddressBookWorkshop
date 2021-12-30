package com.bridgelabz.addressbookworkshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.addressbookworkshop.model.PersonData;


public interface PersonRepository extends JpaRepository <PersonData,Integer>{

}
