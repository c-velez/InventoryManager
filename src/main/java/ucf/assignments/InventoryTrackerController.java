/*
 * UCF COP3330 Summer 2021 Assignment 5 Solution
 * Copyright 2021 Christopher Velez
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.stage.FileChooser;

public class InventoryTrackerController {

    @FXML private TableView<Item> inventoryTableView;
    @FXML private Button addItemButton;
    @FXML private Button editItemButton;
    @FXML private Button deleteItemButton;
    @FXML private TextField searchItemBar;
    @FXML private Button searchItemButton;
    @FXML private MenuItem saveButton;
    @FXML private MenuItem openButton;

    private TableView.TableViewSelectionModel<Item> selection;
    private InventoryList inventoryList;

    private final TableOperator tableOperator = new TableOperator();
    private final SceneOperator sceneOperator = new SceneOperator();
    private final FileOperator fileOperator = new FileOperator();
    private final FileChooser fileChooser = new FileChooser();

    public void initialize() {
        tableOperator.setTable(inventoryTableView);
        tableOperator.buildTable();

        inventoryTableView = tableOperator.getTable();
        selection = tableOperator.getSelection();
    }

    @FXML
    void addItemButtonPressed(ActionEvent event) {
        Item newItem = new Item();

        Parent page = sceneOperator.readyScene(Views.ADD);
        AddNewItemController addNewItemController = sceneOperator.getLoader().getController();
        addNewItemController.initialize(newItem, inventoryList);
        sceneOperator.popUpScene("Add Item", page);

        inventoryTableView.getItems().clear();
        tableOperator.loadTable(inventoryList);
    }

    @FXML
    void deleteItemButtonPressed(ActionEvent event) {
        Item selectedItem = selection.getSelectedItem();

        Parent page = sceneOperator.readyScene(Views.DELETE);

        DeleteItemController deleteItemController = sceneOperator.getLoader().getController();

        sceneOperator.popUpScene("Delete Item", page);

    }

    @FXML
    void editItemButtonPressed(ActionEvent event) {
        Parent page = sceneOperator.readyScene(Views.EDIT);

        EditItemController editItemController = sceneOperator.getLoader().getController();

        sceneOperator.popUpScene("Edit Item", page);

    }

    @FXML
    void openButtonPressed(ActionEvent event) {

    }

    @FXML
    void saveButtonPressed(ActionEvent event) {

    }

    @FXML
    void searchItemButtonPressed(ActionEvent event) {

    }

}

