package org.example;

import net.datafaker.Faker;

public class Student {

    Faker faker = new Faker();

    private String name;
    private int age;
    private int grade;

    public Student(){
        this.name = faker.name().fullName();
        this.age = faker.number().numberBetween(18,30);
        this.grade = faker.number().numberBetween(0, 100);
    }

    //Getter

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getGrade(){
        return grade;
    }

    //Setter

    public void setName(String newName){
        name= newName;
    }

    public void setAge(int newAge){
        age=newAge;
    }

    public void setGrade(int newGrade){
        grade=newGrade;
    }


    public void printInfo(){
        System.out.println("Name is :" + name);
        System.out.println("Age is : " + age);
        System.out.println("Grade is :" + grade);
    }




}
