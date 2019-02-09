package com.example.demo.controller;

import com.example.demo.model.Contact;
import com.example.demo.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    ContactService contactService;

    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody Contact contact){
        contactService.save(contact);
    }

    @GetMapping(value = "/find/{regExp}", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Contact> findContactsByNameRegexp(@RequestParam("regExp") String regExp){
        return contactService.findContactsByNameRegexp(regExp);
    };

}
