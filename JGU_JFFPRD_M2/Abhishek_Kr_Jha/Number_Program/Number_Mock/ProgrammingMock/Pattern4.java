package ProgrammingMock;

import java.util.Scanner;

public class Pattern4 {
    
    public static void pattern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter vlaue of n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i ++){
            for(int j = 1; j <= n; j++){
                if ( i == 1 || i == 5 || i == j || i + j == n + 1) {
                    System.out.print("* ");

                }
                else{
                   System.out.print("  ");

                }

            }
            System.out.println();
           
        }
        
    }

    public static void main(String[] args) {
        pattern();
        
    }
    
}
