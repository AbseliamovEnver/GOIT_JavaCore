package gojava.gojava5.module10.task2;

public class MainMyException {
    public static void main(String[] args) {
        try {
            throw new MyException("Testing method Main");
        } catch (MyException e) {
            System.out.println("In catch block " + e.getMessage());
        } finally {
            System.out.println("In finally block");
        }
    }
}
