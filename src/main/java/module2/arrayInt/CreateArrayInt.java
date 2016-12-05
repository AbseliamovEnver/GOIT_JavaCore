package main.java.module2.arrayInt;

import java.util.Scanner;

public class CreateArrayInt {
    public static int[] createArrayInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int arraySize = scanner.nextInt();
        int[] arrayInt = new int[arraySize];
        System.out.print("Начальный массив: ");
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = (int) ((Math.random() - 0.5) * 100);
            System.out.print("   " + arrayInt[i]);
        }
        System.out.println();
        return arrayInt;
    }
}