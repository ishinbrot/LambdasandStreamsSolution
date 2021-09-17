package com.example.lambda_streams;

import java.util.ArrayList;

/**
 * Hello world!
 */
public final class App {

    public static void main(String[] args) {

        // the student and professor list come from static variables in the Utility class
        determineStudentsinEachClass(Utility.studentList, Utility.professorList);

        
    }
    // use the Java 8 Streams API to inform each professor who is taking their specific class, and how many students are in each class.
    
    private static void determineStudentsinEachClass(ArrayList<Student> studentList, ArrayList<Professor> professorList) {
    }


}