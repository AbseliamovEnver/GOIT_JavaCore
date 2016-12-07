package gojava.gojava5.module6;

import java.util.Arrays;

public final class ArraysUtils {
    public static void sum(int[] array) {
        int sumElemetn = 0;
        for (int elementArray : array) {
            sumElemetn += elementArray;
        }
    }

    public static void min(int[] array) {
        int minElement = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (minElement > array[i + 1]) {
                minElement = array[i + 1];
            }
        }
    }

    public static void max(int[] array) {
        int maxElement = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (maxElement < array[i + 1]) {
                maxElement = array[i + 1];
            }
        }
    }

    public static int maxPositive(int[] array) {
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        Arrays.sort(arrayCopy);
        int maxPositive = arrayCopy[arrayCopy.length - 1];
        return maxPositive;
    }

    public static void multiplication(int[] array) {
        int mult = 1;
        for (int elementArray : array) {
            mult *= elementArray;
        }
    }

    public static void modulus(int[] array) {
        if (array[array.length - 1] != 0) {
            int modul = array[0] % array[array.length - 1];
        }
    }

    public static void secondLargest(int[] array) {
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        Arrays.sort(arrayCopy);
        int secondLarge = arrayCopy[arrayCopy.length - 2];
    }

    public static int[] reverse(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static int[] findEvenElements(int[] array) {
        int[] arrayEvenElements = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayEvenElements[index] = array[i];
                index++;
            }
        }
        return arrayEvenElements;
    }
}