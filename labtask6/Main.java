class Stack {

  int size;
  int[] stackArray;
  int top;

  Stack(int size) {
    this.size = size;
    top = -1;
    this.stackArray = new int[size];
  }

  boolean isEmpty() {
    return (top == -1);
  }

  boolean isFull() {
    return (top == size - 1);
  }

  void push(int num) {
    if (isFull()) {
      System.out.print("Stack Overflow\n");
    } else {
      stackArray[++top] = num;
      System.out.println(num + " pushed to the stack");
    }
  }

  void pop() {
    if (isEmpty()) {
      System.out.print("Stack underflow");
    } else {
      int num = stackArray[top--];
      System.out.println(num + " poped from the Stack.");
    }
  }
}

public class Main {

  public static void main(String[] args) {
    Stack s = new Stack(9);

    // s.push(6);
    s.pop();
  }
}
