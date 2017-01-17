package gojava.gojava5.module10.task3;

public class MainNullPointerException {
    public static void main(String[] args) {
        Test test = null;

        try {
            test.testMethod();
        } catch (NullPointerException e) {
            System.out.println("Test Exception: " + e);
        }
    }
}