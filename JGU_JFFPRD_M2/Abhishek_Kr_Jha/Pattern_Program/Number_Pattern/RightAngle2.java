package JGU_JFFPRD_M2.Abhishek_Kr_Jha.Pattern_Program.Number_Pattern;

public class RightAngle2 {
    public static void rightAngle(int num) {
        int no = 1;
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(no + " ");
                no++;

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rightAngle(5);
        
    }
}
