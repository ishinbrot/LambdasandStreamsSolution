package com.example.lambda_streams;


public class Professor implements Person {

private String lastName;
private String firstName;
private String className = new String();
private int grade = 0;
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
        return this.className;
    }

    public void setClassTeaching(String classesToTeach) {
        this.className = classesToTeach;
    }


    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    

    @Override
    public String toString() {
        return "{" +
            " lastName='" + getLastName() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", classTeaching='" + className + "'" +
            "}";
    }

}
