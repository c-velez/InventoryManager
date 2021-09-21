/*
 * UCF COP3330 Summer 2021 Assignment 5 Solution
 * Copyright 2021 Christopher Velez
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ErrorSceneController {

    @FXML private Label errorMessageLabel;

    @FXML private Button errorSceneOkButton;

    public void initialize(String message) {
        errorMessageLabel.setText(message);
    }

    @FXML
    void errorSceneOkButtonPressed(ActionEvent event) {
        Stage currentStage = (Stage) errorSceneOkButton.getScene().getWindow();
        currentStage.close();
    }
}
