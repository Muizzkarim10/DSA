package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== ArrayList Menu =====");
            System.out.println("1. Add element");
            System.out.println("2. Insert element at index");
            System.out.println("3. Get element by index");
            System.out.println("4. Update element at index");
            System.out.println("5. Remove element by index");
            System.out.println("6. Check if element exists");
            System.out.println("7. Find index of element");
            System.out.println("8. Display size");
            System.out.println("9. Display all elements");
            System.out.println("10. Clear list");
            System.out.println("11. Check if empty");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // add
                    System.out.print("Enter number to add: ");
                    int num = sc.nextInt();
                    list.add(num);
                    break;

                case 2: // insert
                    System.out.print("Enter index: ");
                    int idx = sc.nextInt();
                    System.out.print("Enter number: ");
                    num = sc.nextInt();
                    if (idx >= 0 && idx <= list.size()) {
                        list.add(idx, num);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 3: // get
                    System.out.print("Enter index: ");
                    idx = sc.nextInt();
                    if (idx >= 0 && idx < list.size()) {
                        System.out.println("Element: " + list.get(idx));
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 4: // set
                    System.out.print("Enter index: ");
                    idx = sc.nextInt();
                    System.out.print("Enter new number: ");
                    num = sc.nextInt();
                    if (idx >= 0 && idx < list.size()) {
                        list.set(idx, num);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 5: // remove
                    System.out.print("Enter index: ");
                    idx = sc.nextInt();
                    if (idx >= 0 && idx < list.size()) {
                        list.remove(idx);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 6: // contains
                    System.out.print("Enter number to search: ");
                    num = sc.nextInt();
                    System.out.println("Exists? " + list.contains(num));
                    break;

                case 7: // indexOf
                    System.out.print("Enter number to search: ");
                    num = sc.nextInt();
                    System.out.println("Index: " + list.indexOf(num));
                    break;

                case 8: // size
                    System.out.println("Size = " + list.size());
                    break;

                case 9: // display
                    System.out.println("ArrayList: " + list);
                    break;

                case 10: // clear
                    list.clear();
                    System.out.println("List cleared.");
                    break;

                case 11: // isEmpty
                    System.out.println("Empty? " + list.isEmpty());
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}   
