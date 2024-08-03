package JGU_JFFPRD_M2.Abhishek_Kr_Jha.Pattern_Program.Star_Pattern;

public class InvertedRightAngle1 {
    public static void invertedRightAngle(int num) {
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            for(int j = i; j <= num; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        invertedRightAngle(5);
    }
}
