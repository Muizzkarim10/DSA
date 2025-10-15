package Arrays;

class arrayOperations {
    boolean search(int[] arr, int number) {

        for (int num : arr) {
            if (num == number) {
                return true;
            }
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int number = 5;

        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                index = i;
                System.out.println("Element found at index: " + index);
                break;
            }
        }
        if (index == -1) {
            System.out.println("Element not found in the array");
        }
    }
}
