package main;

import java.util.Scanner;

public class ToDo {
    public static void main(String[] args) {

    System.out.println("How many to-do list items would you like to create? (This will be the maximum allowed.)");
    Scanner keyboard = new Scanner(System.in).useDelimiter("\\n");

    int length = keyboard.nextInt();
    if (length <= 0) {
        System.out.println("Error: Length must be greater than 0.");
        System.exit(0);
    }
    int itemsMade = 0;


    ToDoList items = new ToDoList(length);

    String message, dueDate;

    do { 

        System.out.println("Enter to-do list item (-1 in any field to quit) #" + (itemsMade + 1) + "\nMessage:");

        message = keyboard.next();
        if (message.equals("-1"))
            break;

        System.out.println("Due Date: ");
       
        dueDate = keyboard.next();
        if (dueDate.equals("-1"))
            break;
       

        items.newItem(message, dueDate);
        itemsMade++;

        ToDoItem.print(items.getItem(itemsMade));

    } while (length > itemsMade); 

    items.print();
    int unFinishedItems = itemsMade;


    while (unFinishedItems >= itemsMade) {
        System.out.println("Which have you finished?");
        int finished = keyboard.nextInt();

        ToDoItem.finish(items.getItem(finished));
        unFinishedItems--;
    }

    
    items.print();
    


        
    }

}
