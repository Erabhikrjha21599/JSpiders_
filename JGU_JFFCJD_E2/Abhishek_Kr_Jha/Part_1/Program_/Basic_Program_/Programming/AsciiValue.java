import java.util.Scanner;
public class AsciiValue {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Character: ");
        char ch = obj.next().charAt(0);
        int val = ch;
            System.out.println(val);
        obj.close();
    }
}
