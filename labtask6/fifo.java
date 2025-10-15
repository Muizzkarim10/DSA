
import java.util.*;
import java.util.Stack;

public class fifo {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int count = 0;
        System.out.println("Enter 5 numbers:");
        while (count != 5) {
            System.out.print("Number: ");
            s.push(sc.nextInt());
            count++;
        }
        sc.close();

        System.out.print("LIFO order: ");
        while (!s.isEmpty()) {
            int n = s.pop();
            System.out.print(n + " ");

            s2.push(n);
        }

        System.out.print("\nFIFO order: " );
        while (!s2.isEmpty()) {
            int n = s2.pop();
            System.out.print(n + " ");
        }

    }
}
