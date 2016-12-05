package main.java.module6;

import java.util.Arrays;

public final class ArraysUtils {
    public static void sum(int[] array) {
        int sumElemetn = 0;
        for (int elementArray : array) {
            sumElemetn += elementArray;
        }
        System.out.println("Сумма элементов масссива равна: " + sumElemetn);
    }

    public static void min(int[] array) {
        int minElement = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (minElement > array[i + 1]) {
                minElement = array[i + 1];
            }
        }
        System.out.println("Минимальный элемент массива равен: " + minElement);
    }

    public static void max(int[] array) {
        int maxElement = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (maxElement < array[i + 1]) {
                maxElement = array[i + 1];
            }
        }
        System.out.println("Максимальный элемент массива равен: " + maxElement);
    }

    public static int[] maxPositive(int[] array) {
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        Arrays.sort(arrayCopy);
        int maxPositive = arrayCopy[arrayCopy.length - 1];
        if (maxPositive > 0) {
            System.out.println("Максимальный положительный элемент массива: " + maxPositive);
        } else {
            System.out.println("Массив не содержит положительных чисел");
        }
        return array;
    }

    public static void multiplication(int[] array) {
        int mult = 1;
        for (int elementArray : array) {
            mult *= elementArray;
        }
        System.out.println("Произведение элементов массива равно: " + mult);
    }

    public static void modulus(int[] array) {
        if (array[array.length - 1] != 0) {
            int modul = array[0] % array[array.length - 1];
            System.out.println("Остаток от деления первого элемента массива на последний: " + Math.abs(modul));
        } else {
            System.out.println("Последний элемент массива равен: " + array[array.length - 1]);
        }
    }

    public static void secondLargest(int[] array) {
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        Arrays.sort(arrayCopy);
        int secondLarge = arrayCopy[arrayCopy.length - 2];
        System.out.println("Второй по величине значения элемент массива: " + secondLarge);
    }

    public static void reverse(int[] array) {

    }

    public static void findEvenElements(int[] array) {

    }
}