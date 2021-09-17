package com.example.lambda_streams;

import java.util.ArrayList;

public class Student implements Person {

    private String lastName;
    private String firstName;
    private long GPA = 0;
    private String major;
    ArrayList<Professor> professorList = new ArrayList<>();

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

    public long getGPA() {
        return this.GPA;
    }

    public void setGPA(long GPA) {
        this.GPA = GPA;
    }

    public ArrayList<Professor> getProfessorList() {
        return this.professorList;
    }

    public void setProfessorList(ArrayList<Professor> professorList) {
        this.professorList = professorList;
    }
    public void addProfessor(Professor professor) {
        this.professorList.add(professor);
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    
    @Override
    public String toString() {
        return "{" +
            " lastName='" + getLastName() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", major='" + getMajor() + "'" +
            ", classList='" + getClassesAsString() + "'" +
            ", professorList='" + this.professorList.toString() + "'" +
            "}";
    }
    

}