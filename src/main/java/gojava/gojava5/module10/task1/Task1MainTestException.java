package gojava.gojava5.module10.task1;

public class Task1MainTestException {
    public static void main(String[] args) {
        try {
            throw new Exception("Testing Exception");
        } catch (Exception e) {
            System.out.println("In catch block MyException " + e.getMessage());
        } finally {
            System.out.println("In finally block MyException");
        }
    }
}