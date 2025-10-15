import java.util.*;

class stack {
    int size;
    int top;
    char[] stackArray;

    stack(int size) {
        this.size = size;
        this.stackArray = new char[size];
        top = -1;
    }

    void push(char c) {
        if (top == size - 1) {
            System.out.println("Stack overflow");
            return;
        } else {
            stackArray[++top] = c;
        }
    }

    char pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return 0;
        }

        return stackArray[top--];
    }

    Boolean isEmpty() {
        return (top == -1);
    }
}

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String input = sc.nextLine();
        sc.close();

        stack s = new stack(input.length());
        for (int i = 0; i < input.length(); i++) {
            s.push(input.charAt(i));
        }
        String word = "";
        while (!s.isEmpty()) {
            word = word + s.pop();
        }

        if (word.equals(input)) {
            System.out.println("The word is a Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
