
import java.util.*;

public class Main {

    static int numberSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = rand.nextInt(900) + 100;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Highest in Row");
        for (int i = 0; i < 5; i++) {
            int largest = 0;
            int sec_largest = 0;
            for (int j = 0; j < 5; j++) {
                int num = arr[i][j];
                if (num > largest) {
                    sec_largest = largest;
                    largest = num;
                } else if (num > sec_largest && num != largest) {
                    sec_largest = num;
                }
            }
            int sum = numberSum(sec_largest);
            System.out.println("Second Largest number [" + i + "]: " + sec_largest);
            System.out.println("Sum of digits: " + sum);
        }

        System.out.println();
        System.out.println("Highest in column");
        for (int j = 0; j < 5; j++) {
            int largest = 0;
            int sec_largest = 0;
            for (int i = 0; i < 5; i++) {
                int num = arr[i][j];
                if (num > largest) {
                    sec_largest = largest;
                    largest = num;
                } else if (num > sec_largest && num != largest) {
                    sec_largest = num;
                }
            }
            int sum = numberSum(sec_largest);
            System.out.println("Second Largest number [" + j + "]: " + sec_largest);
            System.out.println("Sum of digits: " + sum);
        }
    }
}
