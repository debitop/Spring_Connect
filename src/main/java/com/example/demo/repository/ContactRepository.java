package com.example.demo.repository;

import com.example.demo.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

    @Query(value = "SELECT * FROM connect EXCEPT (SELECT * FROM connect WHERE name ~ ?1)", nativeQuery = true)
    List<Contact> findContactsByNameRegexp(@Param("regExp") String regExp);
}
