import java.util.Scanner;
public class CharCaseCheck {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter any char: ");
        char ch = obj.next().charAt(0);

        if(ch>=65 && ch<=90){
            System.out.println("Character is in UPPERCASE. ");
        }else if(ch>=97 && ch<=122){
            System.out.println("Character is in LOWERCASE.");
        }else{
            System.out.println("Not a char");
        }
        obj.close();
    }
    
}   
    

