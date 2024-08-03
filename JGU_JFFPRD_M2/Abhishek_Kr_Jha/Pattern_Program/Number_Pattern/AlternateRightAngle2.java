package JGU_JFFPRD_M2.Abhishek_Kr_Jha.Pattern_Program.Number_Pattern;

public class AlternateRightAngle2 {
    public static void alternaterightAngle(int num) {
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                if(j % 2 == 0){
                    System.out.print("0 ");

                }else{
                    System.out.print("1 ");
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        alternaterightAngle(5);
        
    }
}
