package challenge;

import java.util.*;
import java.util.Scanner;

public class GroceryList
{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=== Shopping Cart Menu ===");
            System.out.println("0. Quit shopping and dislpay items");
            System.out.println("1. Add item or items (delimited with comma)");
            System.out.println("2. Remove item or items (delimited with comma)");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0: 
                    for(Item i : cart){
                        System.out.println(i);
                    }
                    break;
                case 1:
                    Item item;
                    System.out.print ("Enter names of items you want to add delimited by a comma: ");
                    String[] itemsNames = scanner.nextLine().split(",");
                    ArrayList<String> items = new ArrayList<>(Arrays.asList(itemsNames));

                    for(String name:items){
                        int found = 0;
                        for(Item i : cart){
                            if(i.getName().equalsIgnoreCase(name)){
                                found = 1;
                                break;
                            }
                        }
                        if(found == 0){
                            item = new Item (name.trim().toLowerCase());
                            cart.add(item);
                        }
                    }

                    cart.sort(Comparator.comparing(Item::getName));
                    
                    break;
                case 2:
                    System.out.print ("Enter names of items you want to delete delimited by a comma: ");
                    String[] itemsNames_delete = scanner.nextLine().split(",");
                    ArrayList<String> items_delete = new ArrayList<>(Arrays.asList(itemsNames_delete));

                    for(String name:items_delete){
                        for(Item i : cart){
                            if(i.getName().equalsIgnoreCase(name)){
                                cart.remove(i);
                                break;
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
        while(choice!=0);
        scanner.close();
        
    }
}
