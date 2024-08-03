package JGU_JFFPRD_M2.Abhishek_Kr_Jha.Pattern_Program.Alphabet_Pattern;

public class HollowSquare1 {
    public static void hollowSquare(int num) {
        char ch = 'A';
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if ( i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print(ch + " ");
                    ch++;
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        hollowSquare(5);

    }
}
