![CapTech Banner](https://github.com/captechconsulting/springboot-techchallenge/blob/part0/src/main/resources/images/CaptechLogo.png)


# Part 3: Java and Lambda tech challenge

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
| [Part 2: Sort Using the Java Stream API](../../tree/part2)     |
| [Part 3: Java Stream Grouping and Count](#part-3-Java-Stream-Grouping) |

## Working branch

1. Navigate to the cloned repository on your local machine
1. Check out the starter code for part one:

    ```bash
    git checkout part3
    ```

1. Create a new branch for your development work:

    ```bash
    git checkout -b develop/part3
    ```

1. Push your new local branch to the remote repository and set your local branch to track the new remote branch:

    ```bash
    git push -u origin develop/part3
    ```

After you have completed your work for each part and committed & pushed your changes up to the remote repository, you
are ready to open a pull request for submission.

## Submission

1. Navigate to your GitHub repository
1. Open a pull request from your working branch to the starting branch (`develop/part1`&rarr;`part3`).

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

## Overview: Introducing Java Stream Grouping and Count functionality
In part 3 of the tech challenge we will learn how to create split up the students by major utilizing Java Streams. <br/>
You will then print out all the Jon's in the student list as well as their given major. <br/>
Java stream allows us to easily group matching elements in a list, as well as construct a new hashmap.<br/>
Please group the names in the list in alphabetical order by first name. <br/>
This can be done by using the streams sorted function and lambdas. <br/>
To seperate the student List by major the groupingBy function can be used to seperate each student by Major. <br/>

For the second step of the excercise we want to print out the total number of Jon's for each major. This will be done using Java stream count method. <br/>
For the last step of the excercise you will need to iterate through the new hashmap and print out the first instance of Jon for each major. Use the filter function to ensure you are only looping through the Jons in the list.<br/>
We want to print out the students full name, and their associated major, only if they exist. <br/>
Print out the students with the first name Jon. Not all of the majors have students with the first name Jon <br/>

**If the student does not exist then we will not print anything out for each respective major**


## Answer Key

Your output should look like the following:

Major:Computer Science has 1 number of students with the first name Jon. <br/>
Major:Computer Science with student Jon Goldstein<br/>
Major:Business Administration has 0 number of students with the first name Jon. <br/>
Major:Data Analytics has 1 number of students with the first name Jon. <br/>
Major:Data Analytics with student Jon Tucker<br/>
Major:Graphic Design has 0 number of students with the first name Jon. <br/>

## Recommended Resources
You can reference how to use the groupingBy function on this page 
https://www.baeldung.com/java-groupingby-collector

