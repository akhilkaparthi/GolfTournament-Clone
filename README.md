#GOLF Tournament Spring Boot Application

## Overview
This is a Spring Boot Project developed using Java 11, Spring Web, JPA, Swagger, Mockmvc and Mockito.

The db is a local instance of H2.

In future this project can be migrated to any of the RDBMS database.

# Setting Up the Development Environment

## Install Java 11
This application is developed using the Java 11 JDK. The JDK can be obtained here:
https://www.oracle.com/uk/java/technologies/javase-jdk11-downloads.html


## Install GIT
GIT is a distributed version control system that is used as the version control system within the project.

1. Obtain and install the GIT version control system from the [Git download page](http://git-scm.com/)
2. Install the application using the downloaded installation program

Verify that GIT is correctly installed by opening a new terminal window and typing:
```
#!bash
git --version
```
A message similar to the following should be displayed:
```
#!bash
git version 2.30.1 
```
## Obtaining the Source Code
The framework for the exercise is available from github https://github.com/akhilkaparthi/GolfTournament.git. Checkout the project from GitHub using the following:
```
#!bash
git clone https://github.com/akhilkaparthi/GolfTournament.git
```

## Building the software using gradle
To build the software use:

```
#!bash
cd game
./gradlew build
```
To perform a clean build:
```
#!bash
./gradlew clean build
```
To Execute All Tests
```
#!bash
./gradlew test
```
## Swagger is used for the API documentation
View the Swagger QApiA Docs at [Golf Tournament API](http://localhost:8080/swagger-ui.html#!)
## Available  APIs
This projects consists of following APIs

**/golf-tournament/createDataSource1*

**/golf-tournament/createDataSource2*

## Following properties are used for metrics and monitoring
prometheus and actuator

## Used for CI/CD
Distributed Management
SEM section


## Deployment
Once we identify database readiness can be checked with (http://localhost:8080/ready)

### Namings of Data Source are given as 1 and 2 because of requirement and it can be replaced with meaning name

### Two different DTOs are given for data sources because of limitations in swagger for Alias

