package Sorting_Aarray;

public class BubbleSort {

    public static void array() {
        int array1[] = { 5, 3, 2, 9, 1 };

        for (int i = 0; i < array1.length - 1; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i] > array1[j]) {
                    int temp = array1[i];
                    array1[i] = array1[j];
                    array1[j] = temp;

                }
            }
        }

        for (int i : array1) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        array();
    }
}
