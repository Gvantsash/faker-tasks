package org.example;

import net.datafaker.Faker;

public class Product {
    int price;
    int discount;

    Faker faker = new Faker();

    public Product(){
        price= faker.number().numberBetween(10,2000);
        discount= faker.number().numberBetween(5,50);
    }

    public int getPrice() {
        int  discountPrice = (price * discount) / 100;
        return price - discountPrice;
    }

    public void printInfo() {
        System.out.println(getPrice());
    }








}
