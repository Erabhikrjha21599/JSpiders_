import java.util.Scanner;

public class InputFromUser {

    public static void array() {
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

        
        sc.close();
    }

    public static void main(String[] args) {
        array();
    }
}
