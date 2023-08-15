import java.util.Arrays;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrixA = { { 3, 6, 7, 10 }, { 4, 9, 7, 13 } };
        int[][] result = TrasnposeMatirx(matrixA);
        System.out.println(Arrays.deepToString(result));
    }

    public static int[][] TrasnposeMatirx(int[][] matrixA) {
        int[][] result = new int[matrixA[0].length][matrixA.length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                result[j][i] = matrixA[i][j];

            }
        }
        return result;
    }
}
