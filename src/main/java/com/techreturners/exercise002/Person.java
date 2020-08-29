package com.techreturners.exercise002;

public class Person {

    private String firstName;
    private String lastName;
    private String birthPlace;
    private int age;

    public Person(String firstName, String lastName, String birthPlace, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthPlace = birthPlace;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", age=" + age +
                '}';
    }
}
