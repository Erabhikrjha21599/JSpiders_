import java.util.Scanner;
public class DecimalToWholeNum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        double d = obj.nextDouble();
        int i =(int)d;
        System.out.println("Its Whole Num is: " + i);
        obj.close();
    }
}
