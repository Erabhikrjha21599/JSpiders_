import java.util.Scanner;

public class MoveZero {
    public static void array1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array1: ");
        int asize = sc.nextInt();

        int array1[] = new int[asize];

        for(int i = 0; i < array1.length; i++){
            System.out.print("enter array1 element at index " + i + ": ");
            array1[i] = sc.nextInt();

        }

        System.out.println("print array1: ");
        for (int i : array1) {
            System.out.print(i + ",");

        }

        int array2[] = new int[array1.length];
        int k = 0;
        for(int i = 0; i < array1.length; i++){
            if(array1[i] != 0){
                array2[k++] = array1[i];

            }
        }

        System.out.println("print move zero array1: ");
        for (int i : array2) {
            System.out.print(i + ",");

        }

        sc.close();
    }

    public static void main(String[] args) {
        array1();
    }
}
