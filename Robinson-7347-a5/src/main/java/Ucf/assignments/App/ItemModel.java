package main.java.Ucf.assignments.App;
/*
 *  UCF COP3330 Summer 2021 Assignment 5 Solution
 *  Copyright 2021 Keondez Robinson
 */

import java.util.ArrayList;
import java.util.List;

public class ItemModel {
    private List<Item> items;

    public ItemModel() {
        this.items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return items;
    }
}