package gojava.gojava5.module11.task4;

import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

import static gojava.gojava5.module11.task1.Replacer.readStringFromFile;

public class CheckWord {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/gojava/gojava5/module11/task4/textFile.txt");
        System.out.println("Read from file:\n" + readStringFromFile(file));
        String word = "line";
        System.out.println("Word is \"" + word + "\" found " + checkWord(file, word));
    }

    static int checkWord(File file, String word) throws IOException {
        String source = tryWithResource(file);
        int i = 0;
        int counter = 0;
        while ((i = source.indexOf(word, i)) != -1) {
            counter++;
            if ((i + word.length()) < source.length()) {
                i += word.length();
            } else {
                break;
            }
        }
        return counter;
    }

    public static String tryWithResource(File file) throws IOException {
        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String lineReader = reader.readLine();
            while (lineReader != null) {
                result.append(lineReader);
                result.append(System.lineSeparator());
                lineReader = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}
