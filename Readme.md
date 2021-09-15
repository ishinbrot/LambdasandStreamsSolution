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


## Working branch

1. Navigate to the cloned repository on your local machine
1. Check out the starter code for part one:

    ```bash
    git checkout part1
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

## Overview: Introduction to Sort and Count using Java Streams

Now that you have identified which professor is teaching which students using java streams, it is time to sort each class by a students last name.
Every professor contains a list of students, along with their respective class list<br/>

Every class the professor teaches is graded on either a pass/fail, but affects the students GPA differently.<br/>
Each professor has a specifc grade in their class. That is the grade they will automatically give every student upon completing.<br/>
Use the grades to update each students new GPA. Utilize Java Streams and Lambda functions.

Every professor is assigned a grade, and has given each student their respective grade. All of the students have had their total number of grade points added up.<br/>
They do not yet have their GPA. In order to compute their GPA you need to divide their grade by the number of classes they are taking<br/>

After you are done sort all of the students by their last name and print out the output using java streams in one line<br/>
Use the updated Java 8 interface for sorting the list using a comparator lambda function to return a new stream.<br/>
Please use collect afterwards to construct a new list from the sorted list<br/>
Sorting the array can be done on one line using Java Stream

You can find information related to java streams and lambdas at the following link:

## Answer Key:
The output of the application should look like below:
Tom Brown grade 3 <br/>
Tony Brown grade 4 <br/>
Robert DeNiro grade 3 <br/>
Jon Goldstein grade 2  <br/>
Jon Goldstein grade 4 <br/>
Jenna Goldstein grade 3<br/>
Pam Halpert grade 5<br/>
Jim Halpert grade 3<br/>
Pete Halpert grade 4<br/>
Jenna Pascal grade 3<br/>
Jack Ryan grade 4<br/>
Pat Salemo grade 4<br/>
Dwight Schrute grade 2<br/>
Mose Schrute grade 3<br/>
Tim Scott grade 2<br/>
Michael Scott grade 4<br/>
Pam Scott grade 3<br/>
Jack Smith grade 4<br/>
Tim Smith grade 3<br/>
Ty Timothy grade 5<br/>

## Recommended Resources

You may wish to consult the following resources for useful information on utilizing Java Streams and Lambdas

-[Java Streams](https://stackify.com/streams-guide-java-8/)
-[Lambda Expressions](https://www.geeksforgeeks.org/lambda-expressions-java-8/)
-[Information related to java sorting](https://howtodoinjava.com/java8/stream-sorted-method/)