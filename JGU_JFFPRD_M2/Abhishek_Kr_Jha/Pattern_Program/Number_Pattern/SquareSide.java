package JGU_JFFPRD_M2.Abhishek_Kr_Jha.Pattern_Program.Number_Pattern;

public class SquareSide {

    public static void squareSide(int num) {
        int no = 1;
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                if(i == 1 || i == 5){
                    System.out.print(no + " ");
                    no++;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        squareSide(5);
    }
}
