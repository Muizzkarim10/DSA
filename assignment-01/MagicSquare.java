public class MagicSquare {
    public static void main(String[] args) {
        int n = 3;  // size of the magic square (must be odd)
        int[][] square = new int[n][n];

        int number = 1;          // numbers from 1 to n*n
        int row = 0;             // start in the first row
        int col = n / 2;         // start in the middle column

        while (number <= n * n) {
            square[row][col] = number;  // place the number

            // calculate next position: move up one row and right one column
            int nextRow = row - 1;
            int nextCol = col + 1;

            // wrap around if needed
            if (nextRow < 0) nextRow = n - 1;   // if above top, move to bottom
            if (nextCol == n) nextCol = 0;      // if past right edge, move to left

            // if next cell already filled, move down one row instead
            if (square[nextRow][nextCol] != 0) {
                row = (row + 1) % n;
            } else {
                row = nextRow;
                col = nextCol;
            }

            number++;
        }

        // print the magic square
        System.out.println("Magic Square (" + n + "x" + n + "):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(square[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
