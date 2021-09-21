/*
 * UCF COP3330 Summer 2021 Assignment 5 Solution
 * Copyright 2021 Christopher Velez
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class DeleteItemController {

    private InventoryList list;

    @FXML private Button yesButton;
    @FXML private Button noButton;
    
    public void initialize(InventoryList list) {
        this.list = list;
    }

    @FXML void yesButtonPressed(ActionEvent event) {

    }

    @FXML void noButtonPressed(ActionEvent event) {
        Stage currentStage = (Stage) noButton.getScene().getWindow();
        currentStage.close();
    }

}