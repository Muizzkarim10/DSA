
import java.util.*;

public class factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        System.out.println("Factorial Finder");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            s.push(sc.nextInt());
        }

        System.out.println("");

        while (!s.isEmpty()) {
            int num = s.pop();

            long fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }

            System.out.println("Factorial of " + num + " = " + fact);
        }
        sc.close();
    }
}
