public class Queens {
    // squares per row or column
    public static final int BOARD_SIZE = 8;

    // used to indicate an empty square
    public static final char EMPTY = '_';

    // used to indicate square contains a queen
    public static final int QUEEN = 1;

    private char[][] board; // chess board

    public Queens() {
        // -------------------------------------------------
        // Constructor: Creates an empty square board.
        // -------------------------------------------------
        board = new char[BOARD_SIZE][BOARD_SIZE];
    }  // end constructor

    public void clearBoard() {
        // -------------------------------------------------
        // Clears the board.
        // Precondition: None.
        // Postcondition: Sets all squares to EMPTY.
        // -------------------------------------------------
        // To be implemented in Programming Problem 1

        for(int row = 0; row < BOARD_SIZE; row++){
            for(int col = 0; col < BOARD_SIZE; col++){
                board[row][col] = EMPTY;
            }
        }
    }  // end clearBoard

    public void displayBoard() {
        // -------------------------------------------------
        // Displays the board.
        // Precondition: None.
        // Postcondition: Board is written to standard
        // output; zero is an EMPTY square, one is a square
        // containing a queen (QUEEN).
        // -------------------------------------------------

        System.out.println("________________________");
        for(int row = 0; row < BOARD_SIZE; row++){
            for(int col = 0; col < BOARD_SIZE; col++){
                System.out.print("|" + board[row][col] + "|");
            }
            System.out.println();
        }
        // To be implemented in Programming Problem 1
    } // end displayBoard

    public boolean placeQueens(int column) {
        // -------------------------------------------------
        // Places queens in columns of the board beginning
        // at the column specified.
        // Precondition: Queens are placed correctly in
        // columns 0 through column-1.
        // Postcondition: If a solution is found, each
        // column of the board contains one queen and method
        // returns true; otherwise, returns false (no
        // solution exists for a queen anywhere in column
        // specified).
        // -------------------------------------------------
        if (column >= BOARD_SIZE) {
            return true;  // base case
        }
        else {
            boolean queenPlaced = false;
            int row = 0;  // number of square in column

            while ( !queenPlaced && (row < BOARD_SIZE) )  {
                // if square can be attacked
                if (isUnderAttack(row, column)) {
                    ++row;  // consider next square in column
                } // end if
                else { // place queen and consider next column
                    setQueen(row, column);
                    queenPlaced = placeQueens(column + 1);
                    // if no queen is possible in next column,
                    if (!queenPlaced) {
                        // backtrack: remove queen placed earlier
                        // and try next square in column
                        removeQueen(row, column);
                        ++row;
                    } // end if
                } // end if
            } // end while
            return queenPlaced;
        } // end if
    } // end placeQueens

    private void setQueen(int row, int column) {
        // --------------------------------------------------
        // Sets a queen at square indicated by row and
        // column.
        // Precondition: None.
        // Postcondition: Sets the square on the board in a
        // given row and column to QUEEN.
        // --------------------------------------------------
        board[row][column]= 'Q';
    }  // end setQueen

    private void removeQueen(int row, int column) {
        // --------------------------------------------------
        // Removes a queen at square indicated by row and
        // column.
        // Precondition: None.
        // Postcondition: Sets the square on the board in a
        // given row and column to EMPTY.
        // --------------------------------------------------
        // To be implemented in Programming Problem 1
        board[row][column]= EMPTY;
    }  // end removeQueen

    private boolean isUnderAttack(int row, int col) {
        // Determine whether the square on the board at a given row and column
        // is under attack by any queens in the columns 0 through column-1.
        // Precondition: Each column between 0 and column-1 has a queen placed
        // in a square at a specific row. None of these queens can be attacked
        // by any other queen.
        // Postcondition: If the designated square is under attack, returns true;
        // otherwise, returns false.

        // Check if the row or column is out of bounds
        if (row < 0 || row >= board.length || col < 0 || col >= board.length) {
            throw new IllegalArgumentException("Invalid row or column");
        }

        // Check if there is a queen in the same row
        for (int c = 0; c < col; c++) {
            if (board[row][c] == 'Q') {
                return true;
            }
        }

        // Check if there is a queen in the same column
        for (int r = 0; r < row; r++) {
            if (board[r][col] == 'Q') {
                return true;
            }
        }

        // Check if there is a queen in the same diagonal (upper left to lower right)
        for (int r = row - 1, c = col - 1; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q') {
                return true;
            }
        }

        // Check if there is a queen in the same diagonal (upper right to lower left)
        for (int r = row - 1, c = col + 1; r >= 0 && c < board.length; r--, c++) {
            if (board[r][c] == 'Q') {
                return true;
            }
        }

        // No queen is attacking this square
        return false;
    }


} // end Queens