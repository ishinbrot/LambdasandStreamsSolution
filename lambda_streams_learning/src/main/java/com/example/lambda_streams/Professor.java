package com.example.lambda_streams;

import java.util.ArrayList;

public class Professor implements Person {

private String lastName;
private String firstName;
private String className = new String();
private ArrayList<Student> studentList = new ArrayList<Student>();

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


    public ArrayList<Student> getStudentList() {
        return this.studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    

    @Override
    public String toString() {
        return "{" +
            " lastName='" + getLastName() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", classTeaching='" + className + "'" +
            ", studentList='" + getStudentList() + "'" +
            "}";
    }

}
