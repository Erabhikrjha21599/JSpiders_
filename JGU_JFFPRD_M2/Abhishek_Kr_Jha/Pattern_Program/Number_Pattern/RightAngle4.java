package JGU_JFFPRD_M2.Abhishek_Kr_Jha.Pattern_Program.Number_Pattern;

public class RightAngle4 {
    public static void rightAngle(int num) {
        int no = 0;
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(no + " ");
                no = 1 - no;

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rightAngle(5);
        
    }
}
