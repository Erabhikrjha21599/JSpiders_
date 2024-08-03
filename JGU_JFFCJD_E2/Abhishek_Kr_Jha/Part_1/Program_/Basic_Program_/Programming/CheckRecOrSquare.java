import java.util.Scanner;
public class CheckRecOrSquare {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter side1 one1: ");
        double side1 = obj.nextDouble();

        System.out.print("Enter side2 one1: ");
        double side2 = obj.nextDouble();

        if(side1 == side2){
            System.out.println("It is a Square.");
        }else 
        {
            System.out.println("It is rectangle.");
        }

        obj.close();
    }
}
