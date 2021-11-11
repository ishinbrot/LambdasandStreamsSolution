package com.example.lambda_streams;

import java.util.List;
import java.util.Map;

public final class App {

    public static void main(String[] args) {

        new App().helper();
        
    }
    
    private void helper() {
                List<Student> studentList = Utility.determineStudentsinEachClass();

                 studentList.stream().sorted(this::sortStudents).map(this::computeGPA)
                 .forEach(s->System.out.println(s.getFirstName() + " " + s.getLastName()+" grade "+s.getGPA()));

    }
/**
 * This method will print out a list of the students by major.
 * This method will only print out all the Jons for each respective Major.
 * If a major does not have any students named Jon, then nothing will be printed for that Major
 * @param studentByMajor
 */
    private void determineStudentsByMajor(Map<String, List<Student>> studentByMajor) {
    }

/**
 * @param studentList
 * @return
 */
    private  Student computeGPA(Student student) {
        float grade = student.getFirstName().length() * 2;
        float credits = student.getProfessorList().stream().map(Professor::getCredits).reduce(0, (a, b) -> a + b);
        double gpa = grade/credits;
        student.setGPA(gpa);
        return student;
    }

/**
 * @param student1
 * @param student2
 */
    private int sortStudents(Student student1, Student student2) {
        
        if (student1.getLastName().compareTo(student2.getLastName()) == 0) {
            return (student1.getFirstName().compareTo(student2.getFirstName())); 
        }
            else return (student1.getLastName().compareTo(student2.getLastName()));
    }
}