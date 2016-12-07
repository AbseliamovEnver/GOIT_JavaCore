package gojava.gojava5.module2.arrayDouble;

public class MainMath {

    public static void main(String[] args) {

        double[] array = CreateArrayDouble.createArrayDouble().clone();

        MathMethods.sum(array);
        MathMethods.min(array);
        MathMethods.max(array);
        MathMethods.maxPositive(array);
        MathMethods.multiplication(array);
        MathMethods.modulus(array);
        MathMethods.secondLargest(array);
    }
}