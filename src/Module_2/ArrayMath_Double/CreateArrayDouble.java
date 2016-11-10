package Module_2.ArrayMath_Double;

import java.util.Scanner;

public class CreateArrayDouble {
    static int arraySize = 0;

    public static void scanNumberOfElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        arraySize = scanner.nextInt();
    }

    public static double[] createArrayDouble() {
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