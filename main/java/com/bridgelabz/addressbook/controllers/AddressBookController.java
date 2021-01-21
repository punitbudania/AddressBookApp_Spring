package com.bridgelabz.addressbook.controllers;

import com.bridgelabz.addressbook.dtos.ContactDTO;
import com.bridgelabz.addressbook.dtos.ResponseDTO;
import com.bridgelabz.addressbook.models.ContactData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController
{
    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getContactData()
    {
        ContactData contactData;
        contactData = new ContactData(1, new ContactDTO("Rohit", "Goa"));
        ResponseDTO responseDTO = new ResponseDTO("Get call successful", contactData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{contactId}")
    public ResponseEntity<ResponseDTO> getContactDataById(@PathVariable("contactId") int contactId)
    {
        ContactData contactData;
        contactData = new ContactData(1, new ContactDTO("Rohit", "Goa"));
        ResponseDTO responseDTO = new ResponseDTO("Get call for id successful", contactData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addContactData(@RequestBody ContactDTO contactDTO)
    {
        ContactData contactData;
        contactData = new ContactData(1, contactDTO);
        ResponseDTO responseDTO = new ResponseDTO("Created contact data successfully", contactData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateContactData(@RequestBody ContactDTO contactDTO)
    {
        ContactData contactData;
        contactData = new ContactData(1, contactDTO);
        ResponseDTO responseDTO = new ResponseDTO("Updated contact data successfully", contactData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{contactId}")
    public ResponseEntity<ResponseDTO> deleteContactData(@PathVariable("contactId") int contactId)
    {
        ResponseDTO responseDTO = new ResponseDTO("Deleted successfully", "Deleted id: " + contactId);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}
