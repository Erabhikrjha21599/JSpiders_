import java.util.Scanner;
public class AgeOfThreePerson {

    public static void main(String[] args) {
        
    
    Scanner obj = new Scanner(System.in);

    System.out.println("Enter the age of first Person: ");
    int age1 = obj.nextInt();
    System.out.println("Enter the age of 2nd Person: ");
    int age2 = obj.nextInt();
    System.out.println("Enter the age of 3rd Person: ");
    int age3 = obj.nextInt();

    if (age1 >= age2 && age1>=age3) {
        System.out.println("First Person is older than all");
    }else if( age2>= age1 && age2>= age3){
        System.out.println("Person 2 is older than all.");
    }else
    {
        System.out.println("Person 3rd is older than all.");
    }
        obj.close();

 }
}
