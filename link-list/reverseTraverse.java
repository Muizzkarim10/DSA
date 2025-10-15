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
        while (temp.next != null) temp = temp.next;
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

    void reverseTraverse(Node node) {
        if (node == null) return;
        reverseTraverse(node.next);
        System.out.print(node.data + " ");
    }
}

public class reverseTraverse {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        for (int i = 1; i <= 9; i++) list.insert(i);

        System.out.print("Forward: ");
        list.display();

        System.out.print("Reverse: ");
        list.reverseTraverse(list.head);
    }
}
