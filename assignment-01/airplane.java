
import java.util.*;

public class airplane {

    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        Scanner sc = new Scanner(System.in);
        String check = "y"; 

        do {
            System.out.println("\tA\tB\tC\tD\tE");
            for (int i = 0; i < 5; i++) {
                System.out.print("Row" + (i + 1) + ":\t");
                for (int j = 0; j < 5; j++) {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.print("Ticket type (E - economy, F - first): ");
            String type = sc.nextLine().toUpperCase();

            System.out.print("Desired seat (e.g. A1): ");
            String seat = sc.nextLine().toUpperCase();

            int col = seat.charAt(0) - 'A';
            int row = Character.getNumericValue(seat.charAt(1)) - 1;

            if (row >= 0 && row < 5 && col >= 0 && col < 5) {
                if (arr[row][col] == 0) {
                    arr[row][col] = type.equals("F") ? 2 : 1; // 2 = first class, 1 = economy
                    System.out.println("Seat booked successfully.");
                } else {
                    System.out.println("Seat already taken.");
                }
            } else {
                System.out.println("Invalid seat.");
            }

            System.out.print("Continue booking? (y/n): ");
            check = sc.nextLine().toLowerCase();

            System.out.println("\tA\tB\tC\tD\tE");
            sc.close();
        } while (check.equals("y"));

        for (int i = 0; i < 5; i++) {
            System.out.print("Row" + (i + 1) + ":\t");
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
