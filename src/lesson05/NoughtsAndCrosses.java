package lesson05;

/**
 * Describe the nature of 2D arrays.
 * Construct algorithms with 2D arrays.
 */
public class NoughtsAndCrosses {

    static char[][] grid;
    
    public static void main(String[] args) {
        // allocate memory for mygrid
        grid = new char[3][3];
        displayGrid();

        // filling the first row with crosses
        //the first [] displays our row the second [] displays our column
        grid[0][0] = 'X';
        grid[1][1] = 'X';
        grid[2][2] = 'X';

        displayGrid();

    }

    public static void displayGrid() {
        // TODO
        for (int row = 0; row < 3; row++) { // jump to row (vertically)
            System.out.println("-------------------");
            for (int col = 0; col < 3; col++) { // jump to col (horizontally)
                if (grid[row][col] == 0) {
                    grid[row][col] = ' ';
                }
                System.out.print("|  " + grid[row][col]);
                if (col == 2) {
                    System.out.print("  |");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("-------------------");
    }

    public static boolean horizontalCheck(int row, char symbol) {
        // TODO Check for a horizonatal win\
        return false;
    }

    public static boolean verticalCheck(int col, char symbol) {
        // TODO check for vertical win
        // set symbol to 'x' 
        // a win is winFlag = true
        // loop from columns 0-2 check each row 0-2 for if symbol = x
        // if all symbols = x in a column then winFlag = true
        // if symbol does not + to x then winFlag = Flase
        // move to next row and keep checking  } loop these steps 
        // once all rows and collums are checked move to next step
        // if winFlag = True print "you win"
        // if wiNFlag = False print "you lose"
        for (int row = 0; row < grid.length; row++) {
            if (grid[row][col] != symbol) {
                return false;
            }
        }
        return true; 
    }

    public static boolean diagonalCheck(char symbol) {
        // TODO check for if the middle of the grid has symbol
        /*char middle = grid[1][1];
        if(middle != symbol) {
            return false;
        }*/
        boolean winRight = true;
        boolean winLeft = true;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid.length; col++) {
                if (row == col) {
                    if (grid[row][col] != symbol) {
                        winLeft = false;
                    }
                } else if (row + col == grid.length -1) {
                    if (grid[row][col] != symbol) {
                        winRight = false;
                    }
                }
            }
        }
        return true;
    }

   public static boolean isWinningMove(int col, char symbol) {
        return diagonalCheck(symbol) || verticalCheck(col, symbol) || horizontalCheck(col, symbol);
    }
}