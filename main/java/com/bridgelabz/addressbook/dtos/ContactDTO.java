package com.bridgelabz.addressbook.dtos;

public class ContactDTO
{
    public String name;
    public String address;

    public ContactDTO(String name, String address)
    {
        this.name = name;
        this.address = address;
    }

    public String toString()
    {
        return "name=" + name + ":address=" + address;
    }
}
