package gojava.gojava5.module10.task4;

public class ClassWithTwoMethods {
    public static void methodF() throws MyExceptionMethodF {
        try {
            methodG();
        } catch (MyExceptionMethodG e) {
            throw new MyExceptionMethodF("In MyExceptionMethodG " + e);
        }
    }

    public static void methodG() throws MyExceptionMethodG {
        throw new MyExceptionMethodG("In MyExceptionMethodG");
    }
}