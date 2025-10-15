package Arrays;

import java.util.Scanner;

public class insertNum {
    int[] insert(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to add: ");
        int num = sc.nextInt();

        int index;
        do {
            System.out.print("Enter the location 0-" + arr.length + " : ");
            index = sc.nextInt();
        } while (index < 0 || index > arr.length);

        sc.close();

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        newArr[index] = num;
        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        System.out.print("Number added to the Array\n");

        return newArr;
    }

    int[] delete(int[] arr) {
        int[] newArr = new int[arr.length - 1];
        Scanner sc = new Scanner(System.in);
        int index;
        do {
            System.out.print("Enter the index number to delete: ");
            index = sc.nextInt();
        } while (index < 0 || index >= arr.length);
        sc.close();

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        for (int i = index; i < newArr.length; i++) {
            newArr[i] = arr[i + 1];
        }
        System.out.print("Deleted...\n");

        return newArr;
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };

        insertNum obj = new insertNum();
        numbers = obj.delete(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
