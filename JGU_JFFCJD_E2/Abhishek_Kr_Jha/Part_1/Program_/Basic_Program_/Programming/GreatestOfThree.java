
import java.util.Scanner;
public class GreatestOfThree {

    public static void main(String[] args) {
        
    
    Scanner obj = new Scanner(System.in);

    System.out.print("Enter the Num1: ");
    int num1 = obj.nextInt();
    System.out.print("Enter the Num2: ");
    int num2 = obj.nextInt();
    System.out.print("Enter the Num3: ");
    int num3 = obj.nextInt();

    if (num1 >= num2 && num1>=num3) {
        System.out.println("Num1 is greatest.");
    }else if( num2>= num1 && num2>= num3){
        System.out.println("Num2 is greatest.");
    }else
    {
        System.out.println("Num3 is greatest.");
    }
        obj.close();

 }
}

