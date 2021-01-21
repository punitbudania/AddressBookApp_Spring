package com.bridgelabz.addressbook.models;

import com.bridgelabz.addressbook.dtos.ContactDTO;
import lombok.Data;

public @Data class ContactData
{
    private int contactId;
    private String name;
    private String address;

    public ContactData() {}

    public ContactData(int contactId, ContactDTO contactDTO)
    {
        this.contactId = contactId;
        this.name = contactDTO.name;
        this.address = contactDTO.address;
    }
}
