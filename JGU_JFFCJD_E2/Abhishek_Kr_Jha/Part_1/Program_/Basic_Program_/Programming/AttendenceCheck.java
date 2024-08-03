import java.util.Scanner;
public class AttendenceCheck {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the no of days you present: ");
        int atten = obj.nextInt();
       
        if(atten>=75){
            System.out.println("You are allowed for exam.");
        }else{
            System.out.println("No you are not allowed for exam");
        }

        obj.close();
    }
}
