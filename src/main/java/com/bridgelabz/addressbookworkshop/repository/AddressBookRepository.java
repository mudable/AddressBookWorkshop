package com.bridgelabz.addressbookworkshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.addressbookworkshop.model.AddressBookData;

public interface AddressBookRepository extends JpaRepository<AddressBookData, Integer> {

}
