package com.example.lambda_streams;

import java.util.ArrayList;
import java.util.List;

public class Student implements Person {

    private String lastName;
    private String firstName;
    private double gpa = 0;
    List<Professor> professorList;

    private List<String> classListName;


    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Student(String firstName, String lastName, double gpa) {
        this.gpa = gpa;
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

    public List<String> getClassList() {
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
        if (classListName == null ) {
            classListName = new ArrayList<String>();
        }
        this.classListName.add(className);
    }

    public double getGPA() {
        return this.gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = Math.floor( gpa* 100) / 100;
    }

    public List<Professor> getProfessorList() {
        return this.professorList;
    }

    public void setProfessorList(List<Professor> professorList) {
        this.professorList = professorList;
    }
    public void addProfessor(Professor professor) {
        if (this.professorList == null ) {
            professorList = new ArrayList<Professor>();
        }
        this.professorList.add(professor);
    }
    
    @Override
    public String toString() {
        return "{" +
            " lastName='" + getLastName() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", classList='" + getClassesAsString() + "'" +
            ", professorList='" + this.professorList.toString() + "'" +
            "}";
    }
    

}