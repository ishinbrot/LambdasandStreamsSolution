package com.example.lambda_streams;

import java.util.ArrayList;

public class Student implements Person {

    private String lastName;
    private String firstName;
    private int GPA = 0;

    private ArrayList<String> classListName = new ArrayList<String>();


    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Student(String firstName, String lastName, int GPA) {
        this.GPA = GPA;
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

    public ArrayList<String> getClassList() {
        return this.classListName;
    }

    public String getClassesAsString() {
        String classNamesAsString = "";
        for (String className: classListName) {
            classNamesAsString += className + ",";
        }
        return classNamesAsString;
    }

    public void setClassList(ArrayList<String> classList) {
        this.classListName = classList;
    }

    public void addClass(String className) {
        this.classListName.add(className);
    }

    public int getGPA() {
        return this.GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    
    @Override
    public String toString() {
        return "{" +
            " lastName='" + getLastName() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", classList='" + getClassesAsString() + "'" +
            "}";
    }
    

}