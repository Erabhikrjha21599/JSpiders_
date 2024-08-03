package JGU_JFFPRD_M2.Abhishek_Kr_Jha.Pattern_Program.Number_Pattern;

public class AlternamteRightAngle3 {
    public static void alternateRightAngle(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("0 ");

                } else {
                    System.out.print("1 ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        alternateRightAngle(5);

    }
}
