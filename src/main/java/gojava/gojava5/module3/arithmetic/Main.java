package gojava.gojava5.module3.arithmetic;

public class Main {
    public static void main(String[] args) {
        int numberA = (int) (Math.random() * 10);
        int numberB = (int) (Math.random() * 10);
        Arithmetic.add(numberA, numberB);
        new Adder().chek(numberA, numberB);
    }
}