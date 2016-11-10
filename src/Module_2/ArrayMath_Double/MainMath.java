package Module_2.ArrayMath_Double;

public class MainMath {

    public static void main(String[] args) {

        CreateArrayDouble.scanNumberOfElements();
        double array[] = CreateArrayDouble.createArrayDouble().clone();
        double arrayClone[] = array.clone();

        MathMethods.sum(array);
        MathMethods.min(array);
        MathMethods.max(array);
        MathMethods.maxPositive(array);
        MathMethods.multiplication(array);
        MathMethods.modulus(arrayClone);
        MathMethods.secondLargest(array);
    }
}