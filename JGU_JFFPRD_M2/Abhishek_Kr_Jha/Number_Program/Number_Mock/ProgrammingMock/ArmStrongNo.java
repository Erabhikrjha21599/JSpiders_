package ProgrammingMock;

import java.util.Scanner;

public class ArmStrongNo {
    public static void armstrong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number: ");
        int n = sc.nextInt();

        int temp, digits = 0, last = 0, sum = 0;
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp = temp / 10;
        }

        if (n == sum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        sc.close();
    }

    public static void main(String[] args) {
        armstrong();
    }
}
