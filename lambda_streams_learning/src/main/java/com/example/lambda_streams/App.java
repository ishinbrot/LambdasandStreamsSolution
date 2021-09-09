package com.example.lambda_streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class App {

    public static void main(String[] args) {

        // the student and professor list come from static variables in the Utility class
        List<Student> studentList = determineStudentsinEachClass(Utility.studentList, Utility.professorList);

        studentList = computeGPA(studentList);

       studentList =  studentList.stream().sorted((o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName())).collect(Collectors.toList());

        studentList.forEach(s-> { 
            System.out.println(s.getFirstName() + " " + s.getLastName() + " grade " + s.getGPA());
        });
        System.out.print("\n");
        
    }
    // use Java streams to inform each professor who is taking their specific class, and how which student is in each class

    private static ArrayList<Student> determineStudentsinEachClass(ArrayList<Student> studentList, ArrayList<Professor> professorList) {
        // Populate the following method using Java streams to complete the answer

        professorList.forEach(p-> {
            System.out.print("Professor " + p.getFirstName() + " " + p.getLastName() + " has the following students: ");
            Stream<Student> studentsInClass = studentList.stream().sorted(Comparator.comparing(Student::getLastName)).filter(s->s.getClassesAsString().contains(p.getClassTeaching()));
            studentsInClass.forEach(s-> { 
                s.addProfessor(p);
                long grade = p.getGrade() + s.getGPA();
                s.setGPA(grade);
                System.out.println(s.getFirstName() + " " + s.getLastName() + " grade " + s.getGPA());
            });
            System.out.print("\n");
            
        });
        return studentList;
    }

    private static List<Student> computeGPA(List<Student> studentList) {


          studentList.forEach(s -> s.setGPA(s.getGPA() / s.getProfessorList().stream().count()));

          return studentList;
    }

}
