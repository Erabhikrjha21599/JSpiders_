
import java.util.Scanner;
public class PeriSquare {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        double side = obj.nextDouble();
        double perimeter = side * side;
        System.out.println("Peri of square is:" + perimeter);

        obj.close();
    }
}
