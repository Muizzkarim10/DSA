import java.util.*;

class Node {

    Node next, first;

    char zone;
    int timberId;
    String kind;
    float weight;
    float height;
    String status;
    int quantity;
    int price;
    String date;

    Node() {
        this.first = null;
    }

    Scanner sc = new Scanner(System.in);

    void add() {
        System.out.print("Enter the timber ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        // Check for duplicate ID
        Node temp = first;
        while (temp != null) {
            if (temp.timberId == id) {
                System.out.println("Error: Timber ID already exists. Record not added.");
                return;
            }
            temp = temp.next;
        }

        Node n = new Node();
        n.timberId = id;

        System.out.print("Enter the location Zone (A, B, C, D): ");
        n.zone = sc.next().charAt(0);
        sc.nextLine();

        System.out.print("Enter kind: ");
        n.kind = sc.nextLine();

        System.out.print("Enter wood height: ");
        n.height = sc.nextFloat();
        sc.nextLine();

        System.out.print("Enter wood weight: ");
        n.weight = sc.nextFloat();
        sc.nextLine();

        System.out.print("Enter Status (In Stock / Sold / Reserved): ");
        n.status = sc.nextLine();

        System.out.print("Enter the Amount of wood: ");
        n.quantity = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the price of wood: ");
        n.price = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the cut Date (dd / mm / yy): ");
        n.date = sc.nextLine();

        if (first == null) {
            first = n;
        } else {
            temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    void displayZone() {
        System.out.print("Enter the zone (A, B, C, D): ");
        char input = sc.next().charAt(0);

        Node temp = first;
        System.out.print("--- Search by Zone ---\n");
        while (temp != null) {
            if (temp.zone == input) {
                System.out.println("Timber ID: \t" + temp.timberId);
                System.out.println("Location Zone: \t" + temp.zone);
                System.out.println("Kind: \t\t" + temp.kind);
                System.out.println("Height: \t" + temp.height);
                System.out.println("Weight: \t" + temp.weight);
                System.out.println("Status: \t" + temp.status);
                System.out.println("Quantity: \t" + temp.quantity);
                System.out.println("Price: \t\t" + temp.price);
                System.out.println("Date: \t\t" + temp.date);
                System.out.println();

                System.out.println();
            } else if (temp.next == null) {
                System.out.println("No Records Found.");
                break;
            }

            temp = temp.next;
        }
    }

    void displayKind() {
        System.out.print("Enter kind: ");
        String input = sc.nextLine();

        Node temp = first;
        boolean found = false;
        while (temp != null) {
            if (temp.kind.equalsIgnoreCase(input)) {
                System.out.print("--- Search by kind ---\n");
                System.out.println("Timber ID: \t" + temp.timberId);
                System.out.println("Location Zone: \t" + temp.zone);
                System.out.println("Kind: \t\t" + temp.kind);
                System.out.println("Height: \t" + temp.height);
                System.out.println("Weight: \t" + temp.weight);
                System.out.println("Status: \t" + temp.status);
                System.out.println("Quantity: \t" + temp.quantity);
                System.out.println("Price: \t\t" + temp.price);
                System.out.println("Date: \t\t" + temp.date);
                System.out.println();
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("Not Record Found");
        }
    }

    void displayLess() {
        Node temp = first;
        boolean found = false;
        while (temp != null) {
            if (temp.quantity < 100 && temp.status.equalsIgnoreCase("in stock")) {
                System.out.print("--- Quantity on hand is lower than 100 ---\n");
                System.out.println("Timber ID: \t" + temp.timberId);
                System.out.println("Location Zone: \t" + temp.zone);
                System.out.println("Kind: \t\t" + temp.kind);
                System.out.println("Height: \t" + temp.height);
                System.out.println("Weight: \t" + temp.weight);
                System.out.println("Status: \t" + temp.status);
                System.out.println("Quantity: \t" + temp.quantity);
                System.out.println("Price: \t\t" + temp.price);
                System.out.println("Date: \t\t" + temp.date);
                System.out.println();
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("Not Record Found");
        }
    }

    void update() {
        System.out.print("Enter the Timber ID to be sold: ");
        int input = sc.nextInt();
        sc.nextLine();

        Node temp = first;
        while (temp != null) {
            if (temp.timberId == input) {
                System.out.print("Enter the quantity to be sold: ");
                int amount = sc.nextInt();

                if (temp.quantity < amount) {
                    System.out.print("Not enough wood in stock.");
                } else {
                    System.out.println("Timber Id: " + temp.timberId + " Amount: " + amount + " SOLD!");
                    temp.quantity -= amount;
                }
            }
            temp = temp.next;
        }
    }

    void delete() {
        System.out.print("Enter the Timber ID to delete: ");
        int id = sc.nextInt();

        if (first == null) {
            System.out.println("No records exist.");
            return;
        }

        // delete first node
        if (first.timberId == id) {
            first = first.next;
            System.out.println("Record deleted.");
            return;
        }

        // delete in middle or end
        Node temp = first;
        while (temp.next != null) {
            if (temp.next.timberId == id) {
                temp.next = temp.next.next;
                System.out.println("Record deleted.");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Record not found.");
    }

    void updateRecord() {
        System.out.print("Enter the Timber ID to update: ");
        int id = sc.nextInt();

        Node temp = first;
        while (temp != null) {
            if (temp.timberId == id) {
                System.out.println("Record found. Enter new details:");
                System.out.print("Enter new kind: ");
                temp.kind = sc.next();
                System.out.print("Enter new weight: ");
                temp.weight = sc.nextFloat();
                System.out.print("Enter new height: ");
                temp.height = sc.nextFloat();
                System.out.print("Enter new status: ");
                temp.status = sc.next();
                System.out.print("Enter new quantity: ");
                temp.quantity = sc.nextInt();
                System.out.print("Enter new price: ");
                temp.price = sc.nextInt();
                System.out.print("Enter new date: ");
                temp.date = sc.next();
                System.out.println("Record updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Record not found.");
    }

    void generateInventoryReport() {
        if (first == null) {
            System.out.println("No records found.");
            return;
        }

        Node temp = first;
        int count = 0;
        float totalWeight = 0;
        float totalHeight = 0;
        int totalQuantity = 0;
        int totalValue = 0;

        System.out.println("--- Inventory Report ---");

        while (temp != null) {
            System.out.println("Timber ID: " + temp.timberId);
            System.out.println("Kind: " + temp.kind);
            System.out.println("Weight: " + temp.weight);
            System.out.println("Height: " + temp.height);
            System.out.println("Status: " + temp.status);
            System.out.println("Quantity: " + temp.quantity);
            System.out.println("Price: " + temp.price);
            System.out.println("Date: " + temp.date);
            System.out.println();

            count++;
            totalWeight += temp.weight;
            totalHeight += temp.height;
            totalQuantity += temp.quantity;
            totalValue += temp.price * temp.quantity;

            temp = temp.next;
        }

        System.out.println("Summary:");
        System.out.println("Total records: " + count);
        System.out.println("Total quantity: " + totalQuantity);
        System.out.println("Total value: " + totalValue);
        System.out.println("Average weight: " + (totalWeight / count));
        System.out.println("Average height: " + (totalHeight / count));
    }

}

public class timberStore {

    public static void main(String[] args) {
        Node list = new Node();
        Scanner sc = new Scanner(System.in);

        System.out.print("-----Muhammad Umar Timber Store-----\n");

        while (true) {
            System.out.print("1.\tAdd a new Timber record.");
            System.out.print("\n2.\tSearch by Zone.");
            System.out.print("\n3.\tSearch by kind.");
            System.out.print("\n4.\tAnalysis of record level.");
            System.out.print("\n5.\tSales update.");
            System.out.print("\n6.\tDelete Record.");
            System.out.print("\n7.\tUpdate Record.");
            System.out.print("\n8.\tGenerate Inventory report.");
            System.out.print("\n9.\tBackup & Restore.");
            System.out.print("\n10.\tExit.");

            System.out.println();
            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    list.add();
                    break;

                case 2:
                    list.displayZone();
                    break;

                case 3:
                    list.displayKind();
                    break;

                case 4:
                    list.displayLess();
                    break;

                case 5:
                    list.update();
                    break;

                case 6:
                    list.delete();
                    break;

                case 7:
                    list.updateRecord();
                    break;

                case 8:
                    list.generateInventoryReport();
                    break;

                case 10:
                    return;
            }
            System.out.println();
        }

    }
}
