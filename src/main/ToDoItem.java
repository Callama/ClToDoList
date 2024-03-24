package main;


public class ToDoItem {

    public int id;
    private String message;
    private String due;
    private boolean isCompleted;

    /** A constructor to create a new to-do item with just an initial ID. */
    public ToDoItem(int initialID) {
        message = "None";
        due = "Not Set";
        isCompleted = false;
        id = initialID;

    }
    /** A constructor to create a new to-do item with all information. */
    public ToDoItem(int initialID, String initialMessage, String initialDue) {
        message = initialMessage;
        due = initialDue;
        isCompleted = false;
        id = initialID;
    }

    /** Print out the actual to-do item. */
    public void print() {
        String checkmark = " ";
        if (isCompleted)
            checkmark = "X";
        int tempId = id + 1;
        System.out.println(tempId + ".) [ " + checkmark + " ] - " + message + " --- Due: " + due);

    }

    public static void print(ToDoItem item) {
        item.print();

    }

    /** non-static method to finish an item and mark completed. */
    public void finish() {
        isCompleted = true;
    }
    /** Static method to mark an item completed; used when dealing with the ToDoList object. */
    public static void finish(ToDoItem item) {
        if (item != null)
            item.finish();
    }

    


    
    
}
