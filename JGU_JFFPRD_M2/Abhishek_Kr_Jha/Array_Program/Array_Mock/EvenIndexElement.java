import java.util.Scanner;

public class EvenIndexElement {
    public static void array() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array: ");
        int asize = sc.nextInt();

        int array[] = new int[asize];

        for(int i = 0; i < array.length; i++){
            System.out.print("enter element at index " + i + ": ");
            array[i] = sc.nextInt();

        }

        System.out.println();
        System.out.println("print array: ");
        for (int i : array) {
            System.out.print(i + ",");
        }

        System.out.println();
        System.out.println("print even index element: ");
        for(int i = 1; i < array.length; i = i + 2 ){
            System.out.print(array[i] + ",");
        }


        sc.close();
    }

    public static void main(String[] args) {
        array();
    }
}
