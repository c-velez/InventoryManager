/*
 * UCF COP3330 Summer 2021 Assignment 5 Solution
 * Copyright 2021 Christopher Velez
 */

package ucf.assignments;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class InventoryTrackerApplication extends Application {

    private final SceneOperator sceneOperator = new SceneOperator();

    @Override
    public void start(Stage stage) {
        Parent root = sceneOperator.readyScene(Views.MAIN);
        sceneOperator.popUpScene("Inventory Tracker", root);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
