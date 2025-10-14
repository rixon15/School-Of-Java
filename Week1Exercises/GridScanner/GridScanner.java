package GridScanner;

public class GridScanner {
    static void main() {

        boolean foundDigit = false;

        char[][] grid = {

                {'.', '.', '#', '.'},

                {'a', '#', 'b', 'd'},

                {'.', '.', '2', '.'}

        };

        OUTER: for (int row = 0; row < grid.length; row++) {
            INNER: for (int col = 0; col < grid[row].length; col++) {
                if(grid[row][col] == '#') {
                    continue INNER;
                }
                if(Character.isDigit(grid[row][col])) {
                    System.out.println("found digit " + grid[row][col] +" at {row = " + ++row + ", col = " + ++col + "}");
                    foundDigit = true;
                    break OUTER;
                }
            }
        }

        if(!foundDigit) {
            System.out.println("No digit found");
        }

    }
}
