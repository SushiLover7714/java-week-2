import java.util.Arrays;
import java.util.Scanner;

public class SumOfMatrices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrixA = new int[3][3];
        int[][] matrixB = new int[3][3];
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
        for (int i = 0; i < matrixA.length; i++) {
            System.out.println(Arrays.toString(matrixA[i]));
        }
        for (int i = 0; i < matrixB.length; i++) {
            System.out.println(Arrays.toString(matrixB[i]));
        }
        int[][] matrixC = new int[3][3];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }

        }
        System.out.println(Arrays.deepToString(matrixC));

    }

}
