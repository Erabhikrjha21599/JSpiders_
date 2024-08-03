import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the int value: ");
        int a = obj.nextInt();
        System.out.println("Entered int value is:"+a);

        // System.out.print("Enter the float value: ");
        // float f = obj.nextFloat();
        // System.out.println("Entered Float value is:"+f);

        // System.out.print("Enter the long value: ");
        // long l = obj.nextLong();
        // System.out.println("Entered int value is:"+l);

        // System.out.print("Enter the double value: ");
        // double d = obj.nextDouble();
        // System.out.println("Entered int value is:"+d);

        System.out.print("Enter the String value: ");
        String  s = obj.nextLine();
        System.out.println("Entered woeds is:"+s);



        obj.close();
    }
    
}
