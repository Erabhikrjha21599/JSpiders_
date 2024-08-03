package Abhishek_Kr_Jha.Part_1.Program_.Basic_Program_;

public class AutomorphicNo {

    public static void automorphicNo(int number) {
        int length = ("" +number).length();
        int sqr_of_no = number * number;
        
        int end_of_no = sqr_of_no % (int)Math.pow(10, length);

        if (number == end_of_no) {
            System.out.println("automorphic");
            
        } else {
            System.out.println("not automorphic");
            
        }

    }

    public static void main(String[] args) {
        automorphicNo(376);

    }
}
