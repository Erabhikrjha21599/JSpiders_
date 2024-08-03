import java.util.Scanner;

public class DublicateElement {
    public static void array() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int asize = sc.nextInt();

        int array[] = new int[asize];

        for(int i = 0; i < array.length; i++){
            System.out.print("enter array element at index " + i + ": ");
            array[i] = sc.nextInt();

        }

        System.out.println("print array element: ");
        for (int i : array) {
            System.out.print(i + ",");

        }

        System.out.println();
        System.out.println("find dublicate element: ");
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if (array[i] == array[j]) {
                    System.out.println(array[j]);
                }

            }
        }



        sc.close();


    }

    public static void main(String[] args) {
        array();
    }
}
