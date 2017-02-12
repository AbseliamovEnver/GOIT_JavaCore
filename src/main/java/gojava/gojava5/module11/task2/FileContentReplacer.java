package gojava.gojava5.module11.task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FileContentReplacer {
    static final String fileName = "src/main/java/gojava/gojava5/module11/task2/textFile.txt";
    static File file = new File(fileName);

    public static void main(String[] args) throws IOException {

        Map<String, String> map = new HashMap<>();
        map.put("first", "FileContentReplacer in ");
        map.put("second", "change second line in ");
        map.put("line", "<task 2>");

        outputData("Read from file: ", fileName);

        fileContentsReplacer(map);

        outputData("\nResulting string after replace: ", fileName);
    }

    public static void outputData(String message, String fileName) throws IOException {
        System.out.println(message);
        Files.lines(Paths.get(fileName)).forEach(System.out::println);
    }

    public static File fileContentsReplacer(Map<String, String> wordsReplace) throws IOException {
        String correctText = replaceWords(wordsReplace);
        return rewriteFile(correctText, false);
    }

    public static String readFile() {
        StringBuilder outputString = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            outputString.append(reader.lines().collect(Collectors.joining("\n")));
        } catch (IOException e) {
            System.out.println("Error reading from file");
        }
        return outputString.toString();
    }

    public static String replaceWords(Map<String, String> replaceWords) {
        String resultString = readFile();
        for (Map.Entry<String, String> entry : replaceWords.entrySet()) {
            resultString = resultString.replaceAll(entry.getKey(), entry.getValue());
        }
        return resultString;
    }

    public static File rewriteFile(String newText, boolean append) {
        try (BufferedWriter bufferedFileWriter = new BufferedWriter(new FileWriter(file, append))) {
            bufferedFileWriter.write(newText);
            bufferedFileWriter.newLine();
            bufferedFileWriter.flush();
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }
        return file;
    }
}
