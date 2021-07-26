package main.java.Ucf.assignments.App;


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