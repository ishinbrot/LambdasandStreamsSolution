package com.example.lambda_streams;

import java.util.Comparator;
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
    }

    private  List<Student> determineStudentsinEachClass(List<Student> studentList, List<Professor> professorList) {
        // Populate the following method using Java streams to complete the answer

        professorList.forEach(p-> {
            Stream<Student> studentsInClass = studentList.stream().sorted(Comparator.comparing(Student::getLastName)).filter(s->s.getClassesAsString().contains(p.getClassTeaching()));
            studentsInClass.forEach(s-> { 
                s.addProfessor(p);
                long grade = p.getGrade() + s.getGPA();
                s.setGPA(grade);
            });
     //       System.out.print("\n");
            
        });
        return studentList;
    }
/**
 * This function calculates each students GPA by computing their grade in the class by the amount of professors in each class
 * @param studentList
 * @return
 */
    private  List<Student> computeGPA(List<Student> studentList) {

          return studentList;
    }

}
