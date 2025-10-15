import java.util.*;

class Stack {
    int size;
    int top;
    char[] stackArray;

    Stack(int size) {
        this.size = size;
        top = -1;
        this.stackArray = new char[size];
    }

    void push(char c) {
        if (top == size - 1) {
            System.out.print("Stack overflow");
            return;
        } else {
            stackArray[++top] = c;
        }
    }

    char pop() {
        if (top == -1) {
            System.out.print("Stack underflow");
            return 0;
        } else {
            return stackArray[top--];
        }
    }

    boolean isEmpty() {
        return (top == -1);
    }

}

public class reverse {
    public static void main(String[] args) {
        System.out.println("Enter a positive integer: ");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        
        Stack charStack = new Stack(input.length());

        for (int i = 0; i < input.length(); i++) {
            charStack.push(input.charAt(i));
        }

        String reverse = "";
        while (!charStack.isEmpty()) {
            reverse = reverse + charStack.pop();
        }

        System.out.print("Reversed: " + reverse);
    }
}
