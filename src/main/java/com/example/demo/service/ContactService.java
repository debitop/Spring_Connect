package com.example.demo.service;

import com.example.demo.model.Contact;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public interface ContactService {

    void save(Contact contact);

    List<Contact> findContactsByNameRegexp(@RequestParam("regExp") String regExp);

}
