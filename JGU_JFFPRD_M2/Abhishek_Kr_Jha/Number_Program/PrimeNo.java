import java.util.Scanner;

public class PrimeNo {

    Scanner scan_s = new Scanner(System.in);

    public void primeStatic() {
        int count = 0;
        int num = 5;

        for(int i = 1; i<= num; i++){
            if(num % i == 0){
                count++;
            }
        }

        if (count == 2) {
            System.out.println("prime");
            
        }
        else{
            System.out.println("not prime");
        }
    }

    public void primeDynamic() {
        
        System.out.println("enter the num: ");
        int num = scan_s.nextInt();

        int count = 0;
        for(int i = 1; i<= num; i++){
            if(num % i == 0){
                count++;
            }
        }

        if (count == 2) {
            System.out.println("prime");
            
        }
        else{
            System.out.println("not prime");
        }
    }


    
    public static void main(String[] args) {
        PrimeNo scan_c = new PrimeNo();

        scan_c.primeStatic();
        System.out.println("===============");
        scan_c.primeDynamic();
    }
}
