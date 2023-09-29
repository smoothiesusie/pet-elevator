package com.techelevator.crm;

import com.techelevator.Person;

import java.util.List;


public class Customer extends Person {

    private String phoneNumber;
    private List<Pet> pets;


    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Pet> getPets() {
        return this.pets;
    }
    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }


    

}
