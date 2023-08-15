import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };
        char currentPlayer = 'X';
        boolean gameOver = false;
        int moves = 0;
        Scanner input = new Scanner(System.in);

        while (gameOver == false && moves < 9) {
            displayBoard(board);
            int move;
            do {
                System.out.print("Player " + currentPlayer + " Enter your move 1-9: ");
                move = input.nextInt();
            } while (isvalidMove(board, move) == false);
            makeMove(board, move, currentPlayer);
            gameOver = checkWinner(board, currentPlayer);
            if (currentPlayer == 'X') {
                currentPlayer = 'O';
            } else {
                currentPlayer = 'X';
            }
            moves++;
        }
        displayBoard(board);
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
        if (gameOver == true) {
            System.out.print("player " + currentPlayer + " wins");
        } else {
            System.out.print("The game is tied");
        }

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
        }
        return true;

    }

    public static boolean checkWinner(char[][] board, char currentPlayer) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            } else if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        return false;
    }

    public static void makeMove(char board[][], int move, char currentPlayer) {
        int row = (move - 1) / 3;
        int col = (move - 1) % 3;
        board[row][col] = currentPlayer;
    }

}
