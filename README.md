Documentation for EXERCISE 2 – WEB UI AUTOMATION

This project is composed of the below:
BDD Framework - Cucumber, 
Testing framework - Selenium, 
Model - Page object model,
Language - Java, 
Testing - jUnit,
Reporting - html reports,
logs - log4j


Project Structure:
TESTRUNNER: The execution starts from TestRunner file present under src/test/java/Cucumber.options. This file defines the location of feature files and the step definition files. In our project we have feature files designed with the tag @Regression. TESTRUNNER file runs all the scenarios in feature files tagged as @Regression. 

FEATURE FILES: Feature files are present under src/test/resources/features. These are the files which describes the features and scenarios under test. This is written in GHERKIN language which has the syntax - 'GIVEN,WHEN,THEN' to descripbe the steps of a test case.

STEPDEFINITIONS: Stepdefinition files are present under src/test/java/stepDefinitions. Every line written in a feature file under a scenario will have a java method tagged in stepdefinition file. This stepdefinitions can in turn be structured in several ways. This folder also have HOOKS.java file which will be used for executing a set of commands before and after running the testscases. Action classes implements the methods for stepdefinitions and also uses pageobject model.

OTHER FILES: The utils package has supporting classes and reusable components to perform test executions. 


HOW TO RUN THIS AUTOMATION?

Local Machine setup:

Download/clone this project to a local folder;
Pre-requisites For Windows OS : Step 1:Install JDK and set Java home Step 2: Install Maven 3.0.3+ Step 3: Ensure maven binaries are on your PATH (ie. you can run mvn from anywhere)
Open command prompt and navigate to the project folder path.
Provide the following commands for test execution: mvn verify(to run all the test cases)
REPORTS: Once the RUN is completed, all the reports can be picked from the path target/cucumber.html file.
Logs: The log files are generated in the logs folder.