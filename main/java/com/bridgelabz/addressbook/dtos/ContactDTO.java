package com.bridgelabz.addressbook.dtos;

import lombok.Data;

import javax.validation.constraints.Pattern;

public @Data class ContactDTO
{
    @Pattern(regexp = "^[A-Z]{1}[a-zAZ\\s]{2,}$", message = "Invalid name!")
    public String name;
    @Pattern(regexp = "^[A-Z]{1}[a-zAZ\\s]{2,}$", message = "Invalid address!")
    public String address;

    public ContactDTO(String name, String address)
    {
        this.name = name;
        this.address = address;
    }
}
