/*
 * UCF COP3330 Summer 2021 Assignment 5 Solution
 * Copyright 2021 Christopher Velez
 */

package ucf.assignments;

import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TableOperator {

    private TableView<Item> table;
    private TableView.TableViewSelectionModel<Item> selection;

    public void buildTable() {
        TableColumn<Item, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setPrefWidth(225);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Item, String> serialNumberColumn = new TableColumn<>("Serial Number");
        serialNumberColumn.setPrefWidth(100);
        serialNumberColumn.setCellValueFactory(new PropertyValueFactory<>("serialNumber"));

        TableColumn<Item, Double> valueColumn = new TableColumn<>("Value");
        valueColumn.setCellValueFactory(new PropertyValueFactory<>("value"));

        table.setPlaceholder(new Label("No items in inventory"));

        table.getColumns().add(nameColumn);
        table.getColumns().add(serialNumberColumn);
        table.getColumns().add(valueColumn);

        selection = table.getSelectionModel();
    }

    public void setTable(TableView<Item> table) {
        this.table = table;
    }

    public TableView<Item> getTable() {
        return table;
    }

    public TableView.TableViewSelectionModel<Item> getSelection() {
        return selection;
    }

    public void loadTable(InventoryList list) {
        for(Item item : list.getItems()) {
            table.getItems().add(item);
        }
    }
}
