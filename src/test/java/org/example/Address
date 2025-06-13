package org.example;

import net.datafaker.Faker;

public class Address {
    Faker faker = new Faker();

    String city;
    String street;


    public Address(){
        city= faker.address().city();
        street= faker.address().streetAddress();
    }


    public void printAddress(){
        System.out.println("City" + city + "Street" + street);
    }



}
