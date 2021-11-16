# Inventory Management Application

## Overview

The purpose of this application is to allow a user to store an inventory of at least 100 items. Each item will have a unique serial number, estimated value, and a name. A user will be able to edit each field of the item. Additionally, a user will be able to export thier inventory in a JSON, TSV, or HTML format for use elsewhere.

The program should will display a tabular report of the data that looks like this:

~~~
Value       Serial Number   Name
$399.00     AXB124AXY       Xbox One
$599.99     S40AZBDE4       Samsung TV
~~~

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
