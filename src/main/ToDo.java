package main;

import java.util.Scanner;


public class ToDo {
public static void main(String[] args) {

    ToDoList items = new ToDoList(3);

    items.newItem("lol", "now");
    items.newItem("x", "yo");
    items.newItem("y", "bbbo");


   
    ToDoItem.finish(items.getItem(3));
    items.print();
    
    }

    
}