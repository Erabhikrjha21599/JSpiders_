import java.util.Scanner;

public class SumOfArray {

    public static void array() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of Array: ");
        int asize = sc.nextInt();

        int array[] = new int[asize];

        for(int i = 0; i < array.length; i++){
            System.out.print("Enter The Element At Index " + i + ": ");
            array[i] = sc.nextInt();

        }

        System.out.println("Print array Element: ");
        for (int i : array) {
            System.out.print(i + ",");

        }

        System.out.println();
        System.out.println("Print Sum Of array Element: ");
        int sum = 0;
        // for (int i : array) {
        //     sum += array[i];

        // }
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.print("Sum Of Element Is: " + sum);

        sc.close();
    }

    public static void main(String[] args) {
        array();
    }
}
