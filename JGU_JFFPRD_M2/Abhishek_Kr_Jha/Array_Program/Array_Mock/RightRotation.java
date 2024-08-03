import java.util.Scanner;

public class RightRotation {
    public static void array() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int asize = sc.nextInt();

        int array[] = new int[asize];

        for(int i = 0; i < array.length; i++){
            System.out.print("enter element at index " + i + ": ");
            array[i] = sc.nextInt();

        }

        for (int i : array) {
            System.out.print(i + ",");
        }

        System.out.println();
        System.out.print("enter the right rotation value: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){

            int j, last;
            last = array[array.length-1];
            for(j = array.length-1; j > 0; j--){
                array[j] = array[j-1];

            }
            array[j] = last;
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
