
import java.util.Scanner;
public class MultipleOf8 {
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int val = obj.nextInt();

            if(val % 8 == 0){
                    System.out.println("Yes value is the Multiple of 8.");
            }else{
                System.out.println("No it is not the multiple of 8");
            }

            
        obj.close();
    }
}