import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };
        displayBoard(board);

    }

    public static void displayBoard(char[][] board) {
        System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("----------");
        System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("----------");
        System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
        System.out.println(" ");
    }

    public static boolean isvalidMove(char[][] board, int move) {
        int row = (move - 1) / 3;
        int col = (move - 1) % 3;
        if (move < 1 || move > 9) {
            return false;
        } else if (board[row][col] == 'X' || board[row][col] == 'O') {
            return false;
        } else {
            return true;
        }

    }

}
