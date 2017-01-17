package gojava.gojava5.module10.task5;

public class Main {
    public static void main(String[] args) {
        try {
            testMyExceptions(1);
            testMyExceptions(2);
            testMyExceptions(10);

        } catch (MyFirstException | MyThirdException | MySecondException e) {
            System.out.println("Exception: " + e);
        }
    }

    private static void testMyExceptions(int number) throws MyFirstException, MySecondException, MyThirdException {
        switch (number) {
            case 1:
                throw new MyFirstException("My First Exception");
            case 2:
                throw new MySecondException("My Second Exception");
            default:
                throw new MyThirdException("My Third Exception");
        }
    }
}