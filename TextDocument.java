import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextDocument {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\msi\\Desktop\\Core Java\\Week 2\\TextExample.txt";
        String[] wordArr = new String[50];
        int wordCount = 0;
        String[] uniqueArr = new String[wordArr.length];
        try {
            FileReader newFile = new FileReader(fileName);
            BufferedReader bufferReader = new BufferedReader(newFile);
            String line;

            while ((line = bufferReader.readLine()) != null) {
                System.out.println(line);
                String[] temp = line.split(" ", -1);

                for (int i = 0; i < temp.length; i++) {
                    wordArr[wordCount] = temp[i].replaceAll("[^a-zA-Z]", "");
                    wordCount++;
                }
                // wordCount++;

            }
            for (int i = 0; i < wordCount; i++) {
                System.out.println(wordArr[i]);
            }
            bufferReader.close();

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        uniqueArr = extractUniqueString(wordArr);
        for (int i = 0; i < uniqueArr.length; i++) {
            int frequency = 0;
            for (int j = 0; j < wordArr.length; j++) {
                if (uniqueArr[i] != null) {
                    if (uniqueArr[i].equalsIgnoreCase(wordArr[j])) {
                        frequency++;
                    }
                }
            }
            System.out.println(uniqueArr[i] + " frequency : " + frequency);
        }
    }

    public static String[] extractUniqueString(String[] wordArr) {
        String[] uniqueWords = new String[wordArr.length];
        int index = 0;
        for (int i = 0; i < wordArr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueWords.length; j++) {
                if (uniqueWords[i] != null) {
                    if (wordArr[i].equalsIgnoreCase(uniqueWords[j])) {
                        isDuplicate = true;
                        break;
                    }
                }
            }
            if (isDuplicate == false) {
                uniqueWords[index] = wordArr[i];
                index++;
            }
        }
        return uniqueWords;
    }
}
