package com.example.lambda_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public final class App {

    public static void main(String[] args) {

        new App().helper();

    
        
    }
    // use Java streams to inform each professor who is taking their specific class, and how which student is in each class

    private void helper() {
            // the student and professor list come from static variables in the Utility class
            List<Student> studentList = determineStudentsinEachClass(Utility.studentList, Utility.professorList);

            studentList = computeGPA(studentList);
        
           studentList.forEach(s-> { 
            System.out.println(s.getFirstName() + " " + s.getLastName() + " grade " + s.getGPA());
        });
           System.out.print("\n");
    }

    private static List<Student> determineStudentsinEachClass(List<Student> studentList, List<Professor> professorList) {
        // Populate the following method using Java streams to complete the answer

        professorList.forEach(p-> {
            Stream<Student> studentsInClass = studentList.stream().filter(s->s.getClassesAsString().contains(p.getClassTeaching()));
            studentsInClass.forEach(s-> { 
                s.addProfessor(p);
                long grade = p.getGrade() + s.getGPA();
                s.setGPA(grade);
            });
            
        });
        return studentList;
    }
/**
 * Calculate a students GPA here by using the stream api. the resulting solution should be one line
 * @param studentList
 * @return
 */
    private static List<Student> computeGPA(List<Student> studentList) {
          return studentList;
    }

}