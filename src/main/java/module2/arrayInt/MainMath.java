package main.java.module2.arrayInt;

public class MainMath {

    public static void main(String[] args) {
        int[] array = CreateArrayInt.createArrayInt().clone();

        MathMethods.sum(array);
        MathMethods.min(array);
        MathMethods.max(array);
        MathMethods.maxPositive(array);
        MathMethods.multiplication(array);
        MathMethods.modulus(array);
        MathMethods.secondLargest(array);
    }
}
