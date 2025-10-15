import java.util.*;

class Stack {
    int size;
    int top;
    int[] stackArr;

    Stack(int size) {
        this.size = size;
        this.stackArr = new int[size];
        top = -1;
    }

    boolean isEmpty() {
        return (top == -1);
    }

    void push(int num) {
        if (top == size - 1) {
            System.out.println("Stack overflow");
            return;
        } else {
            stackArr[++top] = num;
        }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }

        return stackArr[top--];
    }
}

public class binary {
    public static void main(String[] args) {
        Stack s = new Stack(32);
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();

        if (input == 0) {
            System.out.println("Binary : 0");
            return;
        }

        while (input > 0) {
            s.push(input % 2); // converting decimal to binary
            input = input / 2;
        }

        System.out.print("Binary : ");
        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
    }
}
