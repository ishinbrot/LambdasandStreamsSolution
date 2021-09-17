package com.example.lambda_streams;

import java.util.List;
import java.util.ArrayList;
public final class Utility {
    
    private  static String class1 = "Human Computer Interaction";
    private  static String class2 = "Business Operations in the 21st Century";
    private  static String class3 = "Java Development";
    private  static String class4 = "Maven101";
    private  static String class5 = "Databases";

    public static List<Student> studentList = initializeStudents();
    public static List<Professor> professorList = initializeProfessors();

    public static  List<Student> initializeStudents() {
        ArrayList<Student> studentList = new ArrayList<Student>();
        Student student1 = new Student("Tom", "Brown");
        Student student2 = new Student("Jon", "Goldstein");
        Student student3 = new Student("Pat", "Salemo");
        Student student4 = new Student("Jack", "Smith");
        Student student5 = new Student("Jon", "Goldstein");
        Student student6 = new Student("Jack", "Ryan");
        Student student7 = new Student("Tim", "Scott");
        Student student8 = new Student("Jenna", "Pascal");
        Student student9 = new Student("Robert", "DeNiro");
        Student student10 = new Student("Ty", "Timothy");
        Student student11 = new Student("Tim", "Smith");
        Student student12 = new Student("Jenna", "Goldstein");
        Student student13 = new Student("Michael", "Scott");
        Student student14 = new Student("Dwight", "Schrute");
        Student student15 = new Student("Mose", "Schrute");
        Student student16 = new Student("Pam", "Scott");
        Student student17 = new Student("Pam", "Halpert");
        Student student18 = new Student("Jim", "Halpert");
        Student student19 = new Student("Pete", "Halpert");
        Student student20 = new Student("Tony", "Brown");

        student1.addClass(class2);
        student2.addClass(class3);
        student3.addClass(class1);
        student1.addClass(class4);
        student3.addClass(class5);
        student2.addClass(class1);
        student5.addClass(class2);
        student6.addClass(class2);
        student7.addClass(class3);
        student8.addClass(class1);
        student9.addClass(class4);
        student10.addClass(class5);
        student11.addClass(class1);
        student12.addClass(class2);
        student13.addClass(class2);
        student14.addClass(class3);
        student15.addClass(class1);
        student16.addClass(class4);
        student17.addClass(class5);
        student18.addClass(class1);
        student19.addClass(class2);
        student20.addClass(class2);
        student15.addClass(class3);
        student18.addClass(class4);
        student16.addClass(class1);
        student15.addClass(class5);
        student14.addClass(class1);
        student12.addClass(class4);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);
        studentList.add(student10);
        studentList.add(student11);
        studentList.add(student12);
        studentList.add(student13);
        studentList.add(student14);
        studentList.add(student15);
        studentList.add(student16);
        studentList.add(student17);
        studentList.add(student18);
        studentList.add(student19);
        studentList.add(student20);

        return studentList;

    }
        /**
     * This method creates an array of 5 professors
     * 
     * @return
     */
    public static List<Professor> initializeProfessors() {
        ArrayList<Professor> professorList = new ArrayList<Professor>();

        Professor professor1 = new Professor("Jeffrey", "Popyack");
        Professor professor2 = new Professor("Jack", "Dawson");
        Professor professor3 = new Professor("Keith", "Goldman");
        Professor professor4 = new Professor("Timothy", "Donahue");
        Professor professor5 = new Professor("Michael", "Conforto");


        professor1.setClassTeaching(class1);
        professor2.setClassTeaching(class2);
        professor3.setClassTeaching(class3);
        professor4.setClassTeaching(class4);
        professor5.setClassTeaching(class5);

        professor1.setGrade(3);
        professor2.setGrade(4);
        professor3.setGrade(2);
        professor4.setGrade(3);
        professor5.setGrade(5);
        
        professorList.add(professor1);
        professorList.add(professor2);
        professorList.add(professor3);
        professorList.add(professor4);
        professorList.add(professor5);

        return professorList;
    }
}
