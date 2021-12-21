package com.example.lambda_streams;

import java.util.List;

public final class App {

    public static void main(String[] args) {

        new App().helper();
        
    }
    
        // Utilize the sortStudents and computeGPA method and print out each student followed by their GPA
    private void helper() {
                List<Student> studentList = Utility.determineStudentsinEachClass();

                 studentList.stream().sorted(this::sortStudents).map(this::computeGPA)
                 .forEach(s->System.out.println(s.getFirstName() + " " + s.getLastName()+" grade "+s.getGPA()));
  
    }


/**
 * Implement the following function to calculate a students GPA.
 * Remember the business logic for a students grade is the students first name multipled by 2
 * The credits a student will have will be defined by adding up the credits attribute from all their professors
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
 * Implement the following function to sort students by their last name, followed by their first name in ascending order
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