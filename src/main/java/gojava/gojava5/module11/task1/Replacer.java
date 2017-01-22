package gojava.gojava5.module11.task1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Replacer {
    public static void main(String[] args) {
        File file = new File("src/main/java/gojava/gojava5/module11/task1/textFile.txt");
        System.out.println("Read from file:\n" + readStringFromFile(file));

        Map<String, String> map = new HashMap<>();
        map.put("first", "null");
        map.put("second", "first");
        map.put("line", "<string>");

        System.out.println("Result string after replacement:\n" + replacer(readStringFromFile(file), map));
    }

    public static String replacer(String initialString, Map<String, String> map) {

        for (String key : map.keySet()) {
            initialString = initialString.toLowerCase().replaceAll(key.toLowerCase(), map.get(key).toLowerCase());
        }
        return initialString;
    }

    public static String readStringFromFile(File file) {
        BufferedReader reader = null;
        StringBuilder result = new StringBuilder();
        try {
            reader = new BufferedReader(new FileReader(file));
            String lineReader = reader.readLine();
            while (lineReader != null) {
                result.append(lineReader);
                result.append(System.lineSeparator());
                lineReader = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error when trying to close the stream");
                    e.printStackTrace();
                }
            }
        }
        return result.toString();
    }
}
