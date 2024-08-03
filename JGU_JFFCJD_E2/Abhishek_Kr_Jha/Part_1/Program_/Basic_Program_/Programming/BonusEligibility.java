import java.util.Scanner;
public class BonusEligibility {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your year of experience: ");
        int year = obj.nextInt();

        if(year>5){
            System.out.println("Yes you are eligible for bonus and you will get "+ year +"% of your salary as bonus.");
        }else{
            System.out.println("Sorry!......You are not eligible for bounus.");
        }
        obj.close();
    }
    
}
