/* Program: A simple program to keep track of all the things
 *          you need to take with you when you leave the house
 * Author: Gabriele Peck
 */

import java.util.*;

public class Items {
    public static void main(String[] args) {

        String greeting = "\nHello! This is your be-all end-all"
                + " solution to forgetting things in the house before you leave. Just "
                + "use the interface provided to make sure you know before you go.";

        System.out.println(greeting);

        String instruction = "\nStart out by adding things to the list that you'll want "
                + "to remember. Make sure you include what it is and where to find it. Make the name "
                + "of the item and the name of the location one word each.\n";

        System.out.println(instruction);

        HashMap<String, String> items = new HashMap<String, String>();

        Scanner input = new Scanner(System.in);
        int choice = 0;

        while (choice != 6) {
            System.out.println("\n1) Add a new item");
            System.out.println("2) Delete an item");
            System.out.println("3) View items");
            System.out.println("4) Find the location of an item");
            System.out.println("5) Get the size of your list");
            System.out.println("6) Quit");

            try {
                choice = input.nextInt();

            } catch (Exception e) {
                System.out.println("That was not a number between 1 and 6. Please try again.");
                break;
            }

            switch (choice) {
                case 1:
                    addItem(items);
                    break;
                case 2:
                    deleteItem(items);
                    break;
                case 3:
                    viewItems(items);
                    break;
                case 4:
                    getLocation(items);
                    break;
                case 5:
                    getSize(items);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("That was not a number between 1 and 6. Please try again.");
                    break;
            }

            input.reset();
        }
        
        input.close();
    }
    
    static HashMap<String, String> addItem(HashMap<String, String> items) {

        String key;
        String value;
        
        
        System.out.println("\nWhat is the name of the item? ");
        Scanner input1 = new Scanner(System.in);
        key = input1.nextLine();
        
        if (items.size() > 0) {
            System.out.println("Entered if statement.");
            for (String i : items.keySet()) { 
                System.out.println("Entered for loop. Key - " + key + " i - " + i);
                if (key.toLowerCase() == i.toLowerCase()) {
                    System.out.println("Entered comparison.");
                    System.out.println("Sorry, that item already exists");
                    return items;
                }
            }
        }

        System.out.println("What is the location of '" + key + "'?");
        Scanner input2 = new Scanner(System.in);
        value = input2.nextLine();

        items.put(key, value);

        return items;
    }

    static void viewItems(HashMap<String, String> items) {

        System.out.println("\n");
        for (String i : items.keySet()) {
            System.out.println("item: " + i + " - location: " + items.get(i) + "\n");
        }
    }
    
    static HashMap<String, String> deleteItem(HashMap<String, String> items) {

        System.out.println("\nWhich item would you like to remove?");

        Scanner input = new Scanner(System.in);

        String removal = input.nextLine();

        items.remove(removal);

        System.out.println("'" + removal + "' has been removed from the list.");

        return items;
    }

    static void getLocation(HashMap<String, String> items) {

        System.out.println("\nWhich item would you like to find?");

        Scanner input = new Scanner(System.in);

        String object = input.nextLine();

        String location = items.get(object);

        System.out.println("To find '" + object + "', you should look here: " + location);
    }

    static void getSize(HashMap<String, String> items) {
        int size = items.size();

        System.out.println("\nYour list contains " + size + " items.");
    }
}
