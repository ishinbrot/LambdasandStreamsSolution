![CapTech Banner](https://github.com/captechconsulting/springboot-techchallenge/blob/part0/src/main/resources/images/CaptechLogo.png)

# Part 0: Java and Lambda tech challenge

Welcome to the Lambda and Streams API TechChallenge, presented by CapTech Consulting! The challenge consists of 3 parts. <br/>
This guide for Part 0 of the challenge provides instructions for setting up your development environment in order to begin part 1. <br/>
Be sure to read the **README** for each part before beginning!

## Table of Contents
|                                                                                                |
| :--------------------------------------------------------------------------------------------- |
| [Part 0: Getting Started](../../tree/part0)                                                    |
| [Part 1: Introduction to  Java Stream filters and lambdas](../../tree/part1)                    |
| [Part 2: Sort Using the Java Stream API](../../tree/part2)     |
| [Part 3: Java Stream Grouping and Count](#part-3-Java-Stream-Grouping) |


- [Prerequisites](#Prerequisites)
- [Development Environment Setup](#Development-Environment-Setup)
- [Install Maven](#Install-Maven)
- [IDEs](#IDEs)
- [Create an Account and Setup Authentication](#Create-an-Account-and-Setup-Authentication)
- [Assignment Work & Submission](#Assignment-Work-&-Submission)
- [Recommended Resources](#recommended-resources)

## Prerequisites

This TechChallenge introduces Jave 8 features such as Lambda and Stream APIs that are used within a command line application. <br/>

To complete the challenge, the following are **REQUIRED**:

- A basic understanding of object-oriented programming with Java
- A local development environment with the following software installed:
  - **Java Development Kit** (JDK) version 1.8+
  - **Maven** version 3+
  - **Git** (version control system)
  - **Eclipse or your favorite Integrated Development Environment (IDE)**
  - **Access to the Lambda and Streams TechChallenge code repository on Github**


## Development Environment Setup

### Install JDK

To install the JDK, see the official [Oracle
documentation](https://docs.oracle.com/en/java/javase/14/install/overview-jdk-installation.html#GUID-8677A77F-231A-40F7-98B9-1FD0B48C346A)
for your operating system.

### Install Maven

To install the latest version of Maven, see the installation instructions from [Maven's
documentation](https://maven.apache.org/install.html) for your operating system.

### Install Git

To install Git, see the installation instructions from [Git's
documentation](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git) for your operating system.

### IDEs

You may use Eclipse or your preferred IDE to complete this challenge. See below for some suggested options if you do
not have a preferred IDE already installed:

- [Eclipse IDE 2020](https://www.eclipse.org/downloads/)
- [IntelliJ IDEA 2019 Community Version](https://www.jetbrains.com/idea/download)
  > Note: Select the appropriate download for your operating system
- [Visual Studio Code](https://code.visualstudio.com/)
- [NetBeans 8.2](https://netbeans.org/images_www/v6/download/community/8.2/)


### Access the Lambda and Streams TechChallenge

In order to obtain the source code and instructions for each part of the TechChallenge, you will need access to the
Challenge's code repository on Github. See the following instructions to request access and clone the repo:

#### Create an Account and Setup Authentication

1. **Create a new Github account** with a new username and password [here](https://github.com/join?source=header-home).
1. **Link your new GitHub account to CapTech** by clicking [here](http://capte.ch/github) after logging into GitHub with your new account. Once there you should see a pop-up on the top of the page with a button to authenticate your account. Follow the steps to authenticate.
1. In the future, if your browser logs you in automatically, you may not see the CapTech tech challenges. You will need to click on the single sign-on link and authenticate through CapTech to see the repositories. This link is located on the top of your homescreen.

## Assignment Work & Submission

[GitHub classroom](https://classroom.github.com/a/ivTS9er1) should already have generated a copy of the tech challenge for you to work on named `captechconsulting/LambdaAndStreams-{your captech id}`. You will be working from this repository for the duration of the challenge.

Once you have cloned your working repository to your local machine, create a branch to house work for each part.

1. Navigate to the cloned repository on your local machine
1. Check out the relevant branch with starter code for the part you are working on. Using `part 1` as an example:

    ```bash
    git checkout part1
    ```

1. Create a new branch for your development work on each part. For example:

    ```bash
    git checkout -b develop/part1
    ```

1. Push your new local branch to the remote repository and set your local branch to track the new remote branch:

    ```bash
    git push -u origin develop/part1
    ```

After you have completed your work for each part and committed & pushed your changes up to the remote repository, you
are ready to open a pull request for submission.

### Submission

1. Navigate to your GitHub repository
1. Open a pull request from your working branch to the starting branch (for example: `develop/part1`&rarr;`part1`).
1. **Be sure to assign a reviewer so they will receive a notification that your solution is ready for review.**

  > If you do not have a reviewer yet, please email [Ian Shinbrot](mailto:ishinbrot@captechconsulting.com)

## If you made it this far, Congratulations! You are now ready to proceed with Part 1 of the TechChallenge!

[Go to Part 1: Introduction to Java Stream filters and lambdas](../../tree/part1)
## Recommended Resources

You may wish to consult the following resources for useful information on utilizing Java Streams and Lambdas

 - [Streams-in-Java 8](https://stackify.com/streams-guide-java-8/)