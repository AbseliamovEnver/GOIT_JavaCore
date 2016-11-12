package Module_2.ArrayMath_Double;

public class MainMath {

    public static void main(String[] args) {

        double array[] = CreateArrayDouble.createArrayDouble().clone();
        double arrayClone[] = array.clone();

        MathMethods.sum(array);
        MathMethods.min(array);
        MathMethods.max(array);
        MathMethods.maxPositive(arrayClone);
        MathMethods.multiplication(array);
        MathMethods.modulus(array);
        MathMethods.secondLargest(arrayClone);
    }
}