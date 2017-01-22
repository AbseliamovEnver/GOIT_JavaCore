package gojava.gojava5.module11.task2;

import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

import static gojava.gojava5.module11.task1.Replacer.readStringFromFile;

public class FileContentReplacer {
    public static void main(String[] args) {
        File file = new File("src/main/java/gojava/gojava5/module11/task2/textFile.txt");
        System.out.println("Read from file:\n" + readStringFromFile(file));

        Map<String, String> map = new HashMap<>();
        map.put("first", "FileContentReplacer in");
        map.put("second", "change string in");
        map.put("line", "<task 2>");

        replaceInFile(file, map);

        System.out.println("Result string after replacement:\n" + readStringFromFile(file));
    }

    static void replaceInFile(File file, Map<String, String> map) {

        BufferedReader reader = null;
        BufferedWriter writer = null;
        StringBuilder initString = null;
        String result = null;
        boolean readSuccessful = false;

        try {
            reader = new BufferedReader(new FileReader(file));
            String lineReader = reader.readLine();
            initString = new StringBuilder();
            while (lineReader != null) {
                initString.append(lineReader);
                initString.append(System.lineSeparator());
                lineReader = reader.readLine();
            }
            readSuccessful = true;
        } catch (IOException e) {
            System.out.println("Error while reading from file: " + file);
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error while closing input stream!");
                    e.printStackTrace();
                }
            }
        }

        if (readSuccessful) {
            result = initString.toString();
            for (String key : map.keySet()) {
                result = result.toLowerCase().replaceAll(key.toLowerCase(), map.get(key).toLowerCase());
            }
            try {
                writer = new BufferedWriter(new FileWriter(file));
                writer.write(result);
            } catch (IOException e) {
                System.out.println("Error while writing to file: " + file);
                e.printStackTrace();
            } finally {
                if (writer != null) {
                    try {
                        writer.flush();
                        writer.close();
                    } catch (IOException e) {
                        System.out.println("Error while closing output stream!");
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
