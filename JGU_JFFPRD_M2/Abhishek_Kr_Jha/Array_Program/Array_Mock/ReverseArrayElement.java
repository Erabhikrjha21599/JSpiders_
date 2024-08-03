import java.util.Scanner;

public class ReverseArrayElement {
    
    public static void array() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of Array: ");
        int asize = sc.nextInt();

        int array[] = new int[asize];

        for(int i = 0; i < array.length; i++){
            System.out.print("Element At Index " + i + ": ");
            array[i] = sc.nextInt();

        }

        System.out.println("Print Array Element: ");
        for (int i : array) {
            System.out.print(i + ",");

        }

        System.out.println("Print Reverse Array Element: ");
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int swap = array[start];
            array[start] = array[end];
            array[end] = swap;
            start++;
            end--;
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
