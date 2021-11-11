![CapTech Banner](https://github.com/captechconsulting/springboot-techchallenge/blob/part0/src/main/resources/images/CaptechLogo.png)

# Part 2: Java and Lambda tech challenge


## Table of Contents

- [Table of Contents](#table-of-contents)
- [Parts](#parts)
- [Working branch](#working-branch)
- [Submission](#submission)
- [Running the Application](#running-the-application)
- [Overview: Using the Java Stream API](#Using-the-Java-Stream-filter-API)
- [Answer Key](#answer-key)
- [Recommended Resources](#recommended-resources)


## Parts

|                                                                                                |
| :--------------------------------------------------------------------------------------------- |
| [Part 0: Getting Started](../../tree/part0)                                                    |
| [Part 1: Introduction to  Java Stream filters and lambdas](../../tree/part1)                    |
| [Part 2: Sort, Reducers, and Maps Using the Java Stream API](#part-2-Java-Stream-Sort)     |
| [Part 3: Java Stream Grouping and Count](../../tree/part3) |

## Working branch

1. Navigate to the cloned repository on your local machine
1. Check out the starter code for part one:

    ```bash
    git checkout part2
    ```

1. Create a new branch for your development work:

    ```bash
    git checkout -b develop/part2
    ```

1. Push your new local branch to the remote repository and set your local branch to track the new remote branch:

    ```bash
    git push -u origin develop/part2
    ```

After you have completed your work for each part and committed & pushed your changes up to the remote repository, you
are ready to open a pull request for submission.

## Submission

1. Navigate to your GitHub repository
1. Open a pull request from your working branch to the starting branch (`develop/part2`&rarr;`part2`).

> Be sure to assign a reviewer so they will receive a notification that your solution is ready for review.
>
> If you do not have a reviewer yet, please email [Ian Shinbrot](mailto:ishinbrot@captechconsulting.com)


## Running the Application

To run the application, open a terminal window and execute the following commands:

```bash
mvn package
java -jar target/classroom-tech-challenge-1.0-SNAPSHOT.jar
```
You may alternatively use the built-in compilier in your specific IDE


## Overview: Introduction to Sort and Reducers using Java Streams
Welcome to Part 2 of the Lambda and Streams TechChallenge!

In part 2 we are going to sort each student by their last and first name (in ascending order), while calculating a students GPA.
A students grade is calculated using the following method: <br/>
The length of a students first name multipled by 2. 
The students grade will then be divided by their number of credits. The number of credits for each student will be identified by the number of professors a student has.
The reducer function will be utilized to add up all the credits from the list of students professors

## Answer Key:
For this excercise you will first update the 'ComputeGPA' function to calculate each students GPA. <br/>
You will then update the sortStudents function to sort the students first and last names. <br/>
You will then update the helper method to utilize the 'ComputeGPA' and 'sortStudents' function using Streams, and pring out the results like so

You will then update the helper method to sort the students by last name, and your output should be similar to the following:

Tom Brown grade 0.85 <br/>
Tony Brown grade 2.0 <br/>
Robert DeNiro grade 4.0 <br/>
Jenna Goldstein grade 1.42 <br/>
Jon Goldstein grade 1.2 <br/>
Jon Goldstein grade 1.5 <br/>
Jim Halpert grade 1.0 <br/>
Pam Halpert grade 1.2 <br/>
Pete Halpert grade 2.0 <br/>
Jenna Pascal grade 3.33 <br/>
Jack Ryan grade 2.0 <br/>
Pat Salemo grade 0.75 <br/>
Dwight Schrute grade 2.4 <br/>
Mose Schrute grade 0.8 <br/>
Michael Scott grade 3.5 <br/>
Pam Scott grade 1.0 <br/>
Tim Scott grade 3.0 <br/>
Jack Smith grade 0.88 <br/>
Tim Smith grade 2.0 <br/>
Ty Timothy grade 0.8 <br/>

## Recommended Resources

You may wish to consult the following resources for useful information on utilizing Java Streams and Lambdas

- [Java Streams](https://stackify.com/streams-guide-java-8/)
- [Lambda Expressions](https://www.geeksforgeeks.org/lambda-expressions-java-8/)
- [Information related to java sorting](https://howtodoinjava.com/java8/stream-sorted-method/)