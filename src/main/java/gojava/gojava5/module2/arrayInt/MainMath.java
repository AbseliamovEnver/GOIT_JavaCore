package gojava.gojava5.module2.arrayInt;

import gojava.gojava5.module6.ArraysUtils;

public class MainMath {

    public static void main(String[] args) {
        int[] array = CreateArrayInt.createArrayInt().clone();

        ArraysUtils.sum(array);
        ArraysUtils.max(array);
        ArraysUtils.min(array);
        ArraysUtils.maxPositive(array);
        ArraysUtils.multiplication(array);
        ArraysUtils.modulus(array);
        ArraysUtils.secondLargest(array);

        ArraysUtils.reverse(array);
        ArraysUtils.findEvenElements(array);
    }
}