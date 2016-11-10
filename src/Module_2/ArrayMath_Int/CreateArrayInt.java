package Module_2.ArrayMath_Int;

import java.util.Scanner;

public class CreateArrayInt {
    static int arraySize = 0;

    public static void scanNumberOfElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        arraySize = scanner.nextInt();
    }

    public static int[] createArrayInt() {
        int[] arrayInt = new int[arraySize];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = (int) ((Math.random() - 0.5) * 100);
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println();
        return arrayInt;
    }
}