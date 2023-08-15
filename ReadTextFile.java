import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\msi\\Desktop\\Core Java\\Week 2\\matrixtable.txt"; // Replace with your file name

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            /*
             * line = bufferedReader.readLine();
             * System.out.println(line);
             * line = bufferedReader.readLine();
             * System.out.println(line);
             * line = bufferedReader.readLine();
             * System.out.println(line);
             */
            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}