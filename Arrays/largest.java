package Arrays;

import java.util.*;

class arr {
    void largest(int[][] arr, int rows, int cols) {
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int val = arr[i][j];
                if (val > largest) {
                    secondLargest = largest;
                    largest = val;
                } else if (val > secondLargest && val != largest) {
                    secondLargest = val;
                }
            }
        }
        System.out.print("\nLargest: " + largest);
        System.out.print("\n2nd Largest: " + secondLargest);
    }

}

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of cols: ");
        int cols = sc.nextInt();
        sc.close();

        int[][] numbers = new int[rows][cols];

        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                numbers[i][j] = rand.nextInt(0, 99);
                System.out.print(numbers[i][j] + " ");
            }
        }

        arr obj = new arr();
        obj.largest(numbers, rows, cols);
    }

}
