/*
 * UCF COP3330 Summer 2021 Assignment 5 Solution
 * Copyright 2021 Christopher Velez
 */

package ucf.assignments;

import java.util.InvalidPropertiesFormatException;

public class Item {
    private String name;
    private String serialNumber;
    private Double value;
    private ErrorOperator errorOperator = new ErrorOperator();

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidPropertiesFormatException {
        if(name.length() < 2) {
            this.name = "name";
            throw new InvalidPropertiesFormatException("Item name must be more than 2 characters.");
        } else if(name.length() > 256) {
            this.name = "name";
            throw new InvalidPropertiesFormatException("Item name must be less than 256 characters.");
        }else {
            this.name = name;
        }
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) throws InvalidPropertiesFormatException{
        if(serialNumber.length() != 10) {
            this.serialNumber = "serial number";
            throw new InvalidPropertiesFormatException("Serial Number must be 10 alpha-numeric characters long.");
        } else if (!serialNumber.matches("[a-zA-Z0-9]{10}")) {
            this.serialNumber = "serial number";
            throw new InvalidPropertiesFormatException("Serial number must not contain special characters.");
        } else {
            this.serialNumber = serialNumber;
        }
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    private boolean checkSerialNumber(String serialNumber) {
        return errorOperator.checkSerialNumber(serialNumber);
    }

    private boolean checkValue(Double value) {
        return errorOperator.checkValue(value);
    }
}
