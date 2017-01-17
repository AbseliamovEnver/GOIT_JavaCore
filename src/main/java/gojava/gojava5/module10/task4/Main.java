package gojava.gojava5.module10.task4;

public class Main {
    public static void main(String[] args) {
        try {
            ClassWithTwoMethods.methodF();
        } catch (MyExceptionMethodF e) {
            System.out.println("Exception in Main class: " + e.getMessage());
        }
    }
}
