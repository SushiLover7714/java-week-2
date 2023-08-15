import java.util.Arrays;
import java.util.Scanner;

public class MultiplyMatrice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rowA, rowB, colA, colB = 0;
        while (true) {
            System.out.print("Enter number of rows for matrix A: ");
            rowA = input.nextInt();
            System.out.print("Enter number of columns for matrix A: ");
            colA = input.nextInt();
            System.out.print("Enter number of rows for matrix B: ");
            rowB = input.nextInt();
            System.out.print("Enter number of columns for matrix B: ");
            colB = input.nextInt();
            if (colA == rowB) {
                break;
            } else {
                System.out.println("The matirces cannot be multiplied");
            }
        }
        System.out.println(rowA + " " + colA + " " + rowB + " " + colB);
        int[][] matrixA = new int[rowA][colA];
        int[][] matrixB = new int[rowB][colB];
        for (int i = 0; i < matrixA.length; i++) {
            System.out.println("For MatrixA");
            for (int j = 0; j < matrixA[i].length; j++) {
                System.out.print("Enter number: ");
                matrixA[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < matrixB.length; i++) {
            System.out.println("For MatrixB");
            for (int j = 0; j < matrixB[i].length; j++) {
                System.out.print("Enter number: ");
                matrixB[i][j] = input.nextInt();
            }
        }
        int[][] matrixC = multiply(matrixA, matrixB);
        System.out.println(Arrays.deepToString(matrixC));
    }

    public static int[][] multiply(int[][] matrixA, int[][] matrixB) {
        int rowA = matrixA.length;
        int colA = matrixA[0].length;
        int rowB = matrixB.length;
        int colB = matrixB[0].length;
        int[][] matrixC = new int[rowA][colB];

        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                for (int k = 0; k < colA; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];

                }

            }
        }
        return matrixC;
    }
}
