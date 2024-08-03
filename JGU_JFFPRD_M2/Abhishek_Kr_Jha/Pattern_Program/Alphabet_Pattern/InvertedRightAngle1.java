package JGU_JFFPRD_M2.Abhishek_Kr_Jha.Pattern_Program.Alphabet_Pattern;

public class InvertedRightAngle1 {
    public static void invertedRightAngle(int num) {
        char ch = 'A';
        for(int i = 1; i <= num; i++){
            for(int j = i; j <= num; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println("  ");
        }
        
    }

    public static void main(String[] args) {
        invertedRightAngle(5);
    }
}
