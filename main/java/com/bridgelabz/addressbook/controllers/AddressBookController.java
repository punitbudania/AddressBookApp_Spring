package com.bridgelabz.addressbook.controllers;

import com.bridgelabz.addressbook.dtos.ContactDTO;
import com.bridgelabz.addressbook.dtos.ResponseDTO;
import com.bridgelabz.addressbook.models.ContactData;
import com.bridgelabz.addressbook.services.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController
{
    @Autowired
    private IAddressBookService addressBookService;

    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getContactData()
    {
        List<ContactData> contactDataList;
        contactDataList = addressBookService.getContactData();
        ResponseDTO responseDTO = new ResponseDTO("Get call successful", contactDataList);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{contactId}")
    public ResponseEntity<ResponseDTO> getContactDataById(@PathVariable("contactId") int contactId)
    {
        ContactData contactData = addressBookService.getContactById(contactId);
        ResponseDTO responseDTO = new ResponseDTO("Get call for id successful", contactData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addContactData(@Valid @RequestBody ContactDTO contactDTO)
    {
        ContactData contactData = addressBookService.createContactData(contactDTO);
        ResponseDTO responseDTO = new ResponseDTO("Created contact data successfully", contactData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateContactData(@Valid @RequestBody ContactDTO contactDTO)
    {
        ContactData contactData = addressBookService.updateContactData(contactDTO);
        ResponseDTO responseDTO = new ResponseDTO("Updated contact data successfully", contactData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{contactId}")
    public ResponseEntity<ResponseDTO> deleteContactData(@PathVariable("contactId") int contactId)
    {
        addressBookService.deleteContactData(contactId);
        ResponseDTO responseDTO = new ResponseDTO("Deleted successfully", "Deleted id: " + contactId);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}
