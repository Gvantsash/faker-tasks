package org.example;

import net.datafaker.Faker;

public class User {
    Faker faker = new Faker();

    String name;
    String email;



    public User(String name) {
        this.name = faker.name().firstName();
    }

    public User(String name, String email) {
        this.name = faker.name().firstName();
        this.email = faker.internet().emailAddress();
    }

    public void printInfo(){

    }



}
