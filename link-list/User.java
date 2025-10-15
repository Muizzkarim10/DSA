import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        while (true) {
            System.out.print("Enter value to insert: ");
            int val = sc.nextInt();
            list.insert(val);
            System.out.print("Do you want to add more? (y/n): ");
            String choice = sc.next();
            if (!choice.equalsIgnoreCase("y")) break;
        }
        sc.close();
        System.out.print("Final List: ");
        list.display();
        
    }
}
