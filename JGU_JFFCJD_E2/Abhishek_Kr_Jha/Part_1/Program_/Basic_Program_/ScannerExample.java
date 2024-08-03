import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);

        System.out.println("enter the value of integer num_1");
        int num_1 = scanObj.nextInt();
        System.out.println("the value of integer num_1 is:-" + num_1);

        System.out.println("enter the the value of byte num_2");
        byte num_2 = scanObj.nextByte();
        System.out.println("the value of byte num_2 is:-" + num_2);

        System.out.println("enter the the value of short num_3:-");
        short num_3 = scanObj.nextShort(num_2);
        System.out.println("the value of short nume-3 is:-" + num_3);

        System.out.println("enter the value of float num_4");
        float num_4 = scanObj.nextFloat();
        System.out.println("the value of float num_4 is:-" + num_4);

        System.out.println("eneter the value of double num_5:-");
        double num_5 = scanObj.nextDouble();
        System.out.println("the value of double num_5 is:-" + num_5);

        System.out.println("enter the value of string st_1:-");
        String st_1 = scanObj.nextLine();
        System.out.println("the value of string st_1 is:-" + st_1);

        System.out.println("enter the value of string st_2:-");
        String st_2 = scanObj.next();
        System.out.println("the value of St_2 is:-" + st_2);

        


        
    }
}
