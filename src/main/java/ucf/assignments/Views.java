/*
 * UCF COP3330 Summer 2021 Assignment 5 Solution
 * Copyright 2021 Christopher Velez
 */

package ucf.assignments;

public enum Views {
    MAIN("InventoryTrackerMain.fxml"),
    ADD("AddNewItemScene.fxml"),
    EDIT("EditItemScene.fxml"),
    DELETE("DeleteItemScene.fxml"),
    ERROR("ErrorScene.fxml");

    private final String fileName;

    Views(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
