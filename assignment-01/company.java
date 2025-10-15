
import java.util.Random;

public class company {

    public static void main(String[] args) {
        int[][] arr = new int[5][6];

        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = rand.nextInt(900) + 100;
            }
        }

        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 1; j < 6; j++) {
                sum += arr[i][j];
            }
            arr[i][5] = sum;
        }

        System.out.println("ID\tQT1\tQT2\tQT3\tQT4\tTotal");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        int maxq = 0;
        int quarter = 0;
        System.out.print("\nTotal\t");
        for (int j = 1; j < 5; j++) {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += arr[i][j];
            }
            System.out.print(sum + "\t");
            if (sum > maxq) {
                maxq = sum;
                quarter = j;
            }
        }
        System.out.println();

        int max = 0;
        int id = 0;
        for (int i = 0; i < 5; i++) {
            if (max < arr[i][5]) {
                max = arr[i][5];
                id = arr[i][0];
            }
        }

        System.out.println("Max sales by person:\t ID = " + id + ",Amount: " + max);
        System.out.println("Max sales by Quarter:\t QT = " + quarter + ",Amount: " + maxq);
    }
}
