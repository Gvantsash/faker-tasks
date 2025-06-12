package org.example;

import net.datafaker.Faker;

public class BankAccount {

    int balance;


    Faker faker = new Faker();

    public BankAccount(){
        this.balance = faker.number().numberBetween(0,1000);
    }

    public void checkBalance(){
        System.out.println("Balance: " + balance);

        if(balance < 100) {
            System.out.println("ბალანსი დაბალია");
        } else {
            System.out.println("ბალანსი საკმარისია");
        }

    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.checkBalance();
    }



}
