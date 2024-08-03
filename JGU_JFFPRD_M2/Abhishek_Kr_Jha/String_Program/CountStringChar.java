import java.util.Scanner;

public class CountStringChar {

    public static void main(String[] args) {

        
        // String s = "hello";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of String: ");
        String s = sc.nextLine();

        int count = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z'){
                count++;
            }
        }
        System.out.println(count);
    }
}
