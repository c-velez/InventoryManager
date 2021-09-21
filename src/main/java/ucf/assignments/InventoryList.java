/*
 * UCF COP3330 Summer 2021 Assignment 5 Solution
 * Copyright 2021 Christopher Velez
 */

package ucf.assignments;

import java.util.ArrayList;

public class InventoryList {
    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void deleteItem(String serialNumber) {
        for(Item item : items) {
            if(serialNumber.equals(item.getSerialNumber())) {
                items.remove(item);
                break;
            }
        }
    }

    public Item getInventoryItem(String serialNumber) {
        Item requestedItem = new Item();

        for(Item item : items) {
            if(serialNumber.equals(item.getSerialNumber())) {
                requestedItem = item;
            }
        }

        return requestedItem;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
