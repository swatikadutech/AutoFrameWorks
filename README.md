# AutoFrameWorks

1.	Project Structure: Page Object Model
 

2.Components of framework:
•	Configuration
•	Driver
•	Screenshot
•	SRC\main\test\java – Page Object
•	Testcases
•	testData
•	utilities 

Configuration: This directory contains Config.properties file, which basically has all the prop = value pairings of important configuration , eg : URL , username, password
Driver: This Directory contains chrome driver executable file
PageObject:  As this is the page object based framework, this directory would include all pages (java files) persisted to AUT(application under test)
TestCases: As name suggest, all test cases would be returned under this segment
TestData: This would contain excel (data driven execution)
Utilities: This folder would contain all the common utilities classes needed for smooth running of framework. Eg – excel reading utilities, Config file reading utilities 
Testng.xml: configurable xml for bulk and selective running of test cases
Pom.Xml: all dependency needed for our framework to continue working.


As this is a maven-based framework, we can have many more future extensions like rerun of failed test cases, extent report for proper reporting, integration with Jenkins and many more


Framework component and Process:
 

Test Cases:
1.Verify user lands on home page using URL
2.Verify user able to login with multiple test data details
3.Verify login functionality for multiple users
4.Verify search functionality on computer tab
5.Verify sell-> item functionality.


