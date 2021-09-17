package com.example.lambda_streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class App {

    public static void main(String[] args) {

        new App().helper();

    }

    private void helper() {
         // the student and professor list come from static variables in the Utility class
         List<Student> studentList = determineStudentsinEachClass(Utility.studentList, Utility.professorList);

         studentList = computeGPA(studentList);
 
        studentList =  studentList.stream().sorted((o1, o2) -> o1.getLastName().compareTo(o2.getLastName())).collect(Collectors.toList());
     
    }

    private static List<Student> determineStudentsinEachClass(List<Student> studentList, List<Professor> professorList) {
        // Populate the following method using Java streams to complete the answer
        professorList.forEach(p-> {
            Stream<Student> studentsInClass = studentList.stream().
            sorted(Comparator.comparing(Student::getLastName)).
            filter(s->s.getClassesAsString().contains(p.getClassTeaching()));
            studentsInClass.forEach(s-> { 
                s.addProfessor(p);
                long grade = p.getGrade() + s.getGPA();
                s.setGPA(grade);
            });
            
        });
        return studentList;
    }
/**
 * This function calculates each students GPA by computing their grade in the class by the amount of professors in each class
 * @param studentList
 * @return
 */
    private static List<Student> computeGPA(List<Student> studentList) {
          studentList.forEach(s -> s.setGPA(s.getGPA() / s.getProfessorList().size()));

          return studentList;
    }

}
