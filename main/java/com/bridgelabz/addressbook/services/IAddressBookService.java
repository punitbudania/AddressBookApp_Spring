package com.bridgelabz.addressbook.services;

import com.bridgelabz.addressbook.dtos.ContactDTO;
import com.bridgelabz.addressbook.models.ContactData;

import java.util.List;

public interface IAddressBookService
{
    List<ContactData> getContactData();

    ContactData getContactById(int contactId);

    ContactData createContactData(ContactDTO contactDTO);

    ContactData updateContactData(ContactDTO contactDTO);

    void deleteContactData(int contactId);
}
