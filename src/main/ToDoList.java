package main;


public class ToDoList {

    private int length = 0;
    private int totalItems = -1;
    private ToDoItem[] items; 

    /** A constructor to create a new list with initalLength of array to hold items */
    public ToDoList(int initialLength) {
        length = initialLength;
        items = new ToDoItem[length];
    }

    /** Print out all of the to-do items in the list. */
    public void print() {
        for (int n = 0; n < length; n++) {
            if (items[n] != null)
            items[n].print();
        }
    }


    /** Make a new to-do item and add it to the list */
    public void newItem(String message, String due) {
        totalItems += 1;
        ToDoItem item = new ToDoItem(totalItems, message, due);
        try {
            items[totalItems] = item;
            }
        catch(Exception e) {
            System.out.println("Error: Only " + length + " items are allowed in this list.");
        }
    }
    /** Return an item from the array. */
    public ToDoItem getItem(int id) {
        // Minus one because all printed to-do items are + 1 to avoid 0
        try {
            return items[id-1];
            }
        catch(Exception e) {
            System.out.println("Error: An item with the id " + id + " does not exist.");
            return null;
            }
        
    }


}
