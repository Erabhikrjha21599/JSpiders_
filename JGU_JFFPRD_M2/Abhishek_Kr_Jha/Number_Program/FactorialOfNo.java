

import java.util.Scanner;

public class FactorialOfNo {


    Scanner scan_fon = new Scanner(System.in);

    public static void factorialStatic() {

        int fact = 1;
        for (int i = 5; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public void factorialDynamic() {
        
        System.out.println("enter the number: ");
        int num = scan_fon.nextInt();

        int fact_of_no = 1;
        for (int i = 1; i <= num; i++) {
            fact_of_no = fact_of_no * i;
        }
        System.out.println(fact_of_no);
    }

    public static void main(String[] args) {

        FactorialOfNo scan = new FactorialOfNo();

        factorialStatic();
        scan.factorialDynamic();
    }
}
