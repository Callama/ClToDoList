package main;

public class ToDoItem {

    public int id;
    private String message;
    private String due;
    private boolean isCompleted;

    public ToDoItem(int initialID) {
        message = "None";
        due = "Not Set";
        isCompleted = false;
        id = initialID;

    }

    public ToDoItem(int initialID, String initialMessage, String initialDue) {
        message = initialMessage;
        due = "Not Set";
        isCompleted = false;
        id = initialID;
    }


    public void print() {
        String checkmark = " ";
        if (isCompleted)
            checkmark = "X";
        int tempId = id + 1;
        System.out.println(tempId + ".) [ " + checkmark + " ] - " + message + " --- Due: " + due);

    }

    public void finish() {
        isCompleted = true;
    }

    public static void finish(ToDoItem item) {
        item.finish();
    }

    


    
    
}
