package main.java.module2.arrayDouble;

import java.util.Scanner;

public class CreateArrayDouble {
    public static double[] createArrayDouble() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int arraySize = scanner.nextInt();
        double[] arrayDouble = new double[arraySize];
        System.out.print("Начальный массив: ");
        for (int i = 0; i < arrayDouble.length; i++) {
            arrayDouble[i] = ((Math.random() - 0.5) * 100.0);
            System.out.format("%8.3f", arrayDouble[i]);
        }
        System.out.println();
        return arrayDouble;
    }
}