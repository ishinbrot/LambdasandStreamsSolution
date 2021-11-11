package com.example.lambda_streams;


public class Professor implements Person {

private String lastName;
private String firstName;
private String classToTeach;
private int credits = 0;
    public Professor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getClassTeaching() {
        return this.classToTeach;
    }

    public void setClassTeaching(String classesToTeach) {
        this.classToTeach = classesToTeach;
    }


    public int getCredits() {
        return this.credits;
    }

    public void setCredits(int grade) {
        this.credits = grade;
    }
    

    @Override
    public String toString() {
        return "{" +
            " lastName='" + getLastName() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", classTeaching='" + classToTeach + "'" +
            "}";
    }

}