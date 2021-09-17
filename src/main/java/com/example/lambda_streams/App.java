package com.example.lambda_streams;

import java.util.List;

/**
 * Hello world!
 */
public final class App {

    public static void main(String[] args) {
        new App().helper();
        
    }
    // use the Java 8 Streams API to inform each professor who is taking their specific class, and how many students are in each class.
    
    private void helper() {
       // the student and professor list come from static variables in the Utility class
        determineStudentsinEachClass(Utility.studentList, Utility.professorList);

    }

    private void determineStudentsinEachClass(List<Student> studentList, List<Professor> professorList) {
    }


}
