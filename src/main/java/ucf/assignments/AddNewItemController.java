/*
 * UCF COP3330 Summer 2021 Assignment 5 Solution
 * Copyright 2021 Christopher Velez
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.InvalidPropertiesFormatException;

public class AddNewItemController {

    @FXML private TextField itemNameTextField;
    @FXML private TextField itemSerialNumberTextField;
    @FXML private TextField itemValueTextField;
    @FXML private Button addNewItemOkButton;
    @FXML private Button addNewItemCancelButton;

    private Item newItem = new Item();
    private InventoryList list = new InventoryList();
    private final ErrorOperator errorOperator = new ErrorOperator();
    private final SceneOperator sceneOperator = new SceneOperator();

    public void initialize(Item item, InventoryList list) {
        this.newItem = item;
        this.list = list;
    }
    
    public void setNewItemName() throws InvalidPropertiesFormatException {
        newItem.setName(itemNameTextField.getText());
    }

    public void setNewItemSerialNumber() throws InvalidPropertiesFormatException{
        newItem.setSerialNumber(itemSerialNumberTextField.getText());
    }

    public void setNewItemValue() {
        newItem.setValue(Double.parseDouble(itemValueTextField.getText()));
    }

    public void addItem() {
        list.addItem(newItem);
    }

    private void errorMessage(String message) {
        Parent page = sceneOperator.readyScene(Views.ERROR);
        ErrorSceneController errorSceneController = sceneOperator.getLoader().getController();
        errorSceneController.initialize(message);
        sceneOperator.popUpScene("Error", page);
    }

    @FXML void addNewItemOkButtonPressed(ActionEvent event) {
        try {
            setNewItemName();
            setNewItemSerialNumber();
            setNewItemValue();
            addItem();
        } catch (InvalidPropertiesFormatException invalidPropertiesFormatException) {
            errorMessage(invalidPropertiesFormatException.getMessage());
        }

        Stage currentStage = (Stage) addNewItemOkButton.getScene().getWindow();
        currentStage.close();
    }

    @FXML void addNewItemCancelButtonPressed(ActionEvent event) {
        Stage currentStage = (Stage) addNewItemCancelButton.getScene().getWindow();
        currentStage.close();
    }
}
