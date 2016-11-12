package Module_2.ArrayMath_Double;

import java.util.Arrays;

public class MathMethods {

    public static void sum(double[] array) {
        double sumElemetn = 0;
        for (double elementArray : array) {
            sumElemetn += elementArray;
        }
        System.out.format("Сумма элементов масссива равна: " + "%8.3f", sumElemetn);
        System.out.println();
    }

    public static void min(double[] array) {
        double minElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minElement > array[i + 1]) {
                minElement = array[i + 1];
            }
        }
        System.out.format("Минимальный элемент массива равен: " + "%8.3f", minElement);
        System.out.println();
    }

    public static void max(double[] array) {
        double maxElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxElement < array[i + 1]) {
                maxElement = array[i + 1];
            }
        }
        System.out.format("Максимальный элемент массива равен: " + "%8.3f", maxElement);
        System.out.println();
    }

    public static double[] maxPositive(double[] array) {
        Arrays.sort(array);
        double maxPositive = array[array.length - 1];

        if (maxPositive > 0) {
            System.out.format("Максимальный положительный элемент массива: " + "%8.3f", maxPositive);
        } else {
            System.out.println("Массив не содержит положительных чисел");
        }
        System.out.println();
        return array;
    }

    public static void multiplication(double[] array) {
        double mult = 1;
        for (double elementArray : array) {
            mult *= elementArray;
        }
        System.out.format("Произведение элементов массива равно: " + "%8.3f", mult);
        System.out.println();
    }

    public static void modulus(double[] array) {
        if (array[array.length - 1] != 0) {
            double modul = array[0] % array[array.length - 1];
            System.out.format("Остаток от деления первого элемента массива на последний: " + "%8.3f", Math.abs(modul));
            System.out.println();
        } else {
            System.out.println("Последний элемент массива равен: " + array[array.length - 1]);
        }
    }

    public static void secondLargest(double[] array) {
        Arrays.sort(array);
        double secondLarge = array[array.length - 2];
        System.out.format("Второй по величине значения элемент массива: " + "%8.3f", secondLarge);
    }
}
