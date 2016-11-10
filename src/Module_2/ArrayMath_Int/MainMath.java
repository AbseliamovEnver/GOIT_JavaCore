package Module_2.ArrayMath_Int;

public class MainMath {

    public static void main(String[] args) {

        CreateArrayInt.scanNumberOfElements();
        int array[] = CreateArrayInt.createArrayInt().clone();
        int arrayClone[] = array.clone();

        MathMethods.sum(array);
        MathMethods.min(array);
        MathMethods.max(array);
        MathMethods.maxPositive(array);
        MathMethods.multiplication(array);
        MathMethods.modulus(arrayClone);
        MathMethods.secondLargest(array);
    }
}
