package Module_2.ArrayMath_Int;

public class MathMethods {

    public static void sum(int array[]) {
        int sumElemetn = 0;
        for (int elementArray : array) {
            sumElemetn += elementArray;
        }
        System.out.println("Сумма элементов масссива равна: " + sumElemetn);
    }

    public static void min(int array[]) {
        int minElement = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (Math.abs(minElement) > Math.abs(array[i + 1])) {
                minElement = array[i + 1];
            }
        }
        System.out.println("Минимальный элемент массива равен: " + minElement);
    }

    public static void max(int array[]) {
        int maxElement = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (Math.abs(maxElement) < Math.abs(array[i + 1])) {
                maxElement = array[i + 1];
            }
        }
        System.out.println("Максимальный элемент массива равен: " + maxElement);
    }

    public static int[] maxPositive(int array[]) {
        int maxPositive = 0;
        Module_2.ArrayMath_Int.SortArray.sortArray(array);
        for (int i = 0; i < array.length; i++) {
            maxPositive = array[i];
        }
        if (maxPositive > 0) {
            System.out.println("Максимальный положительный элемент массива: " + maxPositive);
        } else {
            System.out.println("Массив не содержит положительных чисел");
        }
        return array;
    }

    public static void multiplication(int array[]) {
        int mult = 1;
        for (int elementArray : array) {
            mult *= elementArray;
        }
        System.out.println("Произведение элементов массива равно: " + mult);
    }

    public static void modulus(int array[]) {
        if (array[array.length - 1] != 0) {
            int modul = array[0] % array[array.length - 1];
            System.out.println("Остаток от деления первого элемента массива на последний: " + Math.abs(modul));
        } else {
            System.out.println("Последний элемент массива равен: " + array[array.length - 1]);
        }
    }

    public static void secondLargest(int array[]) {
        int secondLarge = 0;
        SortArray.sortArray(array);
        secondLarge = array[array.length - 2];
        System.out.println("Второй по величине значения элемент массива: " + secondLarge);
    }
}