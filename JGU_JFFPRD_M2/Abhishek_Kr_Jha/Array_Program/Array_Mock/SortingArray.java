import java.util.Scanner;

public class SortingArray {

    public static void array() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array: ");
        int asize = sc.nextInt();

        int array[] = new int[asize];

        for(int i = 0; i < array.length; i++){
            System.out.print("enter array element at index " + i + ": ");
            array[i] = sc.nextInt();

        }

        System.out.print("Print Array before Sorting: ");
        for (int i : array) {
            System.out.print(i + ",");
        }

        System.out.println();
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length - 1; j++){
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.print("Print Array after Sorting: ");
        for (int i : array) {
            System.out.print(i + ",");
        }
        
        sc.close();
    }

    public static void main(String[] args) {
        array();
    }
}
