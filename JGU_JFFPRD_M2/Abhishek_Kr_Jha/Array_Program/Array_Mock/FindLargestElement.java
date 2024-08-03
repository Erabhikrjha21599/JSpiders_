import java.util.Scanner;

public class FindLargestElement {
    public static int array() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int asize = sc.nextInt();

        int array[] = new int[asize];

        for (int i = 0; i < array.length; i++) {
            System.out.print("enter element at index " + i + ": ");
            array[i] = sc.nextInt();

        }

        System.out.print("array element is: ");
        for (int i : array) {
            System.out.print(i + ",");
        }

        System.out.println();
        System.out.println("largest element: ");
        // int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i : array) {
            System.out.print(i + ",");
        }

        // System.out.println(array[0]);
        sc.close();
        return array[array.length - 1];
    }

    public static void main(String[] args) {
        array();
        System.out.println( "print largent element: " + array());
    }
}
