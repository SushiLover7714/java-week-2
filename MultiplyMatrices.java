import java.util.Arrays;
import java.util.Scanner;

public class MultiplyMatrices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrixA = new int[2][2];
        int[][] matrixB = new int[2][2];
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

        int[][] matrixC = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];

                }
            }
        }
        System.out.println(Arrays.deepToString(matrixC));
    }
}
