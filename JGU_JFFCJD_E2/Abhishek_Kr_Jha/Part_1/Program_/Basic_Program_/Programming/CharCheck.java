import java.util.Scanner;
public class CharCheck {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter any char: ");
        char ch = obj.next().charAt(0);

        if(ch>=65 && ch<=90 || ch>=97 && ch<=122){
            System.out.println("Character is an alphabet. ");
        }else if(ch>=48 && ch<=57){
            System.out.println("it is a number.");
        }else{
            System.out.println("it is special char");
        }
        obj.close();
    }
    
}
