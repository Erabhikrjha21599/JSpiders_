
import java.util.Scanner;

public class FactorOfNo {

    Scanner scan_s = new Scanner(System.in);

    public void factorStatic() {
        int num = 6;
        int factor = 1;
        while (num > 0) {
            if ( num % factor == 0) {
                System.out.println(factor);
                factor++;
            }
        }
    }

    public void factorDynamic() {
        System.out.println("enter the num: ");
        int num = scan_s.nextInt();
        int factor = 1;
        while (num > 0) {
            if ( num % factor == 0) {
                System.out.println(factor);
                factor++;
            }
        }
    }


    public static void main(String[] args) {

        FactorOfNo scan_c = new FactorOfNo();

        scan_c.factorStatic();
        System.out.println("=================");
       // scan_c.factorDynamic();
    }
}
