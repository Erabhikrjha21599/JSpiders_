import java.util.Scanner;

public class SerchArrayElement {

    public static void array() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of Array: ");
        int asize = sc.nextInt();

        int array[] = new int[asize];

        for(int i = 0; i < array.length; i++){
            System.out.print("Element At Index " + i + ": ");
            array[i] = sc.nextInt();

        }

        System.out.println();
        System.out.println("Print Array Element: ");
        for (int i : array) {
            System.out.print(i + ",");
        }

        System.out.println();
        System.out.println("Enter The Value Of Element: ");
        int aelement = sc.nextInt();
        for(int i = 0; i < array.length; i++){
            if (array[i] == aelement) {
                System.out.println("Element Find At Index " + i + ": " + aelement);
            }
        }

        sc.close();
    }


    public static void main(String[] args) {
        array();
    }
}
