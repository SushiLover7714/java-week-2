import java.io.BufferedReader;
import java.util.Arrays;
import java.io.FileReader;
import java.io.IOException;

public class MatrixTableReader {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\msi\\Desktop\\Core Java\\Week 2\\matrixtable.txt";
        int[][] MatrixA = new int[3][3];

        try {
            FileReader newFile = new FileReader(fileName);
            BufferedReader bufferReader = new BufferedReader(newFile);
            String line;
            int j = 0;
            while ((line = bufferReader.readLine()) != null) {
                System.out.println(line);
                String[] arr = line.split(" ", -1);
                for (int i = 0; i < MatrixA.length; i++) {
                    MatrixA[j][i] = Integer.parseInt(arr[i]);
                }
                j++;
            }
            System.out.println(Arrays.deepToString(MatrixA));

            /*
             * while ((bufferReader.readLine() != null)) {
             * System.out.println(bufferReader.readLine());
             * }
             */
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
