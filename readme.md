# Inventory Management Application

## Overview

Using IntelliJ Gradle, you will create a GUI-Based desktop application to allow a user to track their personal inventory.

The program should allow you to enter an item, a serial number, and estimated value.
The program should then be able to display a tabular report of the data that looks like this:

~~~
Value       Serial Number   Name
$399.00     AXB124AXY       Xbox One
$599.99     S40AZBDE4       Samsung TV
~~~

The program should also allow the user to export the data as either a tab-separate value (TSV) file, or as an HTML file. When exported as an HTML file, the data should be stored inside of a table structure to mimic the displayed appearance.

You will be responsible for both the design (UML diagrams) and implementation (production and test code) of this application.

## Directions

### Requirements

#### Application Requirements
- [x] Rqmt 1: The user shall interact with the application through a Graphical User Interface
- [x] Rqmt 2: The user shall be able to store at least 100 inventory items
- [x] Rqmt 11: The user shall be able to search for an inventory item by serial number
- [x] Rqmt 12: The user shall be able to search for an inventory item by name
- [x] Rqmt 13: The user shall be able to save their inventory items to a file
    - [x] Rqmt 13a: The user shall be able to select the file format from among the following sets of options: TSV (tab-separated value), HTML, JSON
        - [x] Rqmt 13ai: TSV file shall list one inventory item per line, separate each field within an inventory item using a tab character, and end with the extension .txt
        - [x] Rqmt 13aii: HTML files shall contain valid HTML and end with the extension .html
        - [x] Rqmt 13aiii: JSON files shall contain valid JSON and end with the extension .json
    - [x] Rqmt 13b: The user shall provide the file name and file location of the file to save
- [x] Rqmt 14: The user shall be able to load inventory items from a file that was previously created by the application
      - [x] Rqmt 14a: The user shall provide the file name and file location of the file to load
- [x] Rqmt 8: The user shall be able to sort the inventory items by value
- [x] Rqmt 9: The user shall be able to sort the inventory items by serial number
- [x] Rqmt 10: The user shall be able to sort the inventory items by name

#### List Requirements
- [x] Rqmt 3: The user shall be able to add a new inventory item
  - [x] Rqmt 3a: The application shall display an error message is the user enters and existing serial number for the new item
- [x] Rqmt 4: The user shall be able to remove an existing inventory item

#### Item Requirements
- [x] Rqmt 5: The user shall be able to edit the value of an existing inventory item
- [x] Rqmt 6: The user shall be able to edit the serial number of the existing inventory ite,
  - [x] Rqmt 6a: The application shall prevent the user from duplicating the serial number
- [x] Rqmt 7: The user shall be able to edit the name of an existing inventory item
- [x] Rqmt 2a: Each inventory item shall have a value representing its monetary value in US dollars
- [x] Rqmt 2b: Each inventory item shall have a unique serial number in the format of XXXXXXXXXX where X can be either a letter or a digit
- [x] Rqmt 2c: Each inventory item shall have a name between 2 and 256 characters in length (inclusive)


- [x] You **shall** create a single IntelliJ project (using *Gradle*) and GitHub repository and ensure that your solution code has been pushed to the appropriate repository prior to the submission of the assignment.

- [x] Your GitHub repository must follow the naming convention of <lastname>-<last4 numbers of UCFID>-a5
    - Your GitHub history will allow us to show the evolution of your solution. You should commit and push your code each time you complete a requirement (including successful testing)
    
- [x] You **shall** use a .gitignore file to ensure that your **.gradle** and **build** folders are not stored within git
    - Your repository should contain the following files and directories (will all expected subdirectories and files):
~~~
/.idea/
/uml/
/gradle/
/src/
/.gitignore
/build.gradle
/gradlew
/gradlew.bat
/settings.gradle
~~~

- [x] You **shall** place your code within a package named ucf.assignments

- [x] You **shall** create a Class Diagram for your application using PlantUML. This diagram must be pushed to your Git repository along with your java code
    - Each class within your diagram must list both the attributes and methods defined within that class
    - You must store your \*.puml files in a `uml` folder at the root level of your project

- [x] You **shall** create your application GUI using FXML and store the associated \*.fxml files in your project's `resources` folder.

- [x] You **shall** create a file named `README.md` that contains a user guide for your application. This file must be placed within the root directory of your project.
    - This guide should describe how to perform each operation specified in the requirements

- [x] You **shall** follow good programming practices, as outlines in the course notes for Module 2.
    - You must decompose your solution into multiple classes, each of which will possess a single responsibility and will contain a series of highly cohesive methods.

- [x] You **shall** write your java code in accordance with either the Oracle or Google Java coding standard.

- [x] You **shall** use JUnit 5 to incorporate automated unit testing into your solutions
    - You must create a unit test for each behavior specified in the application
    - You must include pseudocode in each test

- [x] Your application and unit tests **shall** be completely implemented and run without errors on the grader's machine
    - This means that any paths should be relative to the working directory of your program
        - Do not place user-oriented data files within your package structure
        - Do not assume directories exist

- [x] You **should** write detailed pseudocode for each of your methods prior to writing your test and production code
