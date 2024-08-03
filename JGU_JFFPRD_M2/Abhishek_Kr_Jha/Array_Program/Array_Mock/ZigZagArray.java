import java.util.Scanner;

public class ZigZagArray {

    public static void array() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of Array1: ");
        int asize1 = sc.nextInt();

        int array1[] = new int[asize1];
        
        System.out.println("Enter The Array1 Element: ");
        for(int i = 0; i < array1.length; i++){
            System.out.print("Enter Element At Index " + i + ": ");
            array1[i] = sc.nextInt();

        }

        System.out.println("Print Array1");
        for (int i : array1) {
            System.out.print(i + ",");

        }

        System.out.println();
        System.out.println("Enter The Size Of Array2: ");
        int asize2 = sc.nextInt();

        int array2[] = new int[asize2];

        System.out.println("Enter The Array2 Element: ");
        for(int i = 0; i < array2.length; i++){
            System.out.print("Enter Element At Index " + i + ": ");
            array2[i] = sc.nextInt();

        }

        System.out.println("Print Array2");
        for (int i : array2) {
            System.out.print(i + ",");

        }

        System.out.println();
        System.out.println("Array3 ");

        int array3[] = new int[array1.length + array2.length];

        int k = 0;
        for(int i = 0; i < array3.length; i++){
            if(i < array1.length){
                array3[k++] = array1[i];
            }
            if (i < array2.length) {
                array3[k++] = array2[i];

            }
        }

        System.out.println("Print Zig-Zag Array3");
        for (int i : array3) {
            System.out.print(i + ",");

        }


        sc.close();
    }
    
    public static void main(String[] args) {
        array();
    }
}
