package ProgrammingMock;

import java.util.Scanner;

public class Pattern3 {
    public static void pattern3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the vlaue the n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if ( ( i + j) % 2 == 0) {
                    System.out.print("0 ");
                    
                } else {
                    System.out.print("1 ");
                    
                }


            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern3();
    }
}
