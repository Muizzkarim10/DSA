class Node {
    int data;
    Node head, next;

    Node() {
        this.next = null;
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

    void printOdds() {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data % 2 != 0) {
                System.out.println(temp.data + "");
            }
            temp = temp.next;
        }
    }
}

public class traverseOdd {
    public static void main(String[] args) {
        Node list = new Node();
        list.insert(23);
        list.insert(21);
        list.insert(25);
        list.insert(30);
        list.insert(31);
        list.insert(45);
        list.insert(11);

        list.printOdds();

    }
}
