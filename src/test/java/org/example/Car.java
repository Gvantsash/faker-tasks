package org.example;

import net.datafaker.Faker;


public class Car {

        Faker faker = new Faker();

        String brand;
        String model;
        int year;

        public Car(){
            brand = faker.vehicle().make();
            model = faker.vehicle().model();
            year = faker.number().numberBetween(1998,2025);
        }

        public  void printInfo(){
            System.out.println("Brand is : " +brand);
            System.out.println("Model is : " +model);
            System.out.println("Year is : "+ year);
        }

    public static void main(String[] args) {
            Car car = new Car();
            car.printInfo();
    }

}
