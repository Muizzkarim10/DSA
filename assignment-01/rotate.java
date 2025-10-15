
import java.util.*;

public class rotate {

    public static void main(String[] args) {
        int[] arr = new int[6];
        System.out.print("Array: ");
        for (int i = 0; i < 6; i++) {
            arr[i] = i + 1;
            System.out.print(i + " ");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number 0-5: ");
        int k = sc.nextInt();
        sc.close();

        System.out.print("Output: ");
        for (int i = k; i < 6; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
