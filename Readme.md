![CapTech Banner](https://github.com/captechconsulting/springboot-techchallenge/blob/part0/src/main/resources/images/CaptechLogo.png)

# Part 1: Java and Lambda tech challenge

## Table of Contents

- [Table of Contents](#table-of-contents)
- [Parts](#parts)
- [Working branch](#working-branch)
- [Submission](#submission)
- [Running the Application](#running-the-application)
- [Overview: Using the Java Stream API](#Using-the-Java-Stream-filter-API)
- [Answer Key](#answer-key)
- [Recommended Resources](#recommended-resources)


## Working branch

1. Navigate to the cloned repository on your local machine
1. Check out the starter code for part one:

    ```bash
    git checkout part1
    ```

1. Create a new branch for your development work:

    ```bash
    git checkout -b develop/part1
    ```

1. Push your new local branch to the remote repository and set your local branch to track the new remote branch:

    ```bash
    git push -u origin develop/part1
    ```

After you have completed your work for each part and committed & pushed your changes up to the remote repository, you
are ready to open a pull request for submission.

## Submission

1. Navigate to your GitHub repository
1. Open a pull request from your working branch to the starting branch (`develop/part1`&rarr;`part1`).

> Be sure to assign a reviewer so they will receive a notification that your solution is ready for review.
>
> If you do not have a reviewer yet, please email [Ian Shinbrot](mailto:ishinbrot@captechconsulting.com)


## Running the Application

To run the application, open a terminal window and execute the following commands:

```bash
mvn package
java -jar target/classroom-tech-challenge-1.0-SNAPSHOT.jar
You may alternatively use the built-in compilier in your specific IDE
```


## Overview: Using the Java Stream filter API

Welcome to Part 1 of the Lambda and Streams TechChallenge!

There are 4 classes contained in this challenge. The Utility class is a helper static class that contains the lists of students and professors that will be used throughout this challenge.
The only file that should be modified throughout this course is the App.java file.

In Part 1, we would like to print out each professor followed by a list of their students.
Every professor is currently teaching one class, however every student is taking at least 2 classes.
Every student contains a list of each professor, and each professor should be added to each student.
Additionally, every professor assigns students the same grade per class.
Calculate the total number of points each student has, and assign it to each student. This will be used in a later part of this challenge.

## Using Java Streams
Normally in Java 7 and below, this will be done with a long iteration that wwould take multiple lines to write
Utilizing Java Streams this can be done in less than 7 lines (including brackets).
Utilzing Java Streams and Lambdas we can iterate through the array more simply...

## Java Lambdas 
writing something like (int i=0, i<studentList.size(), i++)
can be shortened to studentList.forEach(student-> {});


## Answer key:
Your output should appear as follows:

Professor Jeffrey Popyack has the following students: Jon Goldstein  **Enter**
Pat Salemo&nbsp;
Jenna Pascal&nbsp;
Tim Smith&nbsp;
Dwight Schrute&nbsp;
Mose Schrute&nbsp;
Pam Scott&nbsp;
Jim Halpert&nbsp;

Professor Jack Dawson has the following students: Tom Brown&nbsp;
Jon Goldstein&nbsp;
Jack Ryan&nbsp;
Jenna Goldstein&nbsp;
Michael Scott&nbsp;
Pete Halpert&nbsp;
Tony Brown&nbsp;

Professor Keith Goldman has the following students: Jon Goldstein&nbsp;
Tim Scott&nbsp;
Dwight Schrute&nbsp;
Mose Schrute&nbsp;

Professor Timothy Donahue has the following students: Tom Brown&nbsp;
Robert DeNiro&nbsp;
Jenna Goldstein&nbsp;
Pam Scott&nbsp;
Jim Halpert&nbsp;

Professor Michael Conforto has the following students: Pat Salemo&nbsp;
Ty Timothy&nbsp;
Mose Schrute&nbsp;
Pam Halpert&nbsp;

## Recommended Resources

You may wish to consult the following resources for useful information on utilizing Java Streams and Lambdas

 - [Streams-in-Java 8](https://stackify.com/streams-guide-java-8/)