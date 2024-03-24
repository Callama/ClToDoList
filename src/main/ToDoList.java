package main;
public class ToDoList {

    private int length = 0;
    private int totalItems = -1;
    private ToDoItem[] items; 

    public ToDoList(int initialLength) {
        length = initialLength;
        items = new ToDoItem[length];
    }


    public void print() {
        for (int n = 0; n < length; n++) {
            if (items[n] != null)
            items[n].print();
        }
    }

    public void newItem(String message, String due) {
        totalItems += 1;
        ToDoItem item = new ToDoItem(totalItems, message, due);
        items[totalItems] = item;
    }

    public ToDoItem getItem(int id) {
        return items[id-1];
    }


}
