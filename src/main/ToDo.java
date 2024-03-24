package main;


@SuppressWarnings("unused")

public class ToDo {
public static void main(String[] args) {

    ToDoList items = new ToDoList(3);

    items.newItem("lol", "now");
    items.newItem("x", "yo");
    items.newItem("y", "bbbo");


   
    ToDoItem.finish(items.getItem(3));
    ToDoItem.finish(items.getItem(-10000));
    items.print();

    items.newItem("y", "bbbo");
    
    }

    
}