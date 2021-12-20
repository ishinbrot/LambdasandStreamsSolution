package com.example.lambda_streams;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public final class App {

    public static void main(String[] args) {

        new App().helper();
        
    }
    
    private void helper() {
                List<Student> studentList = Utility.determineStudentsinEachClass();

                studentList =  studentList.stream().sorted((o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName())).collect(Collectors.toList());
 
                Map<String, List<Student>> studentByMajor = studentList.stream().collect(Collectors.groupingBy(Student::getMajor));
                determineStudentsByMajor(studentByMajor);
             

    }
/**
 * This method will print out a list of the students by major.
 * This method will only print out all the Jons for each respective Major.
 * If a major does not have any students named Jon, then nothing will be printed for that Major
 * @param studentByMajor
 */
    private void determineStudentsByMajor(Map<String, List<Student>> studentByMajor) {
        studentByMajor.forEach((k ,v ) -> {
            long totalNumberofJons = v.stream().filter(s->(s.getFirstName().equals("Jon"))).count();
            System.out.println("Major:" + k + " has " + totalNumberofJons + " number of students with the first name Jon. ");
            Optional<Student> student = v.stream().
            filter(s -> (s.getFirstName().equals("Jon")))
            .findFirst();
            if (student.isPresent()) {
                System.out.println("Major:" + k + " with student " + student.get().getFirstName() + " " + student.get().getLastName());
            }
        });
     
        System.out.print("\n");
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