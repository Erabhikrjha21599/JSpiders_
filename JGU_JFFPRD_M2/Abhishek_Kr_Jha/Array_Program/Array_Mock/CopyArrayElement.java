import java.util.Scanner;

public class CopyArrayElement {

    public static void array() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of Array: ");
        int asize = sc.nextInt();

        int array[] = new int[asize];
        int array1[] = new int[array.length];

        for(int i = 0; i < array.length; i++){
            System.out.print("Enter The Element At Index " + i + ": ");
            array[i] = sc.nextInt();

        }

        System.out.println("Print array Element: ");
        for (int i : array) {
            System.out.print(i + ",");

        }

        System.out.println();
        System.out.println("Copy array Element Inside array1: ");
        for(int i = 0; i < array.length; i++){
            array1[i] = array[i];
        }

        System.out.println("Print array1 Element: ");
        for (int i : array1) {
            System.out.print(i + ",");
            
        }

        sc.close();
    }

    public static void main(String[] args) {
        array();
    }
}
