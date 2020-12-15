package com.example.week4_challenge_2;

public class Student {
    private final String firstName;
    private final String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Student(String first, String last){
            firstName=first;
            lastName=last;
        }
}
