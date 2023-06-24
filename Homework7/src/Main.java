public class Main {

    public static void main(String[] args) {

        Queens queens = new Queens();

        queens.clearBoard();
        queens.placeQueens(1);
        queens.displayBoard();

    }
}
