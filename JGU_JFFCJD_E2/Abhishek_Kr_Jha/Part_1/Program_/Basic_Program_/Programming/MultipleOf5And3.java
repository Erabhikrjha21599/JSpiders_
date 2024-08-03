
import java.util.Scanner;
public class MultipleOf5And3 {
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int val = obj.nextInt();

            if(val % 5 == 0 && val % 3 == 0){
                    System.out.println("Yes value is the Multiple of 5 and 3.");
            }else{
                System.out.println("No it is not the multiple of 5 and 3");
            }

            
        obj.close();
    }
}