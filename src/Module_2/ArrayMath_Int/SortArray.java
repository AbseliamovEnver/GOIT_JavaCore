package Module_2.ArrayMath_Int;

public class SortArray {
    public static void sortArray(int array[]) {
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
        }
    }
}