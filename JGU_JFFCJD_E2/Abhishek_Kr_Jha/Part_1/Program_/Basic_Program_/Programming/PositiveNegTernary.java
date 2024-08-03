
import java.util.Scanner;
public class PositiveNegTernary {
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int val = obj.nextInt();
        

          System.out.println(val>= 0 ? "+ve": "-ve");  

            
        obj.close();
    }
}
