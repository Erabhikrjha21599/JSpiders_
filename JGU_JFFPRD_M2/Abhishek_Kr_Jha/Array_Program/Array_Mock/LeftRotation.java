import java.util.Scanner;

public class LeftRotation {
    public static void array() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int asize = sc.nextInt();

        int array[] = new int[asize];

        System.out.println("Enter array elemet: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("enter elemet at index " + i + ": ");
            array[i] = sc.nextInt();

        }

        System.out.println("print array: ");
        for (int i : array) {
            System.out.print(i + ",");

        }

        System.out.println();
        System.out.println("left rotation array: ");
        System.out.print("enter the rotation value: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            int j, first;
            first = array[0];
            for (j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];

            }
            array[j] = first;

        }

        for (int i : array) {
            System.out.print(i + ",");
        }

        sc.close();
    }

    public static void main(String[] args) {
        array();
    }
}
