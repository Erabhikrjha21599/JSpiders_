import java.util.Scanner;
public class DivisibleBy6 {
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int val = obj.nextInt();

            if(val % 6 == 0){
                    System.out.println("Yes value is divisible by 6.");
            }else{
                System.out.println("No it is not divisible by 6");
            }

            
        obj.close();
    }
}
