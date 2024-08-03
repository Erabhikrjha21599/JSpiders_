import java.util.Scanner;

public class OddIndexElement {
    public static void array() {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of array: ");
        int asize = sc.nextInt();

        int array[] = new int[asize];

        for(int i = 0; i < array.length; i++){
            System.out.print("element at index " + i + ": ");
            array[i] = sc.nextInt();

        }

        System.out.println("print array: ");
        for (int i : array) {
            System.out.print(i + ",");
            
        }

        System.out.println();
        System.out.println("print odd index element: ");
        for(int i = 0; i < array.length; i = i + 2){
            System.out.print(array[i] + ",");

        }

        sc.close();


    }

    public static void main(String[] args) {
        array();
    }
}
