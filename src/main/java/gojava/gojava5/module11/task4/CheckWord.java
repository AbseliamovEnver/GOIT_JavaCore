package gojava.gojava5.module11.task4;

import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

import static gojava.gojava5.module11.task2.FileContentReplacer.outputData;

public class CheckWord {
    static final String fileName = "src/main/java/gojava/gojava5/module11/task4/textFile.txt";
    static File file = new File(fileName);

    public static void main(String[] args) throws IOException {
        outputData("Read from file: ", fileName);

        String word = "line";
        checkWord(word);

        System.out.println("\nWord is \"" + word + "\" found " + checkWord(word));
    }

    static int checkWord(String word) {
        int count = 0;
        for (String countWords : readingFile().split("\\s+")) {
            if (countWords.equals(word)){
                count++;
            }
        }
        return count;
    }

    public static String readingFile() {
        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String lineReader = reader.readLine();
            while (lineReader != null) {
                result.append(lineReader);
                result.append(System.lineSeparator());
                lineReader = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to file");
            e.printStackTrace();
        }
        return result.toString();
    }
}