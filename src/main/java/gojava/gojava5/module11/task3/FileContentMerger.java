package gojava.gojava5.module11.task3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static gojava.gojava5.module11.task2.FileContentReplacer.outputData;

public class FileContentMerger {
    static final String fileName = "src/main/java/gojava/gojava5/module11/task3/textFile.txt";
    static File file = new File(fileName);

    public static void main(String[] args) throws IOException {

        Map<String, String> map = new HashMap<>();
        map.put("first", "replaceAndMergeInFile in");
        map.put("second", "change string in");
        map.put("line", "<task 3>");

        outputData("Read from file: ", fileName);

        fileContentsReplacer(map);

        outputData("\nResulting string after replace and merge to file: ", fileName);
    }

    public static File fileContentsReplacer(Map<String, String> wordsReplace) throws IOException {
        String correctText = replaceWords(wordsReplace);
        return rewriteFile(correctText, true);
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
