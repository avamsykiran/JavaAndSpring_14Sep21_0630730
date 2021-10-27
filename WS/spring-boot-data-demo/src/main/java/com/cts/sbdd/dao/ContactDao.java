package com.cts.sbdd.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.sbdd.entity.Contact;

@Repository
public interface ContactDao extends JpaRepository<Contact,Long>{
	
	boolean existsByMobile(String mobile);
	boolean existsByEmail(String email);
	
	List<Contact> findAllByFullName(String fullName);
	Contact findByMobile(String mobile);
	Contact findByEmail(String email);
	
	@Query("SELECT c FROM Contact c WHERE c.dateOfBirth between :start and :end")
	List<Contact> findAllBornInDates(LocalDate start,LocalDate end);
}
