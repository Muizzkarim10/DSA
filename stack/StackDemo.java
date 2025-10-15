import java.util.*;

class StaticStack {
    int top, size;
    int[] arr;

    StaticStack(int s) {
        size = s;
        arr = new int[size];
        top = -1;
    }

    void push(int x) {
        if (top == size - 1)
            System.out.println("Static Stack Overflow");
        else
            arr[++top] = x;
    }

    void pop() {
        if (top == -1)
            System.out.println("Static Stack Underflow");
        else
            System.out.println("Popped: " + arr[top--]);
    }

    void display() {
        if (top == -1)
            System.out.println("Static Stack Empty");
        else {
            System.out.print("Static Stack: ");
            for (int i = top; i >= 0; i--)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}

class Node {
    int data;
    Node next;
}

class DynamicStack {
    Node top = null;

    void push(int x) {
        Node n = new Node();
        n.data = x;
        n.next = top;
        top = n;
    }

    void pop() {
        if (top == null)
            System.out.println("Dynamic Stack Underflow");
        else {
            System.out.println("Popped: " + top.data);
            top = top.next;
        }
    }

    void display() {
        if (top == null)
            System.out.println("Dynamic Stack Empty");
        else {
            System.out.print("Dynamic Stack: ");
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Static Stack
        System.out.print("Enter size of static stack: ");
        int size = sc.nextInt();
        StaticStack s1 = new StaticStack(size);

        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.display();
        s1.pop();
        s1.display();

        // Dynamic Stack
        DynamicStack s2 = new DynamicStack();
        s2.push(11);
        s2.push(22);
        s2.push(33);
        s2.display();
        s2.pop();
        s2.display();
    }
}
