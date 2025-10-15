package Arrays;

import java.util.ArrayList;

class MyArrayList {
    private int[] arr;
    private int size;
    private int capacity;
    private int current; // pointer to current index

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
        current = -1;
    }

    // Insert at end
    public void insert(int x) {
        if (size == capacity) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = x;
        if (current == -1)
            current = 0;
    }

    // Insert at specific index
    public void insertAt(int index, int x) {
        if (size == capacity) {
            System.out.println("List is full!");
            return;
        }
        if (index < 0 || index > size) {
            System.out.println("Invalid index!");
            return;
        }
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = x;
        size++;
        current = index;
    }

    // Delete by index
    public void removeAt(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        if (size == 0)
            current = -1;
        else if (current >= size)
            current = size - 1;
    }

    // Delete by value
    public void remove(int x) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }
        if (index != -1)
            removeAt(index);
        else
            System.out.println("Value not found!");
    }

    // Get current element
    public int get() {
        if (current == -1)
            throw new RuntimeException("List is empty!");
        return arr[current];
    }

    // Update current element
    public void update(int x) {
        if (current != -1)
            arr[current] = x;
    }

    // Return length
    public int length() {
        return size;
    }

    // Move back
    public void back() {
        if (current > 0)
            current--;
    }

    // Move to start
    public void start() {
        if (size > 0)
            current = 0;
    }

    // Move to end
    public void end() {
        if (size > 0)
            current = size - 1;
    }

    // Display
    public void display() {
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("] | current=" + current);
        if (current != -1)
            System.out.print(" -> " + arr[current]);
        System.out.println();
    }
}

public class TestArrayList {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(10);

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display(); // [10 20 30] | current=0 -> 10

        list.insertAt(1, 15);
        list.display(); // [10 15 20 30] | current=1 -> 15

        list.removeAt(2);
        list.display(); // [10 15 30] | current=2 -> 30

        list.remove(15);
        list.display(); // [10 30] | current=1 -> 30

        list.start();
        list.display(); // current=0 -> 10

        list.end();
        list.display(); // current=1 -> 30

        list.back();
        list.display(); // current=0 -> 10

        System.out.println("Get: " + list.get());
        list.update(99);
        list.display(); // [99 30]
    }
}
