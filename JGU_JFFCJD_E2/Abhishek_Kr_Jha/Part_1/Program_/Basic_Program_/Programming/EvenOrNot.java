
import java.util.Scanner;
public class EvenOrNot {
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int val = obj.nextInt();

            if(val % 2 == 0){
                    System.out.println("Yes value is even.");
            }else{
                System.out.println("No it is odd.");
            }

            
        obj.close();
    }
}
