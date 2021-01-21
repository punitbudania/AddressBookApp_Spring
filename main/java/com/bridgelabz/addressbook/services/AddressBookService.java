package com.bridgelabz.addressbook.services;

import com.bridgelabz.addressbook.dtos.ContactDTO;
import com.bridgelabz.addressbook.models.ContactData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService
{
    @Override
    public List<ContactData> getContactData() {
        List<ContactData> contactDataList = new ArrayList<>();
        contactDataList.add(new ContactData(1, new ContactDTO("Rohit", "Goa")));
        return contactDataList;
    }

    @Override
    public ContactData getContactById(int contactId) {
        ContactData contactData;
        contactData = new ContactData(1, new ContactDTO("Rohit", "Goa"));
        return contactData;
    }

    @Override
    public ContactData createContactData(ContactDTO contactDTO) {
        ContactData contactData;
        contactData = new ContactData(1, contactDTO);
        return contactData;
    }

    @Override
    public ContactData updateContactData(ContactDTO contactDTO) {
        ContactData contactData;
        contactData = new ContactData(1, contactDTO);
        return contactData;
    }

    @Override
    public void deleteContactData(int contactId) {

    }
}
