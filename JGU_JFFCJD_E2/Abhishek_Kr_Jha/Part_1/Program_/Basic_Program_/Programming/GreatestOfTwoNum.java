
import java.util.Scanner;
public class GreatestOfTwoNum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Num1: ");
        double num1 = obj.nextDouble();

        System.out.print("Enter num2: ");
        double num2 = obj.nextDouble();
        if (num1>num2) {
            System.out.println("Num 1 is greater than Num2");
        }else{
            System.out.println("Num2 is greater than Num1.");
        }
        obj.close();
    }
}
