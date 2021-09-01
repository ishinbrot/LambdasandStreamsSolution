package com.example.lambda_streams;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 */
public final class App {

    public static void main(String[] args) {
     //   ArrayList<Student> studentList = Utility.initializeStudents();
      //  ArrayList<Professor> professorList = Utility.initializeProfessors();

        
        // lets use java to filter on the name Jon
      //  Stream<Student> studentStream = studentList.stream().filter(student -> student.getFirstName().contains("Jon"));

     //   System.out.println(PrintJonStudents(studentList));
     //   System.out.println(studentsTakingMaven101(studentList));
        // studentStream.co
        // studentStream.forEach(student -> System.out.println(student.toString()));
        // lets use java to sort by the students first name alphabetically

        // lets see if any students are taking Maven 101
      //  System.out.println(studentList.stream().anyMatch(student -> student.getClassList().stream()
       //         .anyMatch(studentClass -> studentClass.contains("Maven101"))));

        // System.out.println(studentList.stream().filter(student ->
        // student.getClassList().stream().filter(studentClass ->
        // studentClass.getClassName().contains("Maven101"))));

        // Print out every student named Jon

        // Sys

        // get the students who are taking Maven 101 using Java streams

        // Determine if any students are taking SpringBoot2.0 class

        // Print out the classes that the professors Jeffrey teaches using a stream
        // filter

        determineStudentsinEachClass(Utility.studentList, Utility.professorList);

        
    }
    // use Java streams to inform each professor who is taking their specific class, and how many students are in each class.

    private static void determineStudentsinEachClass(ArrayList<Student> studentList, ArrayList<Professor> professorList) {
        // you know each professor teaches 1 class. We can do a for each for each class

        professorList.forEach(p-> {
            System.out.print("Professor " + p.getFirstName() + " " + p.getLastName() + " has the following students: ");
            Stream<Student> studentsInClass = studentList.stream().filter(s->s.getClassesAsString().contains(p.getClassTeaching()));
            studentsInClass.forEach(s-> { 
                p.addStudent(s);
                System.out.println(s.getFirstName() + " " + s.getLastName());
            });
            System.out.print("\n");
            
        });
        System.out.println(professorList.get(0));
    }
    /**
     * This method will print out all of the Jon's that are students use Java 8
     * streams to get the count of the Jons from the ArrayList Do not iterate
     * through the array
     * 
     * @param studentList
     */
    private static String PrintJonStudents(ArrayList<Student> studentList) {
        int JonCount = 0;

        return "There are " + JonCount + " named Jon";

    }

    /**
     * Utilize Java Streams and create a simplified forEach to display all the
     * students taking Maven101
     * 
     * @param studentList
     */
    private static String studentsTakingMaven101(ArrayList<Student> studentList) {
        // System.out.print("The following students are taking Maven 101");

        Stream<Student> studentFilter = studentList.stream()
                .filter(student -> student.getClassesAsString().contains("Maven101"));

        studentList.forEach(
                student -> student.getClassList().stream().filter(className -> className.contains("Maven101")));

        String studentString = studentFilter.map(Object::toString).collect(Collectors.joining("\n "));
        return "The following students are taking Maven 101 " + studentString;
    } 


}
