package com.bridgelabz.addressbook.dtos;

import lombok.Data;

public @Data class ContactDTO
{
    public String name;
    public String address;

    public ContactDTO(String name, String address)
    {
        this.name = name;
        this.address = address;
    }
}
