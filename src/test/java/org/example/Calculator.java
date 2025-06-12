package org.example;

import net.datafaker.Faker;

public class Calculator {

    Faker faker = new Faker();

    public  int multiply(int a, int b){
        return a * b;
    }

    public  int multiply(int a, int b, int c){
        return a * b * c;
    }

    public static void main(String[] args) {
        Calculator  calculator = new Calculator();

        int num1 = calculator.faker.number().numberBetween(0,50);
        int num2 = calculator.faker.number().numberBetween(50,100);
        int result1 = calculator.multiply(num1,num2);

        System.out.println("Multiplying two numbers : " + result1);

        int numb1 = calculator.faker.number().numberBetween(1,20);
        int numb2 = calculator.faker.number().numberBetween(20,30);
        int numb3 = calculator.faker.number().numberBetween(30,40);
        int result2 = calculator.multiply(numb1,numb2,numb3);

        System.out.println("Multiplying three numbers : " + result2);

    }


}
