package com.venkatraj;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceries;

    public GroceryList() {
        this.groceries = new ArrayList<String>();
    }

    public String getItem(int position) {
        return groceries.get(position);
    }

    public void addItem(String item) {
        groceries.add(item);
    }

    public boolean modifyItem(String oldItem, String newItem) {
        if (hasItem(oldItem)) {
            groceries.set(findItem(oldItem), newItem);
            return true;
        }
        return false;
    }

    public boolean hasItem(String item) {
        return groceries.contains(item);
    }

    public int findItem(String item) {
        return groceries.indexOf(item);
    }

    public boolean removeItem(String item) {
        if (hasItem(item)) {
            return groceries.remove(item);
        }
        return false;
    }

    public int size() {
        return groceries.size();
    }
}
