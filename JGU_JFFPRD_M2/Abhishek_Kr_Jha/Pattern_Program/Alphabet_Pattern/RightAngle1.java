package JGU_JFFPRD_M2.Abhishek_Kr_Jha.Pattern_Program.Alphabet_Pattern;

public class RightAngle1 {
    public static void RightAngle(int num) {
        char ch = 'A';
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(ch + " ");
                
            }
            System.out.println("  ");
            ch++;
        }
        
    }

    public static void main(String[] args) {
        RightAngle(5);
    }
}
