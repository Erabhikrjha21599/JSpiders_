

import java.util.Scanner;
public class PositiveOrNegative {
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int val = obj.nextInt();

            if(val >= 0){
                    System.out.println("Yes value is +ve.");
            }else{
                System.out.println("No the value is -ve.");
            }

            
        obj.close();
    }
}