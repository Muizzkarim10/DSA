import java.util.*;

class Node {
    int data;
    Node head, next;
    int length = 0;

    Node() {
        this.head = null;
    }

    Node(int data) {
        this.data = data;
    }

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

    void getLength(){
        Node temp = head;

        while(temp != null){
            length++;
            temp = temp.next;
        }
    }

    void traversePoint() {
        int count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to start from (1-" + length +") :");
        int choice = sc.nextInt();
        while (choice > length) {
            System.out.println("Choice exceed Node length (1-" + length +") :");
            choice = sc.nextInt();
        }
        sc.close();

        Node temp = head;

        while (temp.next != null) {
            if (count == choice)
                break;
            count++;
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }

    }
}

public class startPoint {
    public static void main(String[] args) {
        Node list = new Node();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);
        list.insert(9);
        list.getLength();

        list.traversePoint();
    }
}
